package pacote_colecoes_java;

import java.util.ArrayList;
import java.util.List;

public class ColecaoContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta LuizCordeiroCorrente = new Conta("Luiz Felipe Vieira Cordeiro", 5680);
		Conta MariaGuedesGoesCorrente = new Conta("Maria Guedes Goes Palmeira", 2568);
		
		/*
		 * Formas de criar uma coleção de objetos do tipo conta para chamar seus métodos através da coleção
		 */
		
		
		
		// 1º Usar um genérico para definir o tipo de lista 
		List <Conta>lista = new ArrayList<>();
				
		lista.add(MariaGuedesGoesCorrente);
		lista.add(LuizCordeiroCorrente);
		
		for(Conta conta: lista) {
			System.out.println(conta.getTitular());
		}
		
		// 2º Usar casting para determinar o tipo contido na lista
		
		List lista2 = new ArrayList();
		
		lista2.add(MariaGuedesGoesCorrente);
		lista2.add(LuizCordeiroCorrente);
		
		System.out.println(((Conta) lista2.get(0)).getSaldo());
	}

}
