package negocio;

import java.util.List;
import java.util.Map;

import dados.Contato;
import persistencia.ContatoDAO;

public class ListaTelefonica {
    private ContatoDAO contatoDAO = new ContatoDAO();

    public void adicionarContato(Contato contato) {
        contatoDAO.insert(contato);
    }

    public void removerContato(Contato contato) {
        contatoDAO.delete(contato);
    }

    public List<Contato> buscarContatos(char letra) {
        return contatoDAO.getAll().get(Character.toUpperCase(letra));
    }

    public Map<Character, List<Contato>> buscarContatos() {
        return contatoDAO.getAll();
    }

}
