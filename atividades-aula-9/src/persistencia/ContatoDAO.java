package persistencia;

import java.util.*;

import dados.Contato;
import exceptions.ContatoJaCadastradoException;
import exceptions.ContatoNaoCadastradoException;
import exceptions.ErroNaGravacaoException;
import exceptions.ErroNaLeituraException;

public class ContatoDAO {
    private ArquivoContatoDAO arquivoContatoDAO = new ArquivoContatoDAO();

    public void insert(Contato pessoa) throws ErroNaGravacaoException, ContatoJaCadastradoException, ErroNaLeituraException {
        List<Contato> contatos = arquivoContatoDAO.lePessoasArquivo();
        if(!contatos.contains(pessoa)){
            contatos.add(pessoa);
            arquivoContatoDAO.salvaPessoasArquivo(contatos);
        }else{
            throw new ContatoJaCadastradoException();
        }
    }

    public void delete(Contato pessoa) throws ContatoNaoCadastradoException, ErroNaLeituraException, ErroNaGravacaoException {

        List<Contato> contatos = arquivoContatoDAO.lePessoasArquivo();

        if(contatos.contains(pessoa)){
            contatos.remove(pessoa);
            arquivoContatoDAO.salvaPessoasArquivo(contatos);
        }else{
            throw new ContatoNaoCadastradoException();
        }

        /*
        List<Contato> pessoas = new LinkedList<Contato>();
        for(Contato x : arquivoContatoDAO.lePessoasArquivo()){
            if(x.getTelefone() == pessoa.getTelefone()){
                continue;
            }else{
                pessoas.add(x);
            }
        }

        arquivoContatoDAO.salvaPessoasArquivo(pessoas);*/
    }

    public Map<Character, List<Contato>> getAll() throws ErroNaLeituraException {
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
