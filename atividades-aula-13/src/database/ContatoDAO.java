package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import exceptions.*;
import model.Contato;

public class ContatoDAO {

    private static ContatoDAO instance = null;

    private PreparedStatement selectNewId;
    private PreparedStatement select;
    private PreparedStatement insert;
    private PreparedStatement delete;
    private PreparedStatement update;
    private PreparedStatement selectAll;

    public static ContatoDAO getInstace() throws ClassNotFoundException, SQLException, SelectException{
        if(instance == null){
            instance = new ContatoDAO();
        }
        return instance;
    }

    private ContatoDAO() throws ClassNotFoundException, SQLException, SelectException{
        Connection conexao = Conexao.getConexao();
        selectNewId = conexao.prepareStatement("select nextval('id_contato')");
        insert = conexao.prepareStatement("insert into contato values(?,?,?)");
        select = conexao.prepareStatement("select * from contato where id = ?");
        update = conexao.prepareStatement("update contato set nome = ?, telefone = ? where id = ?");
        delete = conexao.prepareStatement("delete from contato where id=?");
        selectAll = conexao.prepareStatement("select * from contato");
    }

    private int selectNewId() throws SelectException{
        try{
            ResultSet rs = selectNewId.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
        }catch (SQLException e){
            throw new SelectException("Erro ao buscar novo id na tabela contato");
        }
        return 0;
    }

    public void insert(Contato contato) throws InsertException, SelectException{
        try{
            insert.setInt(1,selectNewId());
            insert.setString(2,contato.getNome());
            insert.setInt(3,contato.getTelefone());
            insert.executeUpdate();

        }catch (SQLException e){
            throw new InsertException("Erro ao inserir contato");
        }
    }

    public Contato select(int idContato) throws SelectException{
        try{
            select.setInt(1,idContato);
            ResultSet rs = select.executeQuery();
            if(rs.next()){
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                int telefone  = rs.getInt(3);
                return new Contato(id,nome,telefone);
            }
        }catch (SQLException e){
            throw new SelectException("Erro ao buscar contato do ID");
        }
        return null;
    }

    public void update(Contato contato ) throws UpdateException{
        try{
            update.setString(1,contato.getNome());
            update.setInt(2,contato.getTelefone());
            update.setInt(3,contato.getId());
            System.err.println(update);
            update.executeUpdate();
        }catch (SQLException e){
            throw new UpdateException("Erro ao atualizar contato");
        }
    }

    public void delete(Contato contato) throws DeleteException{
        try {
            delete.setInt(1,contato.getId());
            delete.executeUpdate();
        }catch (SQLException e){
            throw new DeleteException("Erro ao deletar contato");
        }
    }

    public Map<Character, List<Contato>> getAll() throws SelectException {
        Map<Character, List<Contato>> mapContatos = new HashMap<Character, List<Contato>>();

        try{

            for(char i = 65; i<91;i++){
                List<Contato> lista = new LinkedList<Contato>();
                mapContatos.put(i,lista);
            }

            ResultSet rs = selectAll.executeQuery();
            List<Contato> ListContatos = new ArrayList<Contato>();

            while (rs.next()){
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                int telefone = rs.getInt(3);
                ListContatos.add(new Contato(id,nome,telefone));
            }
            for(Contato c : ListContatos){
                String nome = c.getNome().toUpperCase();
                List<Contato> contatosTemp = mapContatos.get(nome.charAt(0));
                contatosTemp.add(c);
            }

            return mapContatos;

        }catch (SQLException e){
            throw new SelectException("Erro ao buscar contatos");
        }

    }
}
