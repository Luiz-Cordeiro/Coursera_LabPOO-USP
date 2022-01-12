class Poligono:
    def __init__(self, numero_de_lados):
        self.n = numero_de_lados
        self.lados = [0 for i in range(numero_de_lados)]

    def le_lados(self):     
        self.lados = [float(input("Digite o tamanho do lado " + str(i+1) + ": "))  for i in range(self.n)]

    def mostra_lados(self):
        for i in range(self.n):
            print("Lado", i+1,"tem comprimento", self.lados[i])
    

class Triangulo(Poligono):
    #Aqui declara-se que a classe Triangulo herda Poligono
    def __init__(self):
        #Dentro do construtor, declaramos os parâmetros para a super classe
        super().__init__(3)
    
    def area(self):
        a, b, c = self.lados
        #calcula o semi-perímetro
        s = (a + b + c)/2
        area = (s*(s-a)*(s-b)*(s-c)) ** 0.5
        print("A área do triângulo é %0.2f" %area)


class Main:
    poli = Poligono(5)
    #poli.le_lados()
    #poli.mostra_lados()

    poli2 = Triangulo()
    poli2.le_lados()
    poli2.mostra_lados()

    


Main
