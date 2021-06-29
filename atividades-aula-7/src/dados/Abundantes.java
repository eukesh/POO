package dados;

public class Abundantes extends Gerador {

    @Override
    public void gerar(int quantity) {

        for (int i = 1; i < quantity; i++) {
            if (abundante(i)) {
                sequencia.add(i);
            }
        }

    }

    private boolean abundante(int a) {
        int sum = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }

        }

        if (a < sum) {
            return true;
        } else {
            return false;
        }

    }

}
