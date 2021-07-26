from Aluno import Aluno
from Professor import Professor
import random

NOMES = ('Carlos', 'Eduardo', 'Jorge', 'Luiz',
         'Rafael', 'Jonathan', 'Ana', 'Marcela', 'Eduardo', 'Eduarda', 'Guilherme')


def gerarNotas():
    n = []
    for i in range(0, 5):
        n.append(round(random.uniform(0, 10), 2))
    return n


def gerarAlunos():
    alunos = []
    for i in range(0, 5):
        i = Aluno(random.choice(NOMES), gerarNotas())
        alunos.append(i)
    return alunos


def gerarProfessor():
    professor = []
    for i in range(0, 2):
        i = Professor(random.choice(NOMES), round(
            random.uniform(1000, 2000), 2))
        professor.append(i)

    return professor


if __name__ == "__main__":

    for i in gerarProfessor():
        print(i)

    for i in gerarAlunos():
        print(i)
