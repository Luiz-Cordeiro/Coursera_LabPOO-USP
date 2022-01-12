package pacote_heranca;

public class Main {

	public static void main(String[] args) {
		
		Poligono triangulo = new Triangulo();
		Triangulo triangulo2 = new Triangulo();
		
		/*Como triangulo é um poligono, não há problema em instanciar uma subclasse no tipo de sua superclasse.
		 Assim, as duas formas de instanciar triangulo acima estão corretas
		 */
		
		System.out.println(triangulo.getLados()); 

	}

}