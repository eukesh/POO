package dados;

import java.util.Objects;

public class Peixe extends Animal {

    private float temperaturaIdeal;

    public Peixe() {
        super();
    }

    public void setTemperaturaIdeal(float temperaturaIdeal) {
        this.temperaturaIdeal = temperaturaIdeal;
    }

    public float getTemperaturaIdeal() {
        return temperaturaIdeal;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Peixe);
    }

    @Override
    public float calculaEspacoOcupado() {
        return (altura * comprimento * largura);
    }

}
