from Pessoa import Pessoa


class Aluno(Pessoa):

    def __init__(self, nome, notas=[]):
        super().__init__(nome)
        self.notas = notas

    def adicionarNotas(self, notas):
        self.notas = notas

    def adicionarNota(self, nota):
        self.notas.append(nota)

    def calcularMedia(self):
        soma = 0
        for nota in self.notas:
            soma += nota
        if soma == 0:
            return 0
        else:
            return soma/len(self.notas)

    def aprovado(self):
        if self.calcularMedia() >= 7:
            return True
        else:
            return False

    def __repr__(self):
        if self.aprovado() == True:
            return f'Aluno: {self.nome} - Notas: {self.notas} - Media: {round(self.calcularMedia(),2)} - Aprovado'
        else:
            return f'Aluno: {self.nome} - Notas: {self.notas} - Media: {round(self.calcularMedia(),2)} - Exame'


