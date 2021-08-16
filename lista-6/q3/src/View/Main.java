package View;

import models.Cliente;
import models.Observador;
import models.Servidor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Servidor> servidores = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {
        for(int i = 0 ; i<5 ; i++){
            clientes.add(new Cliente());
        }

        for(int i = 0 ; i<3 ; i++){
            servidores.add(new Servidor("10.0.0."+i));
        }

        servidores.get(0).adicionar(clientes.get(0));
        servidores.get(0).adicionar(clientes.get(1));
        servidores.get(0).adicionar(clientes.get(2));
        servidores.get(1).adicionar(clientes.get(2));
        servidores.get(1).adicionar(clientes.get(3));
        servidores.get(1).adicionar(clientes.get(4));
        servidores.get(2).adicionar(clientes.get(0));
        servidores.get(2).adicionar(clientes.get(1));
        servidores.get(2).adicionar(clientes.get(3));
        servidores.get(2).adicionar(clientes.get(4));

        servidores.get(0).enviarMensagem("Mensagem servidor 1");
        servidores.get(1).enviarMensagem("Mensagem servidor 2");
        servidores.get(2).enviarMensagem("Mensagem servidor 3");


        for(Cliente x : clientes){
            System.out.println(x);
        }



    }

}
