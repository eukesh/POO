package dados;

public class Fatoriais extends Gerador {

    @Override
    public void gerar(int quantity) {

        for (int i = 1; i < quantity; i++) {
            sequencia.add(fat(i));
        }

    }

    private int fat(int a) {
        if (a <= 1) {
            return 1;
        } else {
            a = a * fat(a - 1);
            return a;
        }
    }

}
