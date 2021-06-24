
import java.util.*;

public class Questao_5 {

    /*
    as funções de contagem utilizam um dicionário de vogais,
    e compara cada caractere da string com o dicionário 

    charAt -> lê cada letra da string como char, tratar como vetor


    */
    public static int contaVogal (String word){
        char [] vogais = {'a','A','e','E','i','I','o','O','u','U'};
        int contadorVogais = 0;
        for(int i = word.length()-1 ; i!=-1 ; i--){
            int contadorAux = 0;
            for(int j = 0 ; j < vogais.length ; j++){
                if(word.charAt(i) == vogais[j]){
                    contadorAux++;
                }else{
                    continue;
                }
            }
            if (contadorAux != 0){
                contadorVogais++;
            }
        }
        return contadorVogais;
    }


    public static int contadorConsoante (String word){
        char [] vogais = {'a','A','e','E','i','I','o','O','u','U'};
        int contadorConsoante = 0;
        for(int i = word.length()-1 ; i!=-1 ; i--){
            int contadorAux = 0;
            for(int j = 0 ; j < vogais.length ; j++){
                if(word.charAt(i) == vogais[j]){
                    contadorAux++;
                }else{
                    continue;
                }
            }
            if (contadorAux == 0){
                contadorConsoante++;
            }
        }
        return contadorConsoante;
    }

    /*
    String.valueOf() -> converte tudo em string
    .equals() -> compara duas strings
    */
    public static boolean isPalindromo(String word){
        char []palindromo = new char[word.length()];
        for (int i = word.length() - 1; i != -1 ; i--){
            palindromo[i] = word.charAt(i);
        }
        
        String palindromoString = String.valueOf(palindromo);

        if(palindromoString.equals(word)){
            return true;
        }else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite uma palavra: ");
        String palavra = scanner.nextLine();
    
        System.out.println("Número de Vogais na palavra "+palavra+": "+contaVogal(palavra));
        System.out.println("Número de Consoantes na palavra "+palavra+": "+contadorConsoante(palavra));
    
        if(isPalindromo(palavra)){
            System.out.println("A palavra "+palavra+" é um palindromo");
        }else{
            System.out.println("A palavra "+palavra+" não é um palindromo");
        }

        scanner.close();
    }
}
