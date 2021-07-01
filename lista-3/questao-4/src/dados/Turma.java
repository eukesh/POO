package dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma {
    List<Aluno> alunos = new ArrayList<Aluno>();
    List<Equipe<Aluno>> equipes = new ArrayList<Equipe<Aluno>>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        ordenaAlunosPorMedia();
    }

    // Organizar adicao de todos 3 3 3 4(ultimo caso)
    public List<Equipe<Aluno>> separarEmEquipes() {
        List<Aluno> temp = alunos;

        int k = temp.size(), h = 0;
        while (k % 3 != 0) {

            k--;
            h++;
        }

        for (int i = 0; i < k / 3; i++) {
            Equipe<Aluno> e = new Equipe<Aluno>();
            equipes.add(e);
            equipes.get(i).setNome(Integer.toString(i));

            do {

                if (equipes.get(i).length == 2) {
                    equipes.get(i).setT(temp.get(temp.size() - 1));
                    temp.remove(temp.size() - 1);
                } else {
                    equipes.get(i).setT(temp.get(temp.size() - (temp.size() - 1)));
                    temp.remove(temp.size() - (temp.size() - 1));
                }

            } while (equipes.get(i).length < 3);

            ordenaAlunosPorMedia(temp);

        }

        while (temp.size() != 0) {
            equipes.get(equipes.size() - h).setT(temp.get(temp.size() - 1));
            temp.remove(temp.size() - 1);
            h--;
            ordenaAlunosPorMedia(temp);
        }

        return equipes;

    }

    private void ordenaAlunosPorMedia() {
        Collections.sort(this.alunos);
    }

    private void ordenaAlunosPorMedia(List<Aluno> a) {
        Collections.sort(this.alunos);
    }

}
