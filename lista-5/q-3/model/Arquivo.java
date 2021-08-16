package model;

import exception.NomeInvalidoException;

public abstract class Arquivo {
    private String nome;
    private String extensao;

    public Arquivo(String nome) throws NomeInvalidoException {
        if(nome.length()<10){
            throw new NomeInvalidoException("O nome não possui o número mínimo de caracteres");
        }else if(nome.length()>256){
            throw new NomeInvalidoException("O nome excede o número máximo de caracteres");
        }else if(nome.contains("\n") || nome.contains("(") || nome.contains(")") || nome.contains("[") || nome.contains("]") || nome.contains("\'") || nome.contains("\"")){
            throw new NomeInvalidoException("Caractere inválido");
        }
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEstensao(String estensao) {
        this.extensao = estensao;
    }

    public String getEstensao() {
        return extensao;
    }
}
