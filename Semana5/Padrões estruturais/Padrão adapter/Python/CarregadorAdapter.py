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
        #Utiliza-se a assinatura desejada (micro_usb) para adaptar a função
        self.telefone.usar_lightning()
    
    def recarregar(self):
        self.telefone.recarregar()

    

def Main():
    TelefoneIphone = Iphone()
    TelefoneAndroid = Android()

    TelefoneIphone.usar_lightning()
    TelefoneIphone.recarregar()

    TelefoneAndroid.usar_micro_usb()
    TelefoneAndroid.recarregar()

    IphoneComAdaptador = IphoneAdapterToAndroid(Iphone())
    IphoneComAdaptador.usar_micro_usb()
    IphoneComAdaptador.recarregar()


Main()