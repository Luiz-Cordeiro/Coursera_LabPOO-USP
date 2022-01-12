class ComportamentoDeVoo():
    def voar(self):
        raise NotImplementedError

class VoarComAsas(ComportamentoDeVoo):
    def voar(self):
        print("Pato voando em torno da piscina")

class IncapazDeVoar(ComportamentoDeVoo):
    def voar(self):
        print("O pato incapaz de voar")

class ComportamentoDeGrasnar():
    def grasnar(self):
        raise NotImplementedError

class Quack(ComportamentoDeGrasnar):
    def grasnar(self):
        print("Quack!")

class IncapazDeGrasnar(ComportamentoDeGrasnar):
    def grasnar(self):
        print("O pato incapaz de grasnar")

class Pato():

    ComportamentoDeVoo = None
    ComportamentoDeGrasnar = None
    
    def nadar(self):
        print("Pato nadando na piscina")
    
    def grasnar(self):
        self.ComportamentoDeGrasnar.grasnar()
    
    def voar(self):
        self.ComportamentoDeVoo.voar()

    def __repr__(self):
        raise NotImplementedError
    
class PatoReal(Pato):
    ComportamentoDeVoo = VoarComAsas()
    ComportamentoDeGrasnar = Quack()

class PatoBorracha(Pato):
    ComportamentoDeVoo = IncapazDeVoar()
    ComportamentoDeGrasnar =IncapazDeGrasnar()

def Main():
    patoReal = PatoReal()
    patoReal.grasnar()
    patoReal.voar()

Main()


