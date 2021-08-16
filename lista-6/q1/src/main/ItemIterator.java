package main;

import java.util.ArrayList;
import java.util.List;

public class ItemIterator<T> implements Interator{

    private List<T> pares = new ArrayList<>();
    private List<T> impares = new ArrayList<>();
    private int positionPares = 0;
    private int positionImpares = 0;


    public ItemIterator (List<T> itens){
        for (int i = 0; i < itens.size(); i++) {
            if(i%2 == 0 || i == 0){
                pares.add(itens.get(i));
            }else{
                impares.add(itens.get(i));
            }
        }
    }

    @Override
    public boolean hasNext() {
        if(positionImpares>=impares.size() || impares.get(positionImpares) == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public T next() {
        if(positionPares>=pares.size() || pares.get(positionPares) == null){
            T item = impares.get(positionImpares);
            positionImpares++;
            return item;
        }else{
            T item = pares.get(positionPares);
            positionPares++;
            return item;
        }
    }

    @Override
    public void reset() {
        positionImpares=0;
        positionPares=0;
    }


}
