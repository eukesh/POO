package model;

import java.util.Objects;

public class Processo {
    private int id;
    private String  nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        Processo processo = (Processo) o;
        return id == processo.id;
    }

}
