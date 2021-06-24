package dados;

public class Imobiliaria {
    private String nome;
    private Imovel[] imoveis = new Imovel[50];
    private int quantImoveis = 0;

    public Imobiliaria() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setImoveis(Imovel imovel) {
        imoveis[quantImoveis] = imovel;
        quantImoveis++;
    }

    public Imovel[] getImoveis() {
        return imoveis;
    }

    public Imovel[] filtrarPorArea(float x) {
        int buffer = 0;
        Imovel[] imovelBuffer = new Imovel[50];
        for (int i = 0; i < quantImoveis; i++) {
            if (imoveis[i].areaTotal() >= x) {
                imovelBuffer[buffer] = imoveis[i];
                buffer++;
            }

        }
        Imovel aux = new Imovel();
        for (int i = 0; i < buffer; i++) {
            for (int j = i + 1; j < buffer; j++) {
                if (imovelBuffer[i].getValor() > imovelBuffer[j].getValor()) {
                    aux = imovelBuffer[i];
                    imovelBuffer[i] = imovelBuffer[j];
                    imovelBuffer[j] = aux;
                }
            }

        }

        return imovelBuffer;
    }

    @Override
    public String toString() {
        System.out.println("Nome: " + nome);
        System.out.println("\nImoveis: ");
        for (Imovel x : imoveis) {
            System.out.println(x);
        }

        return "Fim";
    }

}
