package apresentacao;

import dados.Contato;
import negocio.ListaTelefonica;
import java.util.Scanner;

public class Main {

    static ListaTelefonica contatos = new ListaTelefonica();
    static Scanner scan = new Scanner(System.in);
    static Scanner scanText = new Scanner(System.in);

    public static void exibirContatos(char letra) {
        int indice = 0;
        for (Contato x : contatos.buscarContatos(letra)) {
            System.out.println(indice + 1 + ": " + x);
            indice++;
        }
    }

    public static void exibirContatos() {

        contatos.buscarContatos().forEach((key, value) -> {
            System.out.println(key + ": ");
            for (Contato x : value) {
                System.out.println("\t" + x);
            }
        });
    }

    public static Contato novoContato() {

        Contato newContato = new Contato();
        System.out.print("Digite o nome do contato: ");
        newContato.setNome(scanText.nextLine());
        System.out.print("Digite o número do telefone: ");
        newContato.setTelefone(scan.nextInt());

        return newContato;
    }

    public static void adicionarContato() {
        contatos.adicionarContato(novoContato());
    }

    public static void removerContato() {
        System.out.println("Qual a letra que deseja remover o contato: ");
        char letra = scanText.nextLine().charAt(0);

        if (contatos.buscarContatos(letra).size() > 0) {
            exibirContatos(letra);

            System.out.println("Escolha o código do contato a ser removido");

            int key = Integer.parseInt(scanText.nextLine());

            if (key <= contatos.buscarContatos(letra).size()) {

                contatos.removerContato(contatos.buscarContatos(letra).get(key - 1));
            }
        }
    }

    public static void main(String[] args) {
        int loop = 0;
        while (loop == 0) {
            System.out.println("\n----------------\nO que deseja fazer?\n");
            System.out.println(
                    "0 - Sair\n1 - Adicionar novo contato\n2 - Remover contato\n3 - Exibir todos os contatos\n4 - Buscar contatos por letra");
            int option = scan.nextInt();

            switch (option) {
                case 0:
                    loop++;
                    break;
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    removerContato();
                    break;
                case 3:
                    exibirContatos();
                    break;
                case 4:
                    System.out.println("Qual a letra que deseja buscar: ");
                    char letra = scan.nextLine().charAt(0);
                    exibirContatos(letra);
                default:
                    System.out.println("Opção não válida");
                    break;
            }
        }

    }
}
