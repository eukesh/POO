from Ator import Ator
from Filme import Filme

ator1 = Ator()
ator1.setNome("Angelina Silveira")
ator1.setIdade(47)
ator2 = Ator("Tom Cruise", 58)

filme1 = Filme()
filme1.setNome("Velozes e Furiosos")
filme1.setLancamento("22/04/2021")
filme1.setDuracao("1:23")
filme1.setElenco(ator1)
filme1.setElenco(ator2)

filme2 = Filme("Vivendo e Aprendendo", "03/05/1999", "2:01")
filme2.setElenco(ator1)
filme2.setElenco(ator2)

print(filme1)
print("\t Elenco:")
for i in filme1.getElenco():
    print("\t", i)
print("\n")
print(filme2)
print("\t Elenco:")
for i in filme2.getElenco():
    print("\t", i)
