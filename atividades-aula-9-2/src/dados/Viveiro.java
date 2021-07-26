package dados;

public class Viveiro {

    protected String nome;
    protected float comprimento;
    protected float largura;
    protected Animal[] animais;
    protected int quantAnimais = 0;

    public Viveiro(int maxAnimal) {
        animais = new Animal[maxAnimal];
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getLargura() {
        return largura;
    }

    public float calculaEspaco() {
        return (comprimento * largura);
    }

    private float espacoOcupado() {
        float espacoOcupadoAnimais = 0;
        for (int i = 0; i < quantAnimais; i++) {
            espacoOcupadoAnimais += animais[i].calculaEspacoOcupado();
        }
        return espacoOcupadoAnimais;
    }

    public float espacoDisponivel() {
        return (calculaEspaco() - espacoOcupado());
    }

    public boolean adicionarAnimal(Animal animal) {
        if (espacoDisponivel() > (animal.calculaEspacoOcupado() * 0.7)) {
            this.animais[quantAnimais] = animal;
            quantAnimais++;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        StringBuffer string = new StringBuffer();
        string.append("Viveiro \n");
        string.append("Nome: " + nome + "\n");
        for (int i = 0; i < quantAnimais; i++) {

            string.append("\tAnimais:\n\t" + animais[i].toString() + "\n");
        }
        return string.toString();
    }

}
