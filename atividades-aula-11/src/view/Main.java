package view;

import exceptions.*;
import controller.ListaTelefonica;
import model.Contato;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    static ListaTelefonica contatos;

    static {
        try {
            contatos = new ListaTelefonica("toor");
        } catch (ClassNotFoundException | SQLException | SelectException e) {
            e.printStackTrace();
        }
    }

    static Scanner scan = new Scanner(System.in);
    static Scanner scanText = new Scanner(System.in);

    public static void exibirContatos(char letra) {

        try {
            int indice = 0;
            for (Contato x : contatos.buscarContatos(letra)) {
                System.out.println(indice + 1 + ": " + x);
                indice++;
            }
        }catch (ErroNaLeituraException | SelectException e){
            System.out.println(e.getMessage());
        }
    }

    public static void exibirContatos() {

        try{
            contatos.buscarContatos().forEach((key, value) -> {
                System.out.println(key + ": ");
                for (Contato x : value) {
                    System.out.println("\t" + x);
                }
            });
        }catch (ErroNaLeituraException | SelectException e){
            System.out.println(e.getMessage());
        }
    }

    public static Contato novoContato() {

        Contato newContato = new Contato();
        System.out.print("Digite o nome do contato: ");
        newContato.setNome(scanText.nextLine());
        System.out.print("Digite o número do telefone: ");
        newContato.setTelefone(scan.nextInt());

        return newContato;
    }

    public static Contato novoContato(int id){
        Contato newContato = new Contato();
        newContato.setId(id);
        System.out.print("Digite o nome do contato: ");
        newContato.setNome(scanText.nextLine());
        System.out.print("Digite o número do telefone: ");
        newContato.setTelefone(scan.nextInt());

        return newContato;
    }

    public static void adicionarContato() {
        try{
            contatos.adicionarContato(novoContato());
        }catch (ErroNaLeituraException | ErroNaGravacaoException e){
            System.out.println(e.getMessage());
            System.out.println("Caminho informado: "+e.getCaminho());
        } catch (ContatoJaCadastradoException e){
            System.out.println(e);
        } catch (InsertException | SelectException e) {
            e.printStackTrace();
        }
    }

    public static void atualizaContato(){
        System.out.println("Qual a letra que deseja atualizar o contato: ");
        char letra = scanText.nextLine().charAt(0);
        try{
            if (contatos.buscarContatos(letra).size() > 0) {
                exibirContatos(letra);

                System.out.println("Escolha o código do contato a ser atualizado");

                int key = Integer.parseInt(scanText.nextLine());

                if (key <= contatos.buscarContatos(letra).size()) {
                    contatos.atualizaContato(novoContato((contatos.buscarContatos(letra).get(key - 1)).getId()));

                }
            }
        }catch (ErroNaLeituraException e){
            System.out.println(e.getMessage());
            System.out.println("Caminho informado: "+e.getCaminho());
        } catch (SelectException | UpdateException e) {
            e.printStackTrace();
        }
    }

    public static void removerContato() {
        System.out.println("Qual a letra que deseja remover o contato: ");
        char letra = scanText.nextLine().charAt(0);

        try{
            if (contatos.buscarContatos(letra).size() > 0) {
                exibirContatos(letra);

                System.out.println("Escolha o código do contato a ser removido");

                int key = Integer.parseInt(scanText.nextLine());

                if (key <= contatos.buscarContatos(letra).size()) {

                    contatos.removerContato(contatos.buscarContatos(letra).get(key - 1));
                }
            }
        }catch (ErroNaLeituraException e){
            System.out.println(e.getMessage());
            System.out.println("Caminho informado: "+e.getCaminho());
        } catch (SelectException | ContatoNaoCadastradoException | DeleteException | ErroNaGravacaoException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int loop = 0;
        while (loop == 0) {
            System.out.println("\n----------------\nO que deseja fazer?\n");
            System.out.println(
                    "0 - Sair\n1 - Adicionar novo contato\n2 - Remover contato\n3 - Exibir todos os contatos\n4 - Buscar contatos por letra\n5 - Atualizar Contato");
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
                    char letra = scanText.nextLine().charAt(0);
                    exibirContatos(letra);
                    break;
                case 5:
                    atualizaContato();
                default:
                    System.out.println("Opção não válida");
                    break;
            }
        }

    }
}
