package dados;

public class NumeroPrimos extends Gerador {

    @Override
    public void gerar(int quantity) {

        for (int i = 2; i < quantity; i++) {
            if (primo(i)) {
                sequencia.add(i);
            }
        }

    }

    private boolean primo(int a) {
        int b = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                b++;
            }

        }
        if (b == 1) {
            return true;
        } else {
            return false;
        }
    }

}
