package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> itens = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            itens.add((char) (65+i));
        }

        Interator itemInterator = new ItemIterator(itens);

        while(itemInterator.hasNext()){
            Character item = (Character) itemInterator.next();
            System.out.print(item+" | ");
        }

    }
}
