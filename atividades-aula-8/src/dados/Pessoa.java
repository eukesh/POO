package dados;

public class Pessoa {

    private String nome;
    private int idade;
    private float altura;
    private float massa;

    // Construtor do objeto pessoal
    public Pessoa() {

    }

    // metodos para consulta de dados e inserção de atributos ao objeto
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getMassa() {
        return this.massa;
    }

    public void setMassa(float massa) {
        this.massa = massa;
    }

    public float calculaImc() {
        return this.massa / (this.altura * this.altura);
    }

    @Override
    public String toString() {
        StringBuffer string = new StringBuffer();
        string.append(this.nome + ", " + this.idade + ", " + this.altura + ", " + this.massa);
        return string.toString();
    }

    @Override
    public boolean equals(Object obj) {

        Pessoa p = (Pessoa) (obj);

        if (p.getNome() == this.getNome()) {
            return true;
        }

        return false;
    }

}