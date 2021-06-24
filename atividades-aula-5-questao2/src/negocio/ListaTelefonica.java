package negocio;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import dados.Contato;

public class ListaTelefonica {
    private Map<Character, List<Contato>> listaContatos = new HashMap<Character, List<Contato>>();

    public ListaTelefonica() {
        for (char i = 65; i < 91; i++) {
            List<Contato> lista = new ArrayList<Contato>();
            listaContatos.put(i, lista);
        }
    }

    public void adicionarContato(Contato contato) {
        String nome = contato.getNome().toUpperCase();
        List<Contato> contatosTemp = listaContatos.get(nome.charAt(0));
        contatosTemp.add(contato);
    }

    public void removerContato(Contato contato) {
        String nome = contato.getNome().toUpperCase();
        listaContatos.get(nome.charAt(0)).remove(contato);
    }

    public List<Contato> buscarContatos(char letra) {
        return listaContatos.get(Character.toUpperCase(letra));
    }

    public Map<Character, List<Contato>> buscarContatos() {
        return listaContatos;
    }

}
