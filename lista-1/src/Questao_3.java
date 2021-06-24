
import java.util.*;

public class Questao_3 {
    
    public static int buscaMaior( int vetor [], int maiorAtual, int indice){
        
        /*a primeira condição verifica se é o final do vetor para retornar já o 
        maior valor, caso não satisfaça é feito a comparação do maior valor atualmente
        e o valor do índice, e a chamada da função recursivamente
        */
        if(indice == vetor.length-1){
            if(maiorAtual < vetor[indice]){
                return vetor[indice];
            }else{
                return maiorAtual;
            }
        }else if(maiorAtual < vetor[indice]){
            maiorAtual = vetor[indice];
            indice++;
            return buscaMaior(vetor, maiorAtual, indice);
        }else{
            indice++;
            return buscaMaior(vetor, maiorAtual, indice);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tamanhoVetor;

        System.out.printf("Digite o tamanho do vetor: ");
        tamanhoVetor = scan.nextInt();

        int [] vetor = new int[tamanhoVetor];

		//random para gerar os valores para cada elemento da vetor
		Random rand = new Random();

		//for responsavel por atribuir os valores a cada posicao da vetor
		for(int j = 0 ; j < tamanhoVetor ; j++){
			vetor[j] = rand.nextInt()%100;		
        }

        System.out.printf("[");
		for(int j = 0 ; j < tamanhoVetor ; j++){
            System.out.printf(vetor[j]+", ");
        }
        System.out.println("]");


        System.out.println();
        int maior = vetor[0];
        System.out.println("Maior valor do vetor: "+buscaMaior(vetor, maior, 1));

        scan.close();
    }
    


}
