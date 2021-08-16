package controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import database.Conexao;
import database.ContatoDAO;
import exceptions.*;
import model.Contato;

public class ListaTelefonica {
    private ContatoDAO contatoDAO;

    public ListaTelefonica(String senha) throws ClassNotFoundException, SQLException, SelectException{
        Conexao.setSenha(senha);
        contatoDAO = ContatoDAO.getInstace();
    }

    public void adicionarContato(Contato contato) throws ContatoJaCadastradoException, ErroNaLeituraException, ErroNaGravacaoException, InsertException, SelectException {
        contatoDAO.insert(contato);
    }

    public void removerContato(Contato contato) throws ContatoNaoCadastradoException, ErroNaLeituraException, ErroNaGravacaoException, DeleteException {
        contatoDAO.delete(contato);
    }

    public void atualizaContato(Contato contato) throws UpdateException {
        contatoDAO.update(contato);
    }

    public List<Contato> buscarContatos(char letra) throws ErroNaLeituraException, SelectException {
        return contatoDAO.getAll().get(Character.toUpperCase(letra));
    }

    public Map<Character, List<Contato>> buscarContatos() throws ErroNaLeituraException, SelectException {
        return contatoDAO.getAll();
    }

}
