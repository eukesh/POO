package dados;

public class Contato {
    private String nome;
    private int telefone;

    public Contato() {
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
        return this.nome + ": " + this.telefone;
    }

    public boolean equals(Object o) {
        Contato c = (Contato) o;
        return c.getTelefone() == this.telefone;
    }

}
