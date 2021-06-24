package dados;

public class Reserva {
    
    private int numReserva;
    private String dataVoo;
    private String horaVoo;
    private float preco;
    private String classeVoo;
    private boolean idaEvolta = false;
    private int poltrona;
    private Reserva volta;
    private Cidade origem;
    private Cidade destino;

    public Reserva(){
    }

    public void setNumReserva(int numReserva) {
        this.numReserva = numReserva;
    }

    public int getNumReserva() {
        return numReserva;
    }

    public void setDataVoo(String dataVoo) {
        this.dataVoo = dataVoo;
    }

    public String getDataVoo() {
        return dataVoo;
    }

    public void setHoraVoo(String horaVoo) {
        this.horaVoo = horaVoo;
    }

    public String getHoraVoo() {
        return horaVoo;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setClasseVoo(String classeVoo) {
        this.classeVoo = classeVoo;
    }

    public String getClasseVoo() {
        return classeVoo;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    
    public int getPoltrona() {
        return poltrona;
    }

    public void setDestino(Cidade destino) {
        this.destino = destino;
    }

    public Cidade getDestino() {
        return destino;
    }

    public void setOrigem(Cidade origem) {
        this.origem = origem;
    }

    public Cidade getOrigem() {
        return origem;
    }

    public void setVolta(Reserva volta) {
        this.idaEvolta = true;
        this.volta = volta;
    }

    public Reserva getVolta() {
        return volta;
    }

    public String toString(){
        return "\nReserva:\nNúmero: "+numReserva+"\nDia: "+dataVoo+"\nHora: "+horaVoo+"\nPreço: "+preco+"\nClasse: "+classeVoo+"\nPoltrona: "+poltrona+"\nVolta: "+idaEvolta+"\nOrigem:"+origem+"\nDestino:"+destino;
    }
}
