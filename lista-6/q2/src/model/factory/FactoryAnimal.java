package model.factory;

import model.models.*;

import java.util.ArrayList;
import java.util.List;

public class FactoryAnimal {
    public List<Integer> list = new ArrayList<>();
    private static FactoryAnimal instance = null;

    private FactoryAnimal(){}

    public static FactoryAnimal getInstance(){
        if(instance == null)
            instance = new FactoryAnimal();
        return instance;
    }

    public Animal createAnimal(Animais tipo){
        switch (tipo){
            case CAO:
                return new Cao();
            case GATO:
                return new Gato();
            case RATO:
                return new Rato();
            case SAPO:
                return new Sapo();
            case COBRA:
                return new Cobra();
            default:
                System.err.println("Tipo não especificado");
                return null;
        }
    }
}
