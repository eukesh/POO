package dados;

import java.util.ArrayList;
import java.util.List;

public abstract class Gerador {
    List<Integer> sequencia = new ArrayList<Integer>();

    public Gerador() {

    }

    public void gerar(int quantity) {
        for (int i = 0; i < quantity; i++) {
            sequencia.add(i);
        }
    }

    public List<Integer> getSequencia() {
        return sequencia;
    }

}
