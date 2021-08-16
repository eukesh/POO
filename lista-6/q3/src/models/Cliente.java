package models;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements Observador{

    private List<String> mensagens = new ArrayList<>();

    public List<String> getMensagens() {
        return mensagens;
    }

    @Override
    public void atualizar(Object mensagem) {
        mensagens.add("Servidor IP: "+(String) mensagem+" | ");
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "mensagens=" + mensagens +
                '}';
    }
}
