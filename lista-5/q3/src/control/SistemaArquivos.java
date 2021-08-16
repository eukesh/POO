package control;

import exception.NomeInvalidoException;
import model.*;

import java.util.*;
import java.util.concurrent.CountDownLatch;

public class SistemaArquivos {
    private Map<String, List<Arquivo>> diretorios = new HashMap<String, List<Arquivo>>();

    public SistemaArquivos(){
        List<Arquivo> temp = new LinkedList<Arquivo>();
        diretorios.put("Downloads",temp);
        List<Arquivo> temp2 = new LinkedList<Arquivo>();
        diretorios.put("Area de Trabalho",temp2);
    }

    public void criarDocumento(String nome,String diretorio,String texto) throws NomeInvalidoException {
        Documento d = new Documento(nome);
        d.setTexto(texto);
        diretorios.get(diretorio).add(d);
    }

    public void criarMusica(String nome,String diretorio,int duracao) throws NomeInvalidoException {
        Musica m = new Musica(nome);
        m.setDuracao(duracao);
        diretorios.get(diretorio).add(m);
    }

    public void criarVideo(String nome, String diretorio, Qualidade qualidade) throws NomeInvalidoException {
        Video v = new Video(nome);
        v.setQualidade(qualidade);
        diretorios.get(diretorio).add(v);
    }

    @Override
    public String toString() {
        StringBuffer a = new StringBuffer();
        for (String x : diretorios.keySet()) {
            a.append(x+"\n");
            for(Arquivo y : diretorios.get(x)){
                a.append("\t"+y+"\n");
            }
        }
        return a.toString();
    }
}
