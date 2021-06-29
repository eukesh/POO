package dados;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Gerador implements ISequencia {
    List<Integer> sequencia = new ArrayList<Integer>();
    Random rand = new Random();

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

    @Override
    public int sortear() {
        int n = rand.nextInt(sequencia.size());

        return sequencia.get(n);
    }

    @Override
    public long somatorio() {
        int sum = 0;

        for (int i = 0; i < sequencia.size(); i++) {
            sum += sequencia.get(i);
        }

        return sum;
    }

    @Override
    public double mediaAritimetica() {
        return somatorio() / sequencia.size();
    }

    @Override
    public double mediaGeometrica() {
        int a = sequencia.get(0);
        for (int i = 1; i < sequencia.size(); i++) {
            a *= sequencia.get(i);
        }
        return Math.pow(a, 1.0 / sequencia.size());
    }

    @Override
    public double variancia() {
        double variancia = 0;

        for (int i = 0; i < sequencia.size(); i++) {
            variancia += (sequencia.get(i) - mediaAritimetica()) * (sequencia.get(i) - mediaAritimetica());
            variancia /= sequencia.size() - 1;
        }
        return variancia;
    }

    @Override
    public double desvioPadrao() {
        return Math.sqrt(variancia());
    }

    @Override
    public long amplitude() {
        long maior = sequencia.get(0), menor = sequencia.get(0);

        for (long x : sequencia) {
            if (x > maior) {
                maior = x;
            }
            if (x < menor) {
                menor = x;
            }
        }

        return maior - menor;

    }

}
