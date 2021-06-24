package main;

import java.util.Random;

public class Sorteador {
    private Pessoa[] pessoas = new Pessoa[50];
    private int quantPessoas = 0;

    public sorteador(){

    }

    public void setPessoas(Pessoa pessoa) {
        pessoas[quantPessoas] = pessoa;
        quantPessoas++;
    }

    public Pessoa sortearProximo() {
        Random random = new Random();

        int loop = 0;
        while (loop == 0) {
            index = random.nextInt(51);
            if (pessoas[index] != null) {
                loop++;
            }
        }
        Pessoa buffer = pessoas[index];
        pessoas[index] = null;
        return buffer;
    }
}
