public class Soma implements IOperacaoInteira {


    @Override
    public int executar(int valor1, int valor2) {
        return valor1+valor2;
    }

    @Override
    public String toString() {
        return "Soma";
    }
}
