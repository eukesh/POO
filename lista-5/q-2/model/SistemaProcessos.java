package model;

import exception.PilhaCheiaException;
import exception.ProcessoSemJuizException;

import java.util.ArrayList;
import java.util.List;

public class SistemaProcessos {
    private List<Processo> processos = new ArrayList<Processo>();
    private List<Juiz> juizes = new ArrayList<Juiz>();

    public void cadastrarProcesso(Processo p){
        processos.add(p);
    }

    public void cadastrarJuiz(Juiz j){
        juizes.add(j);
    }

    public void distribuiProcessos() throws ProcessoSemJuizException {
        for(Juiz j : juizes){
            for( int i = 0; i < processos.size() ; i=0){

                try{
                    j.cadastrarProcesso(processos.get(i));
                    processos.remove(processos.get(i));
                } catch (PilhaCheiaException e) {
                    break;
                }
            }
        }
        if(processos.size()!=0)
            throw new ProcessoSemJuizException("Processo Sem Juiz");
    }


}
