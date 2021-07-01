package main;

import dados.Aluno;
import dados.Turma;
import dados.Equipe;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class Main {

    static Turma turma = new Turma();

    public static void main(String args[]) {
        Scanner sc;
        try {
            sc = new Scanner(new File("file.txt")); // file localizado na raiz do da pasta
            createAlunoFile(sc);
        } catch (FileNotFoundException e) {
            sc = new Scanner(System.in);
            createAluno(sc);
        }

        showTurma();

    }

    public static void createAlunoFile(Scanner sc) {

        do {
            Aluno p = new Aluno();
            String dataAluno[] = new String[7], buffer;
            buffer = sc.nextLine();
            dataAluno = buffer.split(",");

            if (dataAluno[dataAluno.length - 1].contains(";")) {
                dataAluno[dataAluno.length - 1] = dataAluno[dataAluno.length - 1].replace(";", "");
            }

            if (dataAluno[1].contains(" ")) {
                dataAluno[1] = dataAluno[1].replace(" ", "");
            }

            p.setNome(dataAluno[0]);
            p.setIdade(Integer.parseInt(dataAluno[1]));

            List<Double> n = new ArrayList<Double>();
            for (int i = 2; i < 7; i++) {
                n.add(Double.parseDouble(dataAluno[i]));
            }
            p.setNotas(n);

            addAluno(p);

        } while (sc.hasNext());
    }

    public static void showTurma() {

        for (Equipe<Aluno> x : turma.separarEmEquipes()) {
            System.out.println("\nEquipe: " + x);
            for (Object o : x.getT()) {
                System.out.println(o);
            }
        }
    }

    public static void addAluno(Aluno p) {
        turma.adicionarAluno(p);
    }

    public static void createAluno(Scanner sc) {
        Scanner scStr = new Scanner(System.in);

        while (true) {
            Aluno p = new Aluno();
            System.out.println("\nAdicione uma nova Aluno: \n");

            System.out.print("Nome: ");
            String name = scStr.nextLine();
            if (name.equals("-1")) {
                break;
            } else {
                p.setNome(name);
            }

            System.out.print("Idade: ");
            int age = sc.nextInt();
            if (age == -1) {
                break;
            } else {
                p.setIdade(age);
            }

            List<Double> n = new ArrayList<Double>();
            for (int i = 0; i < 10; i++) {
                n.add(sc.nextDouble());
            }
            p.setNotas(n);

            addAluno(p);

        }

        scStr.close();

    }

}
