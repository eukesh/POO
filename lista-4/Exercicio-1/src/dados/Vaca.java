package dados;

public class Vaca extends Animal{

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String emitirSom(){
        return "Mu-mu";
    }
}
