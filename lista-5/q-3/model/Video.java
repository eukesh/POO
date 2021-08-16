package model;

import exception.NomeInvalidoException;

public class Video extends Arquivo{
    private Qualidade qualidade;

    public Video(String nome) throws NomeInvalidoException {
        super(nome);
        super.setEstensao(".mp4");
    }

    public void setQualidade(Qualidade qualidade) {
        this.qualidade = qualidade;
    }

    public Qualidade getQualidade() {
        return qualidade;
    }

    @Override
    public String toString() {
        return super.getNome()+super.getEstensao()+
                "\n\t"+"Qualidade: "+qualidade;

    }
}
