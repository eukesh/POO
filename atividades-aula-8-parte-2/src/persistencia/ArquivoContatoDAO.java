package persistencia;

import java.util.LinkedList;
import java.util.List;

import dados.Contato;

public class ArquivoContatoDAO {
    private final String caminho = "C:\\Users\\User\\Documents\\Code\\POO\\workspace\\atividades-aula-8-parte-2\\src\\contatos.csv";
    private static EditorTexto arquivo = new EditorTexto();

    private String toCSV(Contato pessoa) {
        String p = "";
        p += pessoa.getNome() + ",";
        p += pessoa.getTelefone() + ",\n";

        return p;
    }
    private String toCSVLista(Contato pessoa) {
        String p = "";
        p += pessoa.getNome() + ",";
        p += pessoa.getTelefone() + ",";

        return p;
    }

    private Contato fromCSV(String linhaCSV) {
        String[] atributos = linhaCSV.split(",");
        Contato pessoa = new Contato();
        pessoa.setNome(atributos[0]);
        pessoa.setTelefone(Integer.parseInt(atributos[1]));

        return pessoa;
    }

    private List<String> listaPessoaToString(List<Contato> pessoas) {
        List<String> arquivo = new LinkedList<String>();

        for (Contato pessoa : pessoas) {
            arquivo.add(toCSVLista(pessoa));
        }

        return arquivo;
    }

    private List<Contato> stringToListaPessoa(List<String> arquivo) {
        List<Contato> pessoas = new LinkedList<Contato>();

        for (String linha : arquivo) {
            pessoas.add(fromCSV(linha));
        }

        return pessoas;
    }

    public List<Contato> lePessoasArquivo() {
        return stringToListaPessoa(arquivo.leTexto(caminho));
    }

    public void salvaPessoasArquivo(List<Contato> pessoas) {
        arquivo.gravaTexto(caminho, listaPessoaToString(pessoas));
    }

    public void salvaPessoaArquivo(Contato pessoa) {
        arquivo.gravaTexto(caminho, toCSV(pessoa));
    }

}
