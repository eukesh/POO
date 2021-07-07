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

        if (o instanceof Contato) {
            Contato c = (Contato) o;
            if (this.telefone == c.getTelefone()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

}
