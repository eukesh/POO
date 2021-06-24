package dados;

public class Perfeitos extends Gerador {

    @Override
    public void gerar(int quantity) {

        for (int i = 1; i < quantity; i++) {
            if (perfeito(i)) {
                sequencia.add(i);
            }
        }

    }

    private boolean perfeito(int a) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        if (sum == a) {
            return true;
        } else {
            return false;
        }

    }

}
