package main;

import java.util.*;
import dados.*;

public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);

        //instanciando Grupo
        Grupo g = new Grupo();

        System.out.println("Quantas pessoas deseja adicionar ao grupo? ");
        int quantidadePessoas = scan.nextInt();

        //criando um vetor de pessoas do tamanho desejado
        Pessoa [] pessoa = new Pessoa[quantidadePessoas];

        for( int i = 0; i < quantidadePessoas; i++){
            pessoa[i] = new Pessoa();
            System.out.printf("Digite o nome: ");
            String name = scanString.nextLine();
            pessoa[i].setNome(name);
            System.out.printf("Digite a altura: ");
            pessoa[i].setAltura(scan.nextFloat());
            System.out.printf("Digite a idade: ");
            pessoa[i].setIdade(scan.nextInt());
            System.out.printf("Digite a massa: ");
            pessoa[i].setMassa(scan.nextFloat());
            g.setPessoa(pessoa[i]);
            System.out.println();
        } 
        
        for( int i = 0; i<quantidadePessoas;i++){
            System.out.println("Nome: "+ g.getPessoas(i).getNome());
            System.out.println("Altura: "+ g.getPessoas(i).getAltura());
            System.out.println("Idade: "+ g.getPessoas(i).getIdade());
            System.out.println("Massa: "+ g.getPessoas(i).getMassa());
            System.out.println("IMC: "+ g.getPessoas(i).calculaImc());
            System.out.println();
        }

        scan.close();
        scanString.close();
    }
}



