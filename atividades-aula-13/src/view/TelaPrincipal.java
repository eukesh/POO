package view;

import exceptions.ErroNaLeituraException;
import exceptions.SelectException;
import model.Contato;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static view.Main.contatos;

public class TelaPrincipal extends JFrame {
	JTabbedPane pane;
	JPanel painel1, painel2;
	JTable tabela1;
	view.PessoaTableModel pessoaTableModel;
	view.TelaCadastro telaCadastro;
	
	public TelaPrincipal() {
		pane = new JTabbedPane();
		
		painel1 = new JPanel();
		painel2 = new JPanel();
		
		painel1.add(new JLabel("Aba 1"));
		painel2.add(telaCadastro);

		
		pessoaTableModel = new view.PessoaTableModel(criaListaPessoa());
		
		tabela1 = new JTable();
		tabela1.setModel(pessoaTableModel);



		tabela1.setFillsViewportHeight(true);
		
		pane.addTab("Aba 1",null,tabela1,"Aba 1");
		pane.addTab("Aba 2",null,painel2,"Aba 2");

		Container c = getContentPane();
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.add(pane, BorderLayout.CENTER);
	}
	
	private List<Contato> criaListaPessoa() {
		List pessoas = new ArrayList<Contato>();

		try{
			contatos.buscarContatos().forEach((key, value) -> {
				System.out.println(key + ": ");
				for (Contato x : value) {
					pessoas.add(x);
				}
			});
		}catch (ErroNaLeituraException | SelectException e){
			System.out.println(e.getMessage());
		}

		return pessoas;
	}
	
}
