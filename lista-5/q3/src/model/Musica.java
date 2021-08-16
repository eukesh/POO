package model;

import exception.NomeInvalidoException;

public class Musica extends Arquivo{
    private int duracao;

    public Musica(String nome) throws NomeInvalidoException {
        super(nome);
        super.setEstensao(".mp3");
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.getNome()+super.getEstensao()+
                "\n\t"+"Duracao: "+this.duracao;
    }

}
