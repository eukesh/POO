package main;

import dados.Pessoa;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Map<String, List<Pessoa>> lista = new HashMap<String, List<Pessoa>>();

    public static void main(String args[]) {
        Scanner sc;
        initMap();
        try {
            sc = new Scanner(new File("file.txt"));
            createPessoaFile(sc);
        } catch (FileNotFoundException e) {
            sc = new Scanner(System.in);
            createPessoa(sc);
        }

    }

    public static void initMap() {
        String ageIndex[] = { "crianças", "adolescentes", "jovens", "adultos", "idosos" };

        for (int i = 0; i < ageIndex.length; i++) {
            List<Pessoa> pessoas = new ArrayList<Pessoa>();
            lista.put(ageIndex[i], pessoas);
        }

    }

    public static void createPessoaFile(Scanner sc) {

        do {
            Pessoa p = new Pessoa();
            String dataPessoa[] = new String[4], buffer;
            buffer = sc.nextLine();
            dataPessoa = buffer.split(",");

            if (dataPessoa[dataPessoa.length - 1].contains(";")) {
                dataPessoa[dataPessoa.length - 1] = dataPessoa[dataPessoa.length - 1].replace(";", "");
            }

            if (dataPessoa[1].contains(" ")) {
                dataPessoa[1] = dataPessoa[1].replace(" ", "");
            }

            p.setName(dataPessoa[0]);
            p.setAge(Integer.parseInt(dataPessoa[1]));
            p.setCpf(dataPessoa[2]);
            p.setCity(dataPessoa[3]);

            addPessoa(p);

            lista.forEach((key, value) -> {
                Collections.sort(value);
            });

            showPessoa();

        } while (sc.hasNext());
    }

    public static void showPessoa() {

        lista.forEach((key, value) -> {
            System.out.println(key + ": ");
            for (Pessoa x : value) {
                System.out.println("\t" + x);
            }
        });
    }

    public static void addPessoa(Pessoa p) {
        int index = p.getAge();

        if (index >= 1 && index <= 12) {
            List<Pessoa> pessoa = lista.get("crianças");
            pessoa.add(p);
        } else if (index >= 13 && index <= 18) {
            List<Pessoa> pessoa = lista.get("adolescentes");
            pessoa.add(p);
        } else if (index >= 19 && index <= 25) {
            List<Pessoa> pessoa = lista.get("jovens");
            pessoa.add(p);
        } else if (index >= 26 && index <= 59) {
            List<Pessoa> pessoa = lista.get("adultos");
            pessoa.add(p);
        } else if (index >= 60) {
            List<Pessoa> pessoa = lista.get("idosos");
            pessoa.add(p);
        }

    }

    public static void createPessoa(Scanner sc) {
        Scanner scStr = new Scanner(System.in);

        while (true) {
            Pessoa p = new Pessoa();
            System.out.println("\nAdicione uma nova pessoa: \n");

            System.out.print("Nome: ");
            String name = scStr.nextLine();
            if (name.equals("-1")) {
                break;
            } else {
                p.setName(name);
            }

            System.out.print("Cpf: ");
            String cpf = scStr.nextLine();
            if (cpf.equals("-1")) {
                break;
            } else {
                p.setCpf(cpf);
            }

            System.out.print("Cidade: ");
            String city = scStr.nextLine();
            if (city.equals("-1")) {
                break;
            } else {
                p.setCity(city);
            }

            System.out.print("Idade: ");
            int age = sc.nextInt();
            if (age == -1) {
                break;
            } else {
                p.setAge(age);
            }

            addPessoa(p);

            lista.forEach((key, value) -> {
                Collections.sort(value);
            });

            showPessoa();
        }
        scStr.close();

    }

}
