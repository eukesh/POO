from Ator import Ator


class Filme():

    def __init__(self, nome=0, lancamento=0, duracao=0):
        self.nome = nome
        self.lancamento = lancamento
        self.duracao = duracao
        self.quantElenco = 0
        self.elenco = []

    def setNome(self, nome):
        self.nome = nome

    def getNome(self):
        return self.nome

    def setLancamento(self, lancamento):
        self.lancamento = lancamento

    def getLancamento(self):
        return self.lancamento

    def setDuracao(self, duracao):
        self.duracao = duracao

    def getDuracao(self):
        return self.duracao

    def setElenco(self, ator):
        self.elenco.append(ator)
        self.quantElenco += 1

    def getElenco(self):
        return self.elenco

    def __str__(self):
        string = "Nome: {} | Lançamento: {} | Duração: {}".format(
            self.nome, self.lancamento, self.duracao)
        return string
