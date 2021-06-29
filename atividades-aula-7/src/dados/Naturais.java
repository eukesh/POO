package dados;

public class Naturais extends Gerador {

    @Override
    public void gerar(int quantity) {

        for (int i = 0; i < quantity; i++) {
            super.sequencia.add(i);
        }

    }

}
