package dados;

public class Imovel {
    private float largura;
    private float comprimento;
    private float valor;

    public Imovel() {

    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getLargura() {
        return largura;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getComprimento() {
        return comprimento;

    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public float areaTotal() {
        return largura * comprimento;
    }

    public String toString() {
        StringBuffer string = new StringBuffer();
        String.append("Comprimento: " + comprimento+"Largura: " +largura+"Valor: " + valor);
        return string.toString();
    }

}