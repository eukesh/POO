package model;

public class Contato {
    int id;
    private String nome;
    private int telefone;

    public Contato() {
    }

    public Contato(String nome,int telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public Contato(int id,String nome,int telefone){
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return this.id+":"+ this.nome + ": " + this.telefone;
    }

    public boolean equals(Object o) {
        Contato c = (Contato) o;
        return c.getTelefone() == this.telefone;
    }

}
