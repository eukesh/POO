package negocio;

import dados.*;

public class Zoologico {

    private Animal[] animais = new Animal[50];
    private Viveiro[] viveiros = new Viveiro[50];
    private int quantViveiros = 0;
    private int quantAnimais = 0;

    public Zoologico() {

    }

    public void cadastrarViveiro(Viveiro viveiro) {
        viveiros[quantViveiros] = viveiro;
        quantViveiros++;
    }

    public void cadastrarAnimais(Animal animal) {
        animais[quantAnimais] = animal;
        quantAnimais++;
    }

    public Animal[] getAnimais() {
        return animais;
    }

    public boolean alocarAnimal(Animal animal, Viveiro viveiro) {
        if (viveiro instanceof Aquario) {
            if (animal instanceof Peixe) {

                if (viveiro.adicionarAnimal(animal)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            if (animal instanceof Peixe) {
                return false;
            } else {
                if (viveiro.adicionarAnimal(animal)) {
                    return true;
                } else {
                    return false;
                }
            }
        }

    }

    public Aquario[] getSoAquarios() {
        Aquario[] aquariosCast = new Aquario[quantViveiros];
        int pos = 0;
        for (int i = 0; i < quantViveiros; i++) {
            if (viveiros[i] instanceof Aquario) {
                aquariosCast[pos] = (Aquario) viveiros[i];
                pos++;
            }
        }

        return aquariosCast;
    }

    public Viveiro[] getSoViveiros() {
        Viveiro[] viveiroCast = new Viveiro[quantViveiros];
        int pos = 0;
        for (int i = 0; i < quantViveiros; i++) {
            if (viveiros[i] instanceof Aquario) {
                continue;
            } else {
                viveiroCast[pos] = viveiros[i];
                pos++;
            }
        }

        return viveiroCast;
    }

}
