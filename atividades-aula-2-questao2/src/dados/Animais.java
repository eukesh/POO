package dados;

public class Animais {
    
    private String nome;
    private Dono donoAnimal = new Dono();
    private String especie;
    private String descricao;

    public Animais(){

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDono(Dono dono){
        donoAnimal = dono;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getNome(){
        return this.nome;
    }

    public Dono getDono(){
        return this.donoAnimal;
    }

    public String getEspecie(){
        return this.especie;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
