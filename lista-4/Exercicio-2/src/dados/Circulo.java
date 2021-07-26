package dados;

public class Circulo extends FormaGeometrica{

    public void setRaio(int valor){
        this.medida1 = valor;
    }

    @Override
    public int calcularArea() {
        return (int) (Math.PI * Math.pow(medida1,2));
    }

    @Override
    public int calcularPerimetro() {
        return (int)(Math.PI * (2*medida1));
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "Raio=" + medida1 +
                ",Area=" + calcularArea() +
                ",Perimetro=" + calcularPerimetro() +
                '}';
    }

}
