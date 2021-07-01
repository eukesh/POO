import json
from Filme import Filme


def main():

    b = []
    campos = ['titulo', 'ano', 'classificacao', 'nota']

    with open('./questao-extra/imdb.json') as f:
        entrada = json.load(f)

    for elemento in entrada:
        t = []
        for campo in campos:
            t.append(elemento[campo])
            pass

        a = Filme(t[0], t[1], t[2], t[3])
        b.append(a)

    for i in b:
        print("\n=======")
        print(i)

    main()
