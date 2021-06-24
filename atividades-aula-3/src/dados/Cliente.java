package dados;

public class Cliente {
    
    private String nome;
    private long cpf;
    private String endereco;
    private long telefone;
    private Reserva [] reservas = new Reserva[10];
    private int quantReservas = 0;

    public Cliente() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public long getTelefone() {
        return telefone;
    }

    public Reserva[] getReservas() {
        return reservas;
    }

    public void reservarIda(Reserva reserva){
        if(quantReservas<10){
            reservas[quantReservas] = reserva;
            quantReservas++;
        }else{ // ideal usar tratamento de exceção
            System.out.println("Lista cheia!");
        }
    }

    public void reservarVolta(Reserva ida, Reserva volta){
        ida.setVolta(volta);
    }

    public boolean equals(Object o){
        if(o instanceof Cliente){
            Cliente c = (Cliente) o;

            if(c.getCpf() == this.getCpf()){
                return true;
            }
        }
        return false;
    }

    public boolean comparaClientes(Cliente c1, Cliente c2){
        if(c1.equals(c2)){
            return true;
        }else{
            return false;
        }
    }

    public String toString() {
        return "Nome: "+nome+"\nCPF: "+cpf+"\nEndereco: "+endereco+"\nTelefone: "+telefone;
    }
}   


