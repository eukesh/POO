
import java.util.*;

public class Questao_6 {
    
    public static char[] correspondeciaPalavra(String palavra1, String palavra2){
        char [] letrasUniao = new char[palavra1.length()];
        int indiceLetras = 0;

        for(int i=0; i<palavra1.length(); i++){
            int contador = 0;
            for(int j=0; j<palavra2.length(); j++){
                if(palavra1.charAt(i) == palavra2.charAt(j)){
                    contador++;
                }
            }
            if(contador != 0){
                int aux = 0;
                for(int x=0; x<letrasUniao.length; x++){
                    if(palavra1.charAt(i) == letrasUniao[x]){
                        aux++;
                    }
                }
                if (aux == 0){
                    letrasUniao[indiceLetras] = palavra1.charAt(i);
                    indiceLetras++;
                }
            }
        }

        return letrasUniao;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String palavra1, palavra2;

        System.out.printf("Digite a primeira palavra: ");
        palavra1 = scanner.nextLine();
        System.out.printf("Digite a segunda palavra: ");
        palavra2 = scanner.nextLine();

        char [] letrasUniao = new char[palavra1.length()];
        letrasUniao = correspondeciaPalavra(palavra1,palavra2);

        //sort criando espaços vazios 
        
        Arrays.sort(letrasUniao); 
        
        System.out.println("Letras Repetidas: ");
        System.out.println(letrasUniao);

        scanner.close();
    }
}