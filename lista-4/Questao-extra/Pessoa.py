class Pessoa():
    def __init__(self, nome):
        self.nome = nome

    def setNome(self, nome):
        self.nome = nome

    def getNome(self):
        return self.nome

    def __repr__(self):
        return self.nome
