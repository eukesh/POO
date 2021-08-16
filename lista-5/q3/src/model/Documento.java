package model;

import exception.NomeInvalidoException;

public class Documento extends Arquivo{
    private String texto;

    public Documento(String nome) throws NomeInvalidoException {
        super(nome);
        super.setEstensao(".txt");
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return super.getNome()+super.getEstensao();
    }
}
