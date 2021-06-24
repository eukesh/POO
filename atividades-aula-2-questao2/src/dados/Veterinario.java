package dados;

public class Veterinario {
    
    private String nome;
    private int salario;
    private Endereco enderecoVeterinario = new Endereco();
    private int quantidadeAnimais = 0;
    private Animais [] animal = new Animais[50];

    public Veterinario(){

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setEnderecoVeterinario(Endereco endereco) {
        this.enderecoVeterinario = endereco;
    }

    public void setAnimais(Animais animal){
        this.animal[this.quantidadeAnimais] = new Animais();
        this.animal[this.quantidadeAnimais] = animal;
        this.quantidadeAnimais++;
    }
    
    public String getNome() {
        return this.nome;
    }

    public int getSalario() {
        return this.salario;
    }

    public Endereco getEndereco(){
        return this.enderecoVeterinario;
    }

    public Animais getAnimais(int i){
        return this.animal[i];
    }
    
    public int getQuantidadeAnimais(){
        return this.quantidadeAnimais;
    }
}
