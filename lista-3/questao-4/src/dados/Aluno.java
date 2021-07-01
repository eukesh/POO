package dados;

import java.util.ArrayList;
import java.util.List;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int idade;
    private List<Double> notas = new ArrayList<Double>();

    public Aluno() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public double calcularMedia() {
        double media = 0;

        for (int i = 0; i < 5; i++) {
            media += notas.get(i);
        }

        return media;
    }

    @Override
    public String toString() {
        StringBuffer string = new StringBuffer();
        string.append(nome + ", " + idade + ", " + calcularMedia());
        return string.toString();
    }

    @Override
    public int compareTo(Aluno o) {

        return Double.compare(calcularMedia(), o.calcularMedia());
    }

}
