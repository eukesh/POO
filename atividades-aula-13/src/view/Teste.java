package view;

import controller.ListaTelefonica;
import exceptions.*;
import model.Contato;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Teste extends JFrame {
    private ListaTelefonica lista = new ListaTelefonica("toor");
    private JPanel mainPanel;
    private JPanel topPanel;
    private JTextField fieldNome;
    private JLabel labelNome;
    private JTextField fieldTelefone;
    private JLabel labelTelefone;
    private JButton buttonSalvar;
    private JPanel midPanel;
    private JPanel bottomPanel;
    private JPanel bottomPanel2;
    private JLabel testeLabel;
    private JTable table1;


    public Teste(String title) throws SQLException, SelectException, ClassNotFoundException {

        super(title);

        createTable();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        buttonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = fieldNome.getText();
                String telefone = fieldTelefone.getText();
                try {
                    lista.adicionarContato(new Contato(nome,Integer.parseInt(telefone)));
                    JOptionPane.showMessageDialog(null,"Contato adicionado com Sucesso!");
                } catch (ContatoJaCadastradoException | ErroNaLeituraException | ErroNaGravacaoException | InsertException | SelectException ex) {
                    JOptionPane.showMessageDialog(null,"Erro ao adicionar Contato!");
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,"Digite um número de telefone válido!");
                }

                try {
                    createTable();
                } catch (SQLException | SelectException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                }

                fieldNome.setText("");
                fieldTelefone.setText("");

            }
        });
    }

    private void createTable() throws SQLException, SelectException, ClassNotFoundException {
        PessoaTableModel pessoaTableModel = new PessoaTableModel(criaListaPessoa());
        table1.setModel(pessoaTableModel);
    }

    private List<Contato> criaListaPessoa() throws SQLException, SelectException, ClassNotFoundException {
        List<Contato> pessoas = new ArrayList<>();

        try{
            lista.buscarContatos().forEach((key, value) -> {
                System.out.println(key + ": ");
                pessoas.addAll(value);
            });
        }catch (ErroNaLeituraException | SelectException e){
            System.out.println(e.getMessage());
        }

        return pessoas;
    }

    public static void main(String[] args) throws SQLException, SelectException, ClassNotFoundException {
        JFrame frame = new Teste("teste");
        frame.setVisible(true);
    }
}
