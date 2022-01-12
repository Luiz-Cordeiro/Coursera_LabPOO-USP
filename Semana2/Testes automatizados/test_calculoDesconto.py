class calculoDesconto:
    def calculaTaxaDesconto(self, tipo_cliente, valor_compra):
        taxa = 0
        if(valor_compra >= 500 or tipo_cliente == "ouro"):
            taxa = 15
        elif(valor_compra >= 400 or tipo_cliente == "prata"):
            taxa = 10
        elif(valor_compra >= 200 or tipo_cliente == "bronze"):
            taxa = 5
        
        return taxa

# A instrução para o teste funcional é simplesmente pytest para rodar todos os códigos de teste ou
# pytest <nome do arquivo> para testar um código específico

# O teste de cobertura exige que o comando "coverage run pytest <nome do arquivo>" seja aplicado
# Para exibir o resultado na linha de comando: coverage report
# Para exibir o resultado detalhado em HTML: coverage html
tx = calculoDesconto()
print(tx.calculaTaxaDesconto("ouro", 1890.75))


def test1_calculoTaxa():
    assert tx.calculaTaxaDesconto("bronze", 50) == 5

def test2_calculoTaxa():
    assert tx.calculaTaxaDesconto("comum", 550) == 15

def test3_calculoTaxa():
    assert tx.calculaTaxaDesconto("prata", 50) == 10

def test4_calculoTaxa():
    assert tx.calculaTaxaDesconto("comum", 250) == 5

def test5_calculoTaxa():
    assert tx.calculaTaxaDesconto("ouro", 50) == 15

def test6_calculoTaxa():
    assert tx.calculaTaxaDesconto("comum", 450) == 10

def test7_calculoTaxa():
    assert tx.calculaTaxaDesconto("bronze", 50) == 5

def test8_calculoTaxa():
    assert tx.calculaTaxaDesconto("comum", 50) == 0






    



            