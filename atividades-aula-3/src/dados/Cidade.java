package dados;

public class Cidade {

    private String nome;
    private String estado;

    public Cidade(){
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getNome(){
        return nome;
    }

    public String getEstado(){
        return estado;
    }

    public String toString() {
        return "\nNome: "+nome+"\nEstado: "+estado;
    }
}
