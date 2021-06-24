package dados;

public class Grupo{
    private Pessoa [] pessoas = new Pessoa[5];
    private int numeroPessoas = 0;


    //construtor do objeto
    public Grupo(){

    }

    //metodos para adicionar pessoa ao grupo, consultar dados das pessoas e ordenar
    public void setPessoa(Pessoa p){
        pessoas[this.numeroPessoas] = p;
        this.numeroPessoas++;
    }

    public Pessoa getPessoas(int i){
        return pessoas[i];
    }

    public void ordena(){
        for ( int i = 0; i < numeroPessoas; i++){
            for(int j = 1; j < numeroPessoas; j++){
                if(this.pessoas[j].calculaImc() > this.pessoas[i].calculaImc()){
                    Pessoa aux = this.pessoas[j];
                    this.pessoas[j] = this.pessoas[i];
                    this.pessoas[i] = aux;
                }
            }
        }
    }
}

