from copy import deepcopy
from time import sleep, time

#Família de produtos do tema Faroeste
class Cavalo:
    def __init__(self):
        sleep(1)

    def movimentar(self):
        print('Cavalo em movimento')

class Cauboi:
    def __init__(self):
        sleep(1.5)

    def falar(self):
        print('Cauboi falando')

class Revolver:
    def __init__(self):
        sleep(0.25)
    
    def atirar(self):
        print('Tiro de revolver')

class Faroeste:
    def __init__(self):
        self.itens = {
            'cavalo': Cavalo(),
            'cauboi': Cauboi(),
            'arma': Revolver()
        }
    
    def criar(self, item):
        return deepcopy(self.itens[item])

if __name__ == '__main__':
    print("Iniciando a Fábrica de elementos:", end=' ')
    start = time()
    cenario = Faroeste()
    print(f'Levou {time() - start:.2f} segundos')

    print('Criando um Caubói...')
    start = time()
    cauboi_1 = cenario.criar('cauboi')
    print(f'Levou {time() - start:.2f} segundos')

    print('Criando outro Caubói...')
    start = time()
    cauboi_2 = cenario.criar('cauboi')
    print(f'Levou {time() - start:.2f} segundos')
    print('Modificando os caubóis para ver que são instâncias diferentes:')
    cauboi_1.nome = 'Mau'
    cauboi_2.nome = 'Feio'
    print(f'O caubói 1 chama: {cauboi_1.nome} e o caubói 2: {cauboi_2.nome}.')
