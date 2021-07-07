package main;

import java.util.Scanner;
import dados.Matriz;
import dados.Quadrante;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static Matriz<Integer> matriz = new Matriz<>(5, 5);

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Posição: [%d][%d]: ", i, j);
                matriz.set(s.nextInt(), i, j);
        }
    }

        System.out.println("Menor elemento: " + menorElemento());
}

    private static int menorElemento() {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> menor = new ArrayList<Integer>();

        for (Quadrante x : Quadrante.values()) {
            list = matriz.getElementosQuadrante(x);
            int a = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < a) {
                    a = list.get(i);
                }
            }
            menor.add(a);
        }

        int a = menor.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (menor.get(i) < a) {
                a = menor.get(i);
            }
        }

        return a;
    }

}
