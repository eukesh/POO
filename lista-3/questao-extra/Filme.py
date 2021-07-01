class Filme():

    def __init__(self, nome, ano, classificacao, nota):
        self.nome = nome
        self.ano = ano
        self.classificacao = classificacao
        self.nota = nota

    def setNome(self, nome):
        self.nome = nome

    def setAno(self, ano):
        self.ano = ano

    def setClassificacao(self, classificacao):
        self.classificacao = classificacao

    def setNota(self, nota):
        self.nota = nota

    def __repr__(self):
        return "{}\n{}\n{}\n{}".format(self.nome, self.ano, self.classificacao, self.nota)
