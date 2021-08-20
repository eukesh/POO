package view;

import dados.Fatoriais;
import dados.Fibonacci;
import dados.Gerador;
import dados.NumeroPrimos;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Teste extends JFrame{
    private Gerador gerador;
    private List<Integer> result = new ArrayList<>();
    private JPanel mainPanel;
    private JPanel topPanel;
    private JTextField numberField;
    private JPanel midPanel;
    private JButton fibboButton;
    private JPanel bottomPanel;
    private JButton fatorialButton;
    private JPanel bottomPanel2;
    private JLabel testeLabel;
    private JTable table1;
    private JPanel buttomPanel;
    private JButton primoButton;

    public Teste(String title)  {

        super(title);

        createTable();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();


        fibboButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = numberField.getText();
                gerador = new Fibonacci();
                gerador.gerar(Integer.parseInt(num));
                result.clear();
                result.addAll(gerador.getSequencia());
                createTable();
                numberField.setText("");
            }
        });
        primoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = numberField.getText();
                gerador = new NumeroPrimos();
                gerador.gerar(Integer.parseInt(num));
                result.clear();
                result.addAll(gerador.getSequencia());
                createTable();
                numberField.setText("");
            }
        });
        fatorialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = numberField.getText();
                gerador = new Fatoriais();
                gerador.gerar(Integer.parseInt(num));
                result.clear();
                result.addAll(gerador.getSequencia());
                createTable();
                numberField.setText("");
            }
        });
    }

    private void createTable()  {
        Object[][] data = new Object[result.size()][1];

        for (int i = 0; i < result.size(); i++) {
            int a = result.get(i);
            data[i][0] = a;
        }

        table1.setModel(new DefaultTableModel( data, new String[]{"Resultado"}));
    }



    public static void main(String[] args)  {
        JFrame frame = new Teste("teste");
        frame.setVisible(true);
    }
}
