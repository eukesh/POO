package main;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa() {

    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        StringBuffer string = new StringBuffer();
        string.append("\tNome: " + nome + " Idade: " + idade);
        return string.toString();
    }

}
