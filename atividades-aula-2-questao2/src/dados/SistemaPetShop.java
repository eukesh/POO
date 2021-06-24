package dados;

import java.util.*;

public class SistemaPetShop   {
    
    private Veterinario [] veterinarios = new Veterinario[50];
    private int quantidadeVeterinarios = 0;

    Scanner scan = new Scanner(System.in);
    Scanner scanString = new Scanner(System.in);

    public SistemaPetShop(){

    }

    public void cadastrarVeterinario(){

        System.out.println("\nDigite o nome do veterinario: ");
        System.out.printf("\n->");
        String nome = scanString.nextLine();
        System.out.println("\nDigite o salario: ");
        System.out.printf("\n->");
        int salario = scan.nextInt();

        this.veterinarios[this.quantidadeVeterinarios] = new Veterinario();
        this.veterinarios[this.quantidadeVeterinarios].setNome(nome);
        this.veterinarios[this.quantidadeVeterinarios].setSalario(salario);
        this.quantidadeVeterinarios++;

    }

    public void cadastrarEnderecoVeterinario(){

        System.out.println("\nQual veterinario deseja?\n");
        for(int i = 0 ; i < this.quantidadeVeterinarios ; i++){
            System.out.printf("Veterinario "+(i+1)+": ");
            System.out.println(this.veterinarios[i].getNome());
        }
        System.out.printf("\n->");
        int key = scan.nextInt();

        Endereco enderecoVeterinario = new Endereco();

        System.out.printf("\nDigite o nome da rua: ");
        enderecoVeterinario.setRua(scanString.nextLine());
        System.out.printf("Digite o numero: ");
        enderecoVeterinario.setNumero(scan.nextInt());
        System.out.printf("Digite o nome do bairro: ");
        enderecoVeterinario.setBairro(scanString.nextLine());
        System.out.printf("Digite o nome da cidade: ");
        enderecoVeterinario.setCidade(scanString.nextLine());
        System.out.printf("Digite o estado: ");
        enderecoVeterinario.setEstado(scanString.nextLine());
        System.out.printf("Digite o cep: ");
        enderecoVeterinario.setCep(scan.nextInt());

        this.veterinarios[key-1].setEnderecoVeterinario(enderecoVeterinario);
    }

    public void mostrarVeterinario(){

        for(int i = 0 ; i < this.quantidadeVeterinarios ; i++){
            System.out.println("\nVeterinario "+(i+1)+":");
            System.out.println("Nome: "+veterinarios[i].getNome());
            System.out.println("Salario: "+veterinarios[i].getSalario());
            System.out.println("Rua: "+veterinarios[i].getEndereco().getRua());
            System.out.println("Numero: "+veterinarios[i].getEndereco().getNumero());
            System.out.println("Bairro: "+veterinarios[i].getEndereco().getBairro());
            System.out.println("Cidade: "+veterinarios[i].getEndereco().getCidade());
            System.out.println("Estado: "+veterinarios[i].getEndereco().getEstado());
            System.out.println("CEP: "+veterinarios[i].getEndereco().getCep());
            System.out.println();
        }

    }

    public void cadastrarAnimal(){

        System.out.println("\n\nQual veterinario deseja utilizar?\n");
        for(int i = 0 ; i < this.quantidadeVeterinarios ; i++){
            System.out.printf("\nVeterinario "+(i+1)+": ");
            System.out.println(this.veterinarios[i].getNome());
        }
        System.out.printf("\n\n->");
        int key = scan.nextInt();

        Animais animalVeterinario = new Animais();

        System.out.printf("\n\nDigite o nome do animal: ");
        animalVeterinario.setNome(scanString.nextLine());
        System.out.printf("Digite a espécie: ");
        animalVeterinario.setEspecie(scanString.nextLine());
        System.out.printf("Digite a descrição do animal: ");
        animalVeterinario.setDescricao(scanString.nextLine());

        this.veterinarios[key-1].setAnimais(animalVeterinario);

    }

    public void mostrarAnimais(){

        System.out.println("\n\nQual veterinario deseja Consultar?");
        for(int i = 0 ; i < this.quantidadeVeterinarios ; i++){
            System.out.printf("\nVeterinario "+(i+1)+": ");
            System.out.println(this.veterinarios[i].getNome());
        }
        System.out.printf("\n->");
        int key = scan.nextInt();

        for(int i = 0 ; i < this.veterinarios[key-1].getQuantidadeAnimais(); i++){
            System.out.println("\nAnimal "+(i+1)+":");
            System.out.println("Nome: "+veterinarios[key-1].getAnimais(i).getNome());
            System.out.println("Especie: "+veterinarios[key-1].getAnimais(i).getEspecie());
            System.out.println("Descrição: "+veterinarios[key-1].getAnimais(i).getDescricao());
            System.out.println("Dono: "+veterinarios[key-1].getAnimais(i).getDono().getNome());
            System.out.println("CPF do Dono: "+veterinarios[key-1].getAnimais(i).getDono().getCpf());
            System.out.println("Dono: "+veterinarios[key-1].getAnimais(i).getDono().getNome());
            System.out.println("Rua: "+veterinarios[key-1].getAnimais(i).getDono().getEndereco().getRua());
            System.out.println("Numero: "+veterinarios[key-1].getAnimais(i).getDono().getEndereco().getNumero());
            System.out.println("Bairro: "+veterinarios[key-1].getAnimais(i).getDono().getEndereco().getBairro());
            System.out.println("Cidade: "+veterinarios[key-1].getAnimais(i).getDono().getEndereco().getCidade());
            System.out.println("Estado: "+veterinarios[key-1].getAnimais(i).getDono().getEndereco().getEstado());
            System.out.println("Cep: "+veterinarios[key-1].getAnimais(i).getDono().getEndereco().getCep());
            System.out.println();
            
        }

    }

    public void cadastrarDono(){
        
        System.out.println("\n\nQual o veterinário do animal?");
        for(int i = 0 ; i < this.quantidadeVeterinarios ; i++){
            System.out.printf("\nVeterinario "+(i+1)+": ");
            System.out.println(this.veterinarios[i].getNome());
        }
        System.out.printf("\n->");
        int key1 = scan.nextInt();

        System.out.println("\nQual Animal deseja cadastrar o Dono?\n");
        for(int i = 0 ; i < this.veterinarios[key1-1].getQuantidadeAnimais(); i++){
            System.out.printf("Animal "+(i+1)+": ");
            System.out.println(veterinarios[key1-1].getAnimais(i).getNome());
            System.out.println();
        }
        System.out.printf("\n->");
        int key2 = scan.nextInt();    
        
        Dono donoAnimal = new Dono();

        System.out.printf("\nNome do Dono: ");
        donoAnimal.setNome(scanString.nextLine());
        System.out.printf("CPF do Dono: ");
        donoAnimal.setCpf(scanString.nextLine());

        this.veterinarios[key1-1].getAnimais(key2-1).setDono(donoAnimal);

    }

    public void cadastrarEnderecoDono(){

        System.out.println("\n\nQual o veterinário do animal?");
        for(int i = 0 ; i < this.quantidadeVeterinarios ; i++){
            System.out.printf("\nVeterinario "+(i+1)+": ");
            System.out.println(this.veterinarios[i].getNome());
        }
        System.out.printf("\n->");
        int key1 = scan.nextInt();

        System.out.println("\n\nQual Animal deseja cadastrar o Dono?");
        for(int i = 0 ; i < this.veterinarios[key1-1].getQuantidadeAnimais(); i++){
            System.out.printf("\nAnimal "+(i+1)+": ");
            System.out.println(veterinarios[key1-1].getAnimais(i).getNome());
            System.out.println();
        }
        System.out.printf("->");
        int key2 = scan.nextInt();    
        
        System.out.println("\n\nDono: "+veterinarios[key1-1].getAnimais(key2-1).getDono().getNome());
        System.out.println("CPF do Dono: "+veterinarios[key1-1].getAnimais(key2-1).getDono().getCpf());

        Endereco enderecoDono = new Endereco();

        System.out.printf("\nDigite o nome da rua: ");
        enderecoDono.setRua(scanString.nextLine());
        System.out.printf("Digite o numero: ");
        enderecoDono.setNumero(scan.nextInt());
        System.out.printf("Digite o nome do bairro: ");
        enderecoDono.setBairro(scanString.nextLine());
        System.out.printf("Digite o nome da cidade: ");
        enderecoDono.setCidade(scanString.nextLine());
        System.out.printf("Digite o estado: ");
        enderecoDono.setEstado(scanString.nextLine());
        System.out.printf("Digite o cep: ");
        enderecoDono.setCep(scan.nextInt());

        this.veterinarios[key1-1].getAnimais(key2-1).getDono().setEnderecoDono(enderecoDono);

    }

}