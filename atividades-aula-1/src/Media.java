/*
Escreva um programa em Java, que leia 5 valores do console e apresente a média
desses 5 valores. É obrigatório o uso de array
*/

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        //try ou scan.close(); para evitar erros
       try (Scanner scan = new Scanner(System.in);){
        int values [] = new int [5];
        float media = 0;

        for (int i=0; i<5;i++){
        	System.out.println("Digite um valor inteiro: ");
            values[i] = scan.nextInt();
            media+=values[i];
        }
        System.out.println("Media = " + media / 5);
       }
    }  
}