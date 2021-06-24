package main;

import dados.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanString =  new Scanner(System.in);
        SistemaPetShop petshop = new SistemaPetShop();


        int loop = 1;
        while(loop == 1){

            System.out.printf("\nO que deseja fazer?\n\n1 - Cadastrar Veterinario;\n2 - Mostrar Veterinarios\n3 - Cadastrar Endereço Veterinarios\n4 - Cadastrar Animal\n5 - Mostrar Animais\n6 - Cadastrar Dono\n7 - Cadastrar Endereço Dono\n0 - Sair\n");
            System.out.printf("\n->");
            int option = scan.nextInt();

            switch(option){
                case 0:
                    loop = 0;
                    break;
                case 1:
                    petshop.cadastrarVeterinario();
                    break;
                case 2:
                    petshop.mostrarVeterinario();
                    break;
                case 3:
                    petshop.cadastrarEnderecoVeterinario();
                    break;
                case 4:
                    petshop.cadastrarAnimal();
                    break;
                case 5:
                    petshop.mostrarAnimais();
                    break;
                case 6:
                    petshop.cadastrarDono();
                    break;
                case 7:    
                    petshop.cadastrarEnderecoDono();
                    break;
                    
                default:
                    continue;             
            }
        }
        scan.close();
        scanString.close();
    }
}
