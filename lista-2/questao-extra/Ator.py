import random


class Ator():

    def __init__(self, nome=0, idade=0):
        self.nome = nome
        self.idade = idade
        self.identificador = random.randint(1, 10000)

    def setNome(self, nome):
        self.nome = nome

    def getNome(self):
        return self.nome

    def setIdade(self, idade):
        self.idade = idade

    def getNome(self):
        return self.nome

    def getIdentificador(self):
        return self.identificador

    def __str__(self):
        string = "identificador: {} | Nome: {} | Idade: {}".format(
            self.identificador, self.nome, self.idade)
        return string
