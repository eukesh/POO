package negocio;

import dados.*;

public class ReservaPassagem {

    private Cidade listaDeCidades[] = new Cidade[20];
    private Cliente listaDeClientes[] = new Cliente[20];
    private int quantCidades;
    private int quantClientes;

    public ReservaPassagem() {

    }

    public int getQuantClientes() {
        return quantClientes;
    }

    public int getQuantCidades() {
        return quantCidades;
    }

    public void cadastrarCidade(Cidade cidade) {
        if (quantCidades < listaDeCidades.length) {
            listaDeCidades[quantCidades] = cidade;
            quantCidades++;
        } else {
            System.out.println("Número máximo de cidades cadastradas alcançado.");
        }
    }

    public void cadastrarCliente(Cliente cliente) {
        if (quantClientes < listaDeClientes.length) {
            listaDeClientes[quantClientes] = cliente;
            quantClientes++;
        } else {
            System.out.println("Número máximo de clientes cadastradas alcançado.");
        }
    }

    public void reservaIda(Cliente cliente, Reserva reserva) {
        if (clienteCadastrado(cliente)) {
            cliente.reservarIda(reserva);
        } else {
            System.out.println("Cliente não cadastrado");
        }
    }

    public void reservarVolta(Cliente cliente, Reserva reservaIda, Reserva reservaVolta) {
        if (clienteCadastrado(cliente)) {
            cliente.reservarVolta(reservaIda, reservaVolta);
        } else {
            System.out.println("Cliente não cadastrado");
        }
    }

    public boolean clienteCadastrado(Cliente cliente) {
        for (int i = 0; i < quantClientes; i++) {
            if (listaDeClientes[i].equals(cliente)) {
                return true;
            }

        }

        return false;
    }

    public Reserva[] mostrarReservas(long cpfCliente) {
        for (int i = 0; i < listaDeClientes.length; i++) {
            if (listaDeClientes[i].getCpf() == cpfCliente) {
                for (int j = 0; j < listaDeClientes[i].getReservas().length; j++) {
                    return listaDeClientes[j].getReservas();
                }
            }

        }

        return null;
    }

    public Cliente[] mostrarClientes() {
        return listaDeClientes;
    }

    public Cidade[] mostrarCidades() {
        return listaDeCidades;
    }

}