package negocio;

import java.util.List;
import java.util.Map;

import dados.Contato;
import exceptions.ContatoJaCadastradoException;
import exceptions.ContatoNaoCadastradoException;
import exceptions.ErroNaGravacaoException;
import exceptions.ErroNaLeituraException;
import persistencia.ContatoDAO;

public class ListaTelefonica {
    private ContatoDAO contatoDAO = new ContatoDAO();

    public void adicionarContato(Contato contato) throws ContatoJaCadastradoException, ErroNaLeituraException, ErroNaGravacaoException {
        contatoDAO.insert(contato);
    }

    public void removerContato(Contato contato) throws ContatoNaoCadastradoException, ErroNaLeituraException, ErroNaGravacaoException {
        contatoDAO.delete(contato);
    }

    public List<Contato> buscarContatos(char letra) throws ErroNaLeituraException {
        return contatoDAO.getAll().get(Character.toUpperCase(letra));
    }

    public Map<Character, List<Contato>> buscarContatos() throws ErroNaLeituraException {
        return contatoDAO.getAll();
    }

}
