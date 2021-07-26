package apresentacao;

import dados.*;
import exceptions.EspacoIndisponivelException;
import negocio.*;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static Scanner scanText = new Scanner(System.in);
    static Zoologico zoologico = new Zoologico();

    public static void mostraMenu() {
        System.out.println(
                "\n===========O que deseja fazer?===========\n0 - Sair\n1 - Cadastrar Viveiro\n2 - Cadastrar Animal\n3 - Obter Animais\n4 - Obter Viveiros\n");
    }

    public static void cadastraViveiro() {

        System.out.print("Que tipo deseja adicionar?\n1 - Viveiro\n2 - Aquário\n-> ");
        int tipo = scan.nextInt();

        switch (tipo) {
            case 1:
                cadastrarViveiroTipo1();
                break;

            case 2:
                cadastrarViveiroTipo2();
                break;

            default:
                System.out.println("Opção inexistente!");
                break;
        }
    }

    public static void cadastrarViveiroTipo1() {
        System.out.print("Quantos animais o viveiro comporta? ");
        int quantAnimais = scan.nextInt();
        Viveiro newViveiro = new Viveiro(quantAnimais);
        System.out.print("Digite o nome: ");
        newViveiro.setNome(scanText.nextLine());
        System.out.print("Digite o comprimento: ");
        newViveiro.setComprimento(scan.nextFloat());
        System.out.print("Digite a largura: ");
        newViveiro.setLargura(scan.nextFloat());
        zoologico.cadastrarViveiro(newViveiro);
    }

    public static void cadastrarViveiroTipo2() {
        System.out.print("Quantos peixes o aquario comporta? ");
        int quantAnimais = scan.nextInt();
        Aquario newAquario = new Aquario(quantAnimais);
        System.out.print("Digite o nome: ");
        newAquario.setNome(scanText.nextLine());
        System.out.print("Digite o comprimento: ");
        newAquario.setComprimento(scan.nextFloat());
        System.out.print("Digite a largura: ");
        newAquario.setLargura(scan.nextFloat());
        System.out.print("Digite a Altura: ");
        newAquario.setAltura(scan.nextFloat());
        System.out.print("Digite a Temperatura: ");
        newAquario.setTemperatura(scan.nextFloat());
        zoologico.cadastrarViveiro(newAquario);
    }

    public static void mostrarAquarios() {
        if (zoologico.getSoAquarios().length == 1) {
            System.out.println(("1") + " - " + zoologico.getSoAquarios()[0]);
        }

        if (zoologico.getSoAquarios()[0] == null) {
            System.out.println("Sem aquarios cadastrados");

        } else {
            System.out.println("Aquarios Cadastrados:\n");
            for (int i = 0; i < zoologico.getSoAquarios().length - 1; i++) {
                System.out.println((i + 1) + " - " + zoologico.getSoAquarios()[i]);
            }
        }
    }

    public static void mostrarViveiros() {

        if (zoologico.getSoViveiros().length == 1) {
            System.out.println(("1") + " - " + zoologico.getSoViveiros()[0]);
        }

        if (zoologico.getSoViveiros()[0] == null) {
            System.out.println("Sem viveiros cadastrados");
        } else {
            System.out.println("Viveiros Cadastrados:\n");
            for (int i = 0; i < zoologico.getSoViveiros().length - 1; i++) {
                System.out.println((i + 1) + " - " + zoologico.getSoViveiros()[i]);
            }

        }
    }

    public static void mostrarAnimais() {
        for (int i = 0; i < zoologico.getAnimais().length; i++) {
            System.out.println(zoologico.getAnimais()[i]);
        }
    }

    public static void cadastrarAnimal() throws EspacoIndisponivelException {

        System.out.print("Que tipo deseja adicionar?\n1 - Animal\n2 - Peixe\n-> ");
        int tipo = scan.nextInt();

        switch (tipo) {
            case 1:
                cadastrarAnimalTipo1();
                break;

            case 2:
                cadastrarAnimalTipo2();
                break;

            default:
                System.out.println("Opção inexistente!");
                break;
        }
    }

    public static void cadastrarAnimalTipo1() throws EspacoIndisponivelException {

        Animal newAnimal = new Animal();
        System.out.print("Digite o nome: ");
        newAnimal.setNome(scanText.nextLine());
        System.out.print("Digite a cor: ");
        newAnimal.setCor(scanText.nextLine());
        System.out.print("Digite a especie: ");
        newAnimal.setEspecie(scanText.nextLine());
        System.out.print("Digite a idade: ");
        newAnimal.setIdade(scan.nextInt());
        System.out.print("Digite a largura: ");
        newAnimal.setLargura(scan.nextFloat());
        System.out.print("Digite o comprimento: ");
        newAnimal.setComprimento(scan.nextFloat());
        System.out.print("Digite a altura: ");
        newAnimal.setAltura(scan.nextFloat());

        System.out.println("Qual viveiro deseja utilizar?");
        mostrarViveiros();
        int key = scan.nextInt();

        try {
            zoologico.alocarAnimal(newAnimal, zoologico.getSoViveiros()[key - 1]);
        }catch (Exception e){
            EspacoIndisponivelException erro = new EspacoIndisponivelException();
            throw erro;
        }


        zoologico.cadastrarAnimais(newAnimal);

    }

    public static void cadastrarAnimalTipo2() throws EspacoIndisponivelException{

        Peixe newAnimal = new Peixe();
        System.out.print("Digite o nome: ");
        newAnimal.setNome(scanText.nextLine());
        System.out.print("Digite a cor: ");
        newAnimal.setCor(scanText.nextLine());
        System.out.print("Digite a especie: ");
        newAnimal.setEspecie(scanText.nextLine());
        System.out.print("Digite a idade: ");
        newAnimal.setIdade(scan.nextInt());
        System.out.print("Digite a largura: ");
        newAnimal.setLargura(scan.nextFloat());
        System.out.print("Digite o comprimento: ");
        newAnimal.setComprimento(scan.nextFloat());
        System.out.print("Digite a altura: ");
        newAnimal.setAltura(scan.nextFloat());
        System.out.print("Digite a temperatura ideal: ");
        newAnimal.setTemperaturaIdeal(scan.nextFloat());

        System.out.println("Qual aquario deseja utilizar?");
        mostrarAquarios();
        int key = scan.nextInt();
        try {
            zoologico.alocarAnimal(newAnimal, zoologico.getSoViveiros()[key - 1]);
        }catch (Exception e){
            EspacoIndisponivelException erro = new EspacoIndisponivelException();
            throw erro;
        }

        zoologico.cadastrarAnimais(newAnimal);
    }

    public static void main(String[] args) throws EspacoIndisponivelException {

        int loop = 0;

        while (loop == 0) {
            mostraMenu();
            System.out.print("=> ");
            int option = scan.nextInt();

            switch (option) {
                case 0:
                    loop = 1;
                    break;
                case 1:
                    cadastraViveiro();
                    break;
                case 2:
                    cadastrarAnimal();
                    break;
                case 3:
                    mostrarAnimais();
                    break;
                case 4:
                    mostrarViveiros();
                    mostrarAquarios();
                    break;
            }
        }
    }
}
