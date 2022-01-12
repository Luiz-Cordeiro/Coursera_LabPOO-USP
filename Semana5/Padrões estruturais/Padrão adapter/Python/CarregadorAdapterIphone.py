class Iphone:
    __name__ = "Iphone"

    def __init__(self):
        self.conectado = False

    def usar_lightning(self):
        self.conectado = True
        print("Conectado ao carregador lightning")
    
    def recarregar(self):
        if self.conectado:
            print("Carregando...")
            print("Bateria recarregada.")
        else:
            print("Conecte ao carregador lightning antes")

class Android:
    __name__ = "Android"

    def __init__(self):
        self.conectado = False

    def usar_micro_usb(self):
        self.conectado = True
        print("Conectado ao carregador Micro USB")

    def recarregar(self):
        if self.conectado:
            print("Carregando...")
            print("Bateria recarregada.")
        else:
            print("Conecte ao carregador Micro USB antes")

class IphoneAdapterToAndroid:
    def __init__(self, DispIphone : Iphone):
        self.telefone = DispIphone
    
    def usar_micro_usb(self):
        self.telefone.usar_lightning()
    
    def recarregar(self):
        self.telefone.recarregar()

class CarregadorIphone:
    def __init__(self, DispIphone : Iphone):
        self.telefone = DispIphone
        self.telefone.usar_lightning()
        self.telefone.recarregar()

class CarregadorAndroid:
    def __init__(self, DispAndroid : Android):
        self.telefone = DispAndroid
        self.telefone.usar_micro_usb()
        self.telefone.recarregar()

class CarregadorAdaptadorIphone:
    def __init__(self, DispIphone : Iphone):
        self.telefone = DispIphone
        self.adaptador = IphoneAdapterToAndroid(self.telefone)
        self.adaptador.usar_micro_usb()
        self.adaptador.recarregar()

def Main():
    telefoneIphone = Iphone()
    telefoneAndroid = Android()

    carregarAndroid = CarregadorAndroid(telefoneAndroid)
    carregarIphone = CarregadorIphone(telefoneIphone)
    carregarIphoneNoAdaptador = CarregadorAdaptadorIphone(telefoneIphone)

Main()

