package main;
import dados.*;
public class Main {
    public static void main(String[] args) {
        Cachorro dog1 = new Cachorro();
        dog1.setNome("Jubileu");
        System.out.println(dog1.getNome()+": "+dog1.emitirSom());

        Cachorro dog2 = new Cachorro();
        dog2.setNome("Pingo");
        System.out.println(dog2.getNome()+": "+dog2.emitirSom());

        Gato cat1 = new Gato();
        cat1.setNome("July");
        System.out.println(cat1.getNome()+": "+cat1.emitirSom());

        Gato cat2 = new Gato();
        cat2.setNome("Josivelton");
        System.out.println(cat2.getNome()+": "+cat2.emitirSom());

        Vaca cow1 = new Vaca();
        cow1.setNome("Mimosa");
        System.out.println(cow1.getNome()+": "+cow1.emitirSom());

        Vaca cow2 = new Vaca();
        cow2.setNome("Gerusa");
        System.out.println(cow2.getNome()+": "+cow2.emitirSom());

    }
}
