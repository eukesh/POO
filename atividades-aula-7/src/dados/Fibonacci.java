package dados;

public class Fibonacci extends Gerador {

    @Override
    public void gerar(int quantity) {

        for (int i = 1; i < quantity; i++) {
            sequencia.add(fibo(i));
        }
    }

    private int fibo(int a) {
        if (a == 1) {
            return 0;
        } else if (a == 2) {
            return 1;
        } else {
            int sum = sequencia.get(a - 3) + sequencia.get(a - 2);
            return sum;

        }

    }

}
