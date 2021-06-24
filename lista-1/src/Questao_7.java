import java.util.*;

import java.util.Calendar;

public class Questao_7{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Calendar data = Calendar.getInstance();

        System.out.println("Digite a data do seu nascimento, Utilize números:");
        System.out.printf("Dia: ");
        int dia = scanner.nextInt();
        System.out.printf("Mês: ");
        int mes = scanner.nextInt();
        System.out.printf("Ano: ");
        int ano = scanner.nextInt();
        
        int idadeDias = ((data.get(Calendar.YEAR) - ano)*365)+(mes*30)+dia;

        System.out.println("Sua idade em dias é: "+idadeDias);
        
        scanner.close();
    }
}