package dados;

class Ator {
    private String nome;
    private int idade;
    private int id;

    public Ator() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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
    public boolean equals(Object obj) {
        Ator u = new Ator();

        return u.equals(obj);
    }

    @Override
    public String toString() {
        StringBuffer string = new StringBuffer();
        string.append("Ator: \n");
        string.append("\tId: " + String.valueOf(idade) + "Nome: " + nome + "Idade: " + String.valueOf(idade));
        return string.toString();
    }
}