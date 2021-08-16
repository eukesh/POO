
public class Mdc implements IOperacaoInteira{

    Mod mod = new Mod();

    @Override
    public int executar(int valor1, int valor2) {
        int aux;
        while(valor2 !=0){
            aux = mod.executar(valor1,valor2);
            valor1 = valor2;
            valor2 = aux;
        }
        return valor1;
    }

    @Override
    public String toString() {
        return "MDC";
    }
}
