class Classe:
    pass

objetoDaClasse = Classe()

#Atributos podem ser associados de forma dinâmica sobre os objetos

objetoDaClasse.atributo_1 = "Atributo_1"
objetoDaClasse.atributo_2 = "Atributo_2"
objetoDaClasse.atributo_3 = "Atributo_3"

print(objetoDaClasse.atributo_1)

objetoDaClasse_2 = Classe()

objetoDaClasse_2.atributo_A = "Atributo_A"

print(objetoDaClasse_2.atributo_1)

