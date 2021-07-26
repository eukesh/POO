package main;
import dados.*;

public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.setRaio(2);
        System.out.println(c1);

        Circulo c2 = new Circulo();
        c2.setRaio(4);
        System.out.println(c2);

        Losango l1 = new Losango();
        l1.setD(10);
        l1.setd(5);
        System.out.println(l1);

        Losango l2 = new Losango();
        l2.setD(35);
        l2.setd(20);
        System.out.println(l2);

        Trapezio t1 = new Trapezio();
        t1.setAltura(10);
        t1.setBaseMaior(15);
        t1.setBaseMenor(10);
        System.out.println(t1);

        Trapezio t2 = new Trapezio();
        t2.setAltura(20);
        t2.setBaseMaior(10);
        t2.setBaseMenor(5);
        System.out.println(t2);

    }
}
