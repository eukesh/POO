package model;

import exception.PilhaCheiaException;

public class Juiz {
    private String nome;
    Pilha<Processo> processos;

    public Juiz(int limite){
        processos = new Pilha<Processo>(limite);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void cadastrarProcesso(Processo p) throws PilhaCheiaException {
        processos.inserir(p);
    }

}
