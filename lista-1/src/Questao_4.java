import java.util.*;

public class Questao_4{
    
    //função do expoente com um for para repetir a multiplicação
    public static int exponencial (int valor, int expoente){
        int res = valor;
        for(int i = 1 ; i < expoente ; i++){
            res *= valor;
        }

        return res;
    }


    // função do resto
    public static int resto (int dividendo, int divisor){
        return dividendo%divisor;
    }
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int persistence = 1;

        /*
        Estrutura While para dinamizar o código, onde option vai selecionar
        a função a ser chamada ou fechar o código, utilizei switch pela 
        organização
        */
        while(persistence == 1){
            System.out.println("\nQual operação deseja fazer? \n\n1 - Exponencial\n2 - Resto de divisao\nDigite zero para sair");
            int option = scanner.nextInt();
 
            switch (option) {

                case 0:{
                    persistence = option;
                    break;
                }

                case 1:{
                    int valor,expoente;
                    System.out.printf("Digite o valor: ");
                    valor = scanner.nextInt();
                    System.out.printf("Digite o expoente: ");
                    expoente = scanner.nextInt();
                    System.out.println(valor+" Elevado a "+expoente+" = "+exponencial(valor, expoente));
                    break;
                }
                case 2:{
                    int dividendo, divisor;
                    System.out.printf("Digite o dividendo: ");
                    dividendo = scanner.nextInt();
                    System.out.printf("Digite o divisor: ");
                    divisor = scanner.nextInt();
                    System.out.println("O resto de "+dividendo+" dividido por "+divisor+" = "+resto(dividendo, divisor));
                    break;
                }
                default:{
                    System.out.println("Opcao invalida, digite novamente!");
                    break;
                }
            }

        }
        
        scanner.close();
    }
}