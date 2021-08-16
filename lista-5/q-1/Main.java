import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static Random r = new Random();
    public static void main(String[] args) {
        List<IOperacaoInteira> objetos = new ArrayList<>();
        objetos.add(new Soma());
        objetos.add(new Multiplicacao());
        objetos.add(new Mod());
        objetos.add(new Mdc());

        for (IOperacaoInteira objeto : objetos) {
            System.out.println(objeto + " :");
            int a = r.nextInt(100), b = r.nextInt(100);
            System.out.println("Números usados: " + a + ", " + b);
            System.out.println(objeto.executar(a, b));
            System.out.println();
        }
    }
}
