

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao_1 {
	
	public static void main(final String[] args){
		try (Scanner scan = new Scanner(System.in)) {

			
			int tamanhoVetor,soma = 0;
			System.out.printf("Digite o tamanho do vetor: ");
			tamanhoVetor = scan.nextInt();
			
			
			int [] array = new int [tamanhoVetor];
					
			//for responsavel por atribuir valores ao vetor
			for (int i = 0; i<array.length; i++) {
				System.out.printf("Digite o valor para["+(i+1)+"]: ");
				array[i] = scan.nextInt();
			}
			
			//for responsavel pela soma
			for (int i = 0; i<array.length; i++) {
				soma += array[i];
			}
			
			System.out.println("Soma de todos os elementos: "+soma);
			
			//for responsavel por encontrar o menor valor do vetor
			int menorValor = array[0];
			for (int i = 0; i<array.length; i++) {
				if(array[i]<menorValor) {
					menorValor = array[i];
				}
			}
			
			System.out.println("Menor valor do vetor: "+menorValor);

			//for responsavel por encontrar o maior valor do vetor
			int maiorValor = array[0];
			for (int i = 0; i<array.length; i++) {
				if(array[i]>maiorValor) {
					maiorValor = array[i];
				}
			}		
			
			System.out.println("Maior valor do vetor: "+maiorValor);

			System.out.println("Media de todos os valores do vetor: "+(soma / array.length)); //media calculada de forma simples, a divisao da soma de todos os valores pelo tamanho do vetor
			
			//for responsavel pela soma dos primos, onde a variável aux faz a contagem das divisões com resto zero para somar
			int somaPrimos = 0;
			for (int i = 0; i<array.length; i++) {
				int aux = 0;
				for (int j = 1; j<array.length; j++) {
					if(array[i] == 1) {
						aux =2;
						break;
					}else if(array[i]%j == 0) {
						aux++;
					}
				}	
				if(aux == 2) {
					somaPrimos+= array[i];
				}
			}	

			System.out.println("Soma dos primos dentro do vetor: "+somaPrimos);

		} catch (InputMismatchException e) {
			System.out.println("Erro na leitura do valor:" + e);
		}
	}
}
