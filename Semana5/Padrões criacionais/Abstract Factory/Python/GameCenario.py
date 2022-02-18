
#Família de produtos do tema Faroeste
class Cavalo:
    def movimentar(self):
        print("Cavalo em movimento")

class Cowboy:
    def falar(self):
        print("Iráaa")

class Revolver:
    def atirar(self):
        print("Pow!")

#Família de produtos do tema Espacial

class Nave:
    def movimentar(self):
        print("Vshhh")

class Piloto:
    def falar(self):
        print("Ativar velocidade de dobra espacial")
    
class PistolaLaser:
    def atirar(self):
        print("Pew! Pew!")

class Tema:
    def criar(self, item):
        return self.itens.get(item)()

class Faroeste(Tema):
    def __init__(self):
        self.itens = {
            'veiculo': Cavalo,
            'personagem': Cowboy,
            'arma': Revolver
        }

class Espaco(Tema):
    def __init__(self):
        self.itens = {
            'veiculo': Nave,
            'personagem': Piloto,
            'arma': PistolaLaser
        }

if __name__ == '__main__':
    # Cria uma lista de todas as fábricas concretas possíveis
    temas = [t.__name__ for t in Tema.__subclasses__()]

    # Cria um menu para escolha do Tema
    print("Escolha o tema do jogo:")
    for i, t in enumerate(temas):
        print(f'{i}) {t}')
    tema = int(input('Tema : '))
    
    # Inicializa o jogo com o cenário escolhido
    cenario = Tema.__subclasses__()[tema]()
    veiculo = cenario.criar('veiculo')
    personagem = cenario.criar('personagem')
    arma = cenario.criar('arma')
    
    # Utiliza os itens de acordo com o cenário escolhido
    arma.atirar()
    personagem.falar()
    veiculo.movimentar()


    