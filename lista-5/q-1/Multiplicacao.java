public class Multiplicacao extends Soma{
    @Override
    public int executar(int valor1, int valor2) {
        int res=valor1;
        for (int i = 1; i < valor2; i++) {
            res=super.executar(res,valor1);
        }
        return res;
    }

    @Override
    public String toString() {
        return "Multiplicacao";
    }
}
