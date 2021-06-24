package dados;

public class Quadrados extends Gerador {

    @Override
    public void gerar(int quantity) {

        for (int i = 0; i < quantity; i++) {
            if (quadrado(i)) {
                sequencia.add(i);
            }
        }

    }

    private boolean quadrado(int a) {
        if ((((int) Math.sqrt(a)) - Math.sqrt(a)) == 0.0) {
            return true;
        } else {
            return false;
        }
    }

}
