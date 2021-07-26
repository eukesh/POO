package dados;

public class Gato extends Animal{

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String emitirSom(){
        return "Miau-miau";
    }
}
