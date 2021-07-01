package dados;

import java.util.ArrayList;
import java.util.List;

public class Equipe<T> {
    private String nome;

    private List<T> t = new ArrayList<T>();

    public int length;

    public Equipe() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setT(T t) {
        this.t.add(t);
        this.length++;
    }

    public List<T> getT() {
        return t;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
