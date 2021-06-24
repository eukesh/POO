package main;

//
import dados.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Gerador gerador;
        Random random = new Random();

        // Fibonacci
        gerador = new Fibonacci();
        gerador.gerar(random.nextInt(50));
        System.out.println("Fibonacci: " + gerador.getSequencia());

        // Abundantes
        gerador = new Abundantes();
        gerador.gerar(random.nextInt(50));
        System.out.println("Abundantes: " + gerador.getSequencia());

        // Fatoriais
        gerador = new Fatoriais();
        gerador.gerar(random.nextInt(20));
        System.out.println("Fatoriais: " + gerador.getSequencia());

        // Naturais
        gerador = new Naturais();
        gerador.gerar(random.nextInt(50));
        System.out.println("Naturais: " + gerador.getSequencia());

        // NumeroPrimos
        gerador = new NumeroPrimos();
        gerador.gerar(random.nextInt(100));
        System.out.println("Primos: " + gerador.getSequencia());

        // Perfeitos
        gerador = new Perfeitos();
        gerador.gerar(random.nextInt(50));
        System.out.println("Perfeitos: " + gerador.getSequencia());

        // Quadrados
        gerador = new Quadrados();
        gerador.gerar(random.nextInt(50));
        System.out.println("Quadrados: " + gerador.getSequencia());
    }
}
