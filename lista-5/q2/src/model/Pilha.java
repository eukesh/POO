package model;

import exception.PilhaCheiaException;
import exception.PilhaVaziaException;

import java.util.ArrayList;
import java.util.List;

public class Pilha <T>{
    private int limite;
    private List<T> elementos = new ArrayList<T>();

    public Pilha(int limite){
        this.limite = limite;
    }

    public void inserir(T obj) throws PilhaCheiaException {
        if(elementos.size() == this.limite)
            throw new PilhaCheiaException("Pilha Cheia");
        elementos.add(obj);
    }

    public T remover() throws PilhaVaziaException {
        if(elementos.size()==0)
            throw new PilhaVaziaException("Pilha Vazia");
        T temp = elementos.get(elementos.size()-1);
        elementos.remove(elementos.size()-1);
        return temp;
    }

    public int getSize(){
        return elementos.size();
    }

}
