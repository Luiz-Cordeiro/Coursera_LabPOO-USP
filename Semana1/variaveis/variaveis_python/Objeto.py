class Objeto:
    variavelClasse = "Essa eh um variavel de classe"

    #CONSTRUTOR
    def __init__(self, variavel):
        # self indica o objeto em particular
        self.variavelObjeto = variavel
        #Objeto. indica a variavel de classe
        Objeto.variavelClasse = variavel

    def setVariavelClasse2(self, variavel):
        self.variavelClasse = variavel

    def imprime(self):
        print('Essa eh a variavei de objeto:', self.variavelObjeto, end="\n")
        print('Essa eh a variavei de classe:', self.variavelClasse, end="\n")

        



