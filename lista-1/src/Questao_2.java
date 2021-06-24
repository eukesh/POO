
import java.util.*;

public class Questao_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n,m;

		// entradas para linha e coluna 
		System.out.printf("Digite o valor da linha: ");
		n = scan.nextInt();
		System.out.printf("Digite o valor da coluna: ");
		m = scan.nextInt();

		//declaracao das matrizes 
		int [][] matriz1 = new int[n][m];
		int [][] matriz2 = new int[n][m];
		int [][] matriz3 = new int[n][m];
		int [][] matriz4 = new int[n][m];

		//random para gerar os valores para cada elemento da matriz
		Random rand = new Random();

		//for responsavel por atribuir os valores a cada posicao da matriz
		for(int i = 0 ; i < n; i++){
			for(int j = 0 ; j < m ; j++){
				matriz1[i][j] = rand.nextInt()%10;
				matriz2[i][j] = rand.nextInt()%10;
			}
		}

		//for responsavel por adicionar os elementos da matriz 3 de acordo com a condicao
		for(int i = 0 ; i < n; i++){
			for(int j = 0 ; j < m ; j++){
				if(matriz1[i][j]>matriz2[i][j]){
					matriz3[i][j] = matriz1[i][j];
				}else if(matriz1[i][j] < matriz2[i][j]){
					matriz3[i][j] = matriz2[i][j];
				}
			}
		}

		//for responsavel por adicionar os elementos da matriz 4 de acordo com a condicao
		for(int i = 0 ; i < n; i++){
			for(int j = 0 ; j < m ; j++){
				if(i == j || j>i){
					matriz4[i][j] = 0;
				}else if(matriz1[i][j] < matriz2[i][j]){
					matriz4[i][j] = matriz1[i][j];
				}else if(matriz1[i][j] > matriz2[i][j]){
					matriz4[i][j] = matriz2[i][j];
				}
			}
		}

		//abaixo o print das matrizes

		System.out.println();
		for(int i = 0 ; i < n; i++){
			for(int j = 0 ; j < m ; j++){
				System.out.printf("["+matriz3[i][j]+"]");
			}
			System.out.println();

		}

		System.out.println();
		for(int i = 0 ; i < n; i++){
			for(int j = 0 ; j < m ; j++){
				System.out.printf("["+matriz4[i][j]+"]");
			}
			System.out.println();

		}


		scan.close();
	}

}
