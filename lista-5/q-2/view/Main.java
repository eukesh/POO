package view;

import exception.ProcessoSemJuizException;
import model.Juiz;
import model.Processo;
import model.SistemaProcessos;


public class Main {
    static SistemaProcessos sistema = new SistemaProcessos();

    public static void main(String[] args) throws ProcessoSemJuizException {
        int limiteJuiz = 5;
        for (int i = 0; i < 3; i++) {
            Juiz j = new Juiz(limiteJuiz);
            j.setNome("Juiz "+i);
            sistema.cadastrarJuiz(j);
        }

        for (int i = 0; i < 18 ; i++){
            Processo p = new Processo();
            p.setId(i);
            p.setNome("Processo "+i);
            sistema.cadastrarProcesso(p);
        }

        sistema.distribuiProcessos();
    }
}
