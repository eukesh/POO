import control.SistemaArquivos;
import exception.NomeInvalidoException;
import model.Qualidade;

public class Main {


    public static void main(String[] args) throws NomeInvalidoException {
        SistemaArquivos sistema = new SistemaArquivos();
        sistema.criarDocumento("Texto de exemplo numero 1","Downloads","Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        sistema.criarDocumento("Texto de exemplo numero 2","Area de Trabalho","Lorem Ipsum is simply dummy text of the printing and typesetting industry");
        sistema.criarMusica("Imagine Dragons - Dream","Downloads",342);
        sistema.criarMusica("Exaltasamba - Samba e pagode","Downloads",123);
        sistema.criarMusica("Djonga - Hoje Não","Area de Trabalho",434);
        sistema.criarVideo("Video 1 nao sei o que e","Area de Trabalho", Qualidade.p240);
        sistema.criarVideo("Video 2 nao sei o que e","Downloads", Qualidade.p1024);

        System.out.println(sistema);
    }
}
