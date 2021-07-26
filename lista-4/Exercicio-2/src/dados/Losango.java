package dados;

public class Losango extends FormaGeometrica{
    public void setD(int valor){
        this.medida1 = valor;
    }

    public void setd(int valor){
        this.medida2 = valor;
    }

    @Override
    public int calcularArea() {
        return ((medida2*medida1)/2);
    }

    @Override
    public int calcularPerimetro() {
        return (int)(4*(Math.sqrt((Math.pow(medida1,2)/4)+(Math.pow(medida2,2)/4))));
    }

    @Override
    public String toString() {
        return "Losango{" +
                "D=" + medida1 +
                ",d=" + medida2 +
                ",Area=" + calcularArea() +
                ",Perimetro=" + calcularPerimetro() +
                "}";
    }
}
