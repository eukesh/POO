package persistencia;

import java.util.*;

import dados.Contato;

public class ContatoDAO {
    private ArquivoContatoDAO arquivoContatoDAO = new ArquivoContatoDAO();

    public void insert(Contato pessoa) {
        arquivoContatoDAO.salvaPessoaArquivo(pessoa);
    }

    public void delete(Contato pessoa) {

        List<Contato> pessoas = new LinkedList<Contato>();
        for(Contato x : arquivoContatoDAO.lePessoasArquivo()){
            if(x.getTelefone() == pessoa.getTelefone()){
                continue;
            }else{
                pessoas.add(x);
            }
        }
        /*
        List<Contato> pessoas = arquivoContatoDAO.lePessoasArquivo();
        pessoas.remove(pessoa);*/
        arquivoContatoDAO.salvaPessoasArquivo(pessoas);
    }

    public Map<Character, List<Contato>> getAll() {
        Map<Character, List<Contato>> mapContatos = new HashMap<Character, List<Contato>>();
        for(char i = 65; i<91;i++){
            List<Contato> lista = new LinkedList<Contato>();
            mapContatos.put(i,lista);
        }
        List<Contato> ListContatos = arquivoContatoDAO.lePessoasArquivo();
        for(Contato c : ListContatos){
            String nome = c.getNome().toUpperCase();
            List<Contato> contatosTemp = mapContatos.get(nome.charAt(0));
            contatosTemp.add(c);
        }

        return mapContatos;
    }
}
