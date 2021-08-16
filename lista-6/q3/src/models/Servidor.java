package models;

import java.util.ArrayList;
import java.util.List;

public class Servidor implements Sujeito{
    private String ip;
    private String lastMenssage;
    private List<Observador> observadores = new ArrayList<>();

    public Servidor(String ip){this.ip = ip;}

    public void enviarMensagem(String mensagem){
        lastMenssage = mensagem;
        notificar();
    }

    @Override
    public void adicionar(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void remover(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificar() {
        for(Observador x : observadores){
            x.atualizar(this.ip+", "+this.lastMenssage);
        }
    }

    @Override
    public String toString() {
        return "Servidor{" +
                "ip='" + ip + '\'' +
                '}';
    }
}
