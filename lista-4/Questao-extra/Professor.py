from Pessoa import Pessoa


class Professor(Pessoa):
    def __init__(self, nome, salario=0):
        super().__init__(nome)
        self.salario = salario

    def setSalario(self, salario):
        self.salario = salario

    def getSalario(self):
        return self.salario

    def __repr__(self):
        return f'Professor: {self.nome} - Salario: R$ {self.salario}'
