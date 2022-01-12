# Desde a versão Python 3.5 é possível definir alguns tipos de variáveis e métodos. É uma ideia proveniente de
# linguagens estáticas que podem ajudar a definir melhor os parâmetros de um programa.

class somadorTipo:
    def soma_com_tipo(self, a: int, b: int) -> int:
        return a + b

soma = somadorTipo()

print(soma.soma_com_tipo(5, 9))




