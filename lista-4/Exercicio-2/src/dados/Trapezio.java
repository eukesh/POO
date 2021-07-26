package dados;

public class Trapezio extends FormaGeometrica{

    private int altura;

    public void setBaseMenor(int valor){
        this.medida1 = valor;
    }

    public void setBaseMaior(int valor){
        this.medida2 = valor;
    }

    public void setAltura(int valor){
        this.altura = valor;
    }

    @Override
    public int calcularArea() {
        return (((this.medida2+this.medida1)*this.altura)/2);
    }

    @Override
    public int calcularPerimetro() {
        return (int)(4*(Math.sqrt(Math.pow(((this.medida1 - this.medida2)/2),2)))) ;
    }

    @Override
    public String toString() {
        return "Trapezio{" +
                "Base Menor=" + medida1+
                ",Base Maior=" + medida2 +
                ",altura=" + altura +
                ",Area=" + calcularArea() +
                ",Perimetro=" + calcularPerimetro() +
                '}';
    }
}
