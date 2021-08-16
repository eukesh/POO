package model.factory;

import model.models.*;

public class FactoryAnimal {

    private FactoryAnimal instance = null;

    public FactoryAnimal getInstance(){
        if(this.instance == null)
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
