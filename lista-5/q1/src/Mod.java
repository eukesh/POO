public class Mod implements  IOperacaoInteira{

    @Override
    public int executar(int dividendo, int divisor) {
        int resto=dividendo;
        while(resto>=divisor){
            resto = resto-divisor;
        }
        return resto;
    }

    @Override
    public String toString() {
        return "Mod";
    }
}
