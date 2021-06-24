

import java.util.Scanner;

public class Nome_Idade {

    public static void main(String[] args) {
        int N = 5;
        String name[] = new String[N]; //vetor nomes
        int age [] = new int [N]; //vetor idade
        
        Scanner scan_string  = new Scanner(System.in); //criando instancia Scan
        Scanner scan_int  = new Scanner(System.in); //criando instancia Scan

        for(int i = 0; i < N; i++){
            System.out.printf("Digite os nome: ");
            name[i] = scan_string.nextLine();
            System.out.printf("Digite a idade: ");
            age[i] = scan_int.nextInt();
        }
        
        //usando Bubble sort adaptado para ordenar
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (age[i] > age[j]) {
                    int temp_age = age[i];
                    String temp_name = name[i];
                    age[i] = age[j];
                    name[i] = name[j];
                    age[j] = temp_age;
                    name[j] = temp_name;
                }
            }
        }

        for(int i=0; i<N;i++){ //print de tudo
            System.out.print("Nome: "+name[i]);
            System.out.println(" | Idade: "+age[i]);
        }

        scan_int.close();
        scan_string.close();
    }
}
