package dados;

public class Dono {
    
    private String nome;
    private Endereco enderecoDono = new Endereco();
    private String cpf;
        
    public Dono(){

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEnderecoDono(Endereco endereco){
        this.enderecoDono = endereco;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public Endereco getEndereco(){
        return this.enderecoDono;
    }

    public String getCpf(){
        return this.cpf;
    }
}
