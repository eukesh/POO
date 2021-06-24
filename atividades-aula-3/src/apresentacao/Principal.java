package apresentacao;

import dados.*;
import negocio.ReservaPassagem;
import java.util.*;

public class Principal {
    
    private static Scanner scan = new Scanner(System.in);
    private static Scanner scanString = new Scanner(System.in);
    private static ReservaPassagem sistema = new ReservaPassagem();

    public static void exibeMenu(){
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Encerrar");
        System.out.println("1 - Realizar Reserva");
        System.out.println("2 - Cadastrar Cliente");
        System.out.println("3 - Cadastrar Cidade");
        System.out.println("4 - Mostrar Reservas");
        System.out.println("5 - Mostrar Clientes");

    }

    public static void main(String[] args){
        int option = -1;

        while(option != 0){
            exibeMenu();
            option = scan.nextInt();
            switch(option){
                case 0:
                    System.out.println("Até logo!");
                    break;
                case 1:
                    System.out.println("Realizar Reserva!");
                    realizarReserva();
                    break;
                case 2:
                    System.out.println("Cadastrar Cliente");
                    cadastrarCliente();
                    break;  
                case 3:
                    System.out.println("Cadastrar Cidade");
                    cadastraCidades();
                    break;
                case 4:
                    System.out.println("Mostrar  Reserva");
                    mostrarReserva();
                    break;
                case 5:
                    System.out.println("Mostrar  Clientes");
                    mostrarClientes();
                    break;  
                default:
                System.out.println("Opção inválida");
            }
        }
    }

    public static void cadastraCidades(){
        Cidade newCidade = new Cidade();
        System.out.println("Digite o nome: ");
        newCidade.setNome(scanString.nextLine());
        System.out.println("Digite o estado: ");
        newCidade.setEstado(scanString.nextLine());

        sistema.cadastrarCidade(newCidade);
    }

    public static void mostrarReserva(){
        System.out.println("Qual o CPF do Cliente?");
        long cpfCliente = scan.nextLong();
        for(int i=0; i<sistema.mostrarReservas(cpfCliente).length; i++){

            System.out.println(sistema.mostrarReservas(cpfCliente)[i]);
        }
    }

    public static void mostrarCidades(){
        for(int i = 0; i < sistema.getQuantCidades();i++){
            System.out.println("Cidade "+(i+1)+": ");
            System.out.println(sistema.mostrarCidades()[i]+"");
        }
    }
    
    public static void realizarReserva(){
        int key4;
        mostrarClientes();
        System.out.println("Qual cliente?");
        int key  = scan.nextInt();

        Reserva newReserva = new Reserva();
        Reserva newReserva2 = new Reserva();
        System.out.println("Numero da Reserva: ");
        newReserva.setNumReserva(scan.nextInt());
        System.out.println("Data do Voo: ");
        newReserva.setDataVoo(scanString.nextLine());
        System.out.println("Hora do Voo: ");
        newReserva.setHoraVoo(scanString.nextLine());
        System.out.println("Preço: ");
        newReserva.setPreco(scan.nextFloat());
        System.out.println("Classe: ");
        newReserva.setClasseVoo(scanString.nextLine());
        System.out.println("Poltrona: ");
        newReserva.setPoltrona(scan.nextInt());

        mostrarCidades();
        System.out.println("Qual Cidade Origem?");
        int key3 = scan.nextInt();
        newReserva.setOrigem(sistema.mostrarCidades()[key3-1]);
        System.out.println("Qual Cidade Destino?");
        key3 = scan.nextInt();
        newReserva.setDestino(sistema.mostrarCidades()[key3-1]);

        System.out.println("Deseja efetuar uma reserva de volta?\n1 - Sim\n2 - Não");
        int key2 = scan.nextInt();
        if(key2 == 1){
            
            System.out.println("Numero da Reserva: ");
            newReserva2.setNumReserva(scan.nextInt());
            System.out.println("Data do Voo: ");
            newReserva2.setDataVoo(scanString.nextLine());
            System.out.println("Hora do Voo: ");
            newReserva2.setHoraVoo(scanString.nextLine());
            System.out.println("Preço: ");
            newReserva2.setPreco(scan.nextFloat());
            System.out.println("Classe: ");
            newReserva2.setClasseVoo(scan.nextLine());
            System.out.println("Poltrona: ");
            newReserva2.setPoltrona(scan.nextInt());
    
            mostrarCidades();
            System.out.println("Qual Cidade Origem?");
            key4 = scan.nextInt();
            newReserva2.setOrigem(sistema.mostrarCidades()[key4-1]);
            System.out.println("Qual Cidade Destino?");
            key4 = scan.nextInt();
            newReserva2.setDestino(sistema.mostrarCidades()[key4-1]);

        }

        sistema.reservaIda(sistema.mostrarClientes()[key-1],newReserva);
        sistema.reservarVolta(sistema.mostrarClientes()[key-1],newReserva,newReserva2);

    }

    public static void mostrarClientes(){
        for(int i = 0; i < sistema.getQuantClientes();i++){
            System.out.println("Cliente "+(i+1)+": ");
            System.out.println(sistema.mostrarClientes()[i]+"\n");
        }
    }

    public static Cliente newCliente(){
        Cliente novoCliente = new Cliente();
        System.out.println("Digite o CPF:");
        novoCliente.setCpf(scan.nextLong());
        System.out.println("Digite o Nome:");
        novoCliente.setNome(scanString.nextLine());
        System.out.println("Digite o endereco:");
        novoCliente.setEndereco(scanString.nextLine());
        System.out.println("Digite o Telefone:");
        novoCliente.setTelefone(scan.nextLong());

        return novoCliente;
    }

    public static void cadastrarCliente(){
        sistema.cadastrarCliente(newCliente());        
    }
}