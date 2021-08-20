package view;

import model.Contato;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class PessoaTableModel extends AbstractTableModel {

	List<Contato> pessoas;
	private String[] colunas = {"id", "Nome", "Telefone"};

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public int getRowCount() {

		return pessoas.size();
	}
	
	public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
	
	public boolean isCellEditable(int linha, int coluna) {
	    if (coluna < 1) {
	    	return false;
	    } 
	    else {
	    	return true;
	    }
	}
	
	public void setValueAt(Object valor, int linha, int coluna) {

		switch (coluna) {
			case 0:
				pessoas.get(linha).setId((int) valor);
				break;
			case 1:
				pessoas.get(linha).setNome((String) valor);
				break;
			case 2:
				pessoas.get(linha).setTelefone((int) valor);
				break;
		}
		fireTableCellUpdated(linha, coluna);
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		switch(coluna){
			case 0: return pessoas.get(linha).getId();
			case 1: return pessoas.get(linha).getNome();
			case 2: return pessoas.get(linha).getTelefone();
		}
		return null;
	}

    public String getColumnName(int num){
        return this.colunas[num];
    }
 
	public PessoaTableModel(List<Contato> p) {
		pessoas = p;
	}
}
