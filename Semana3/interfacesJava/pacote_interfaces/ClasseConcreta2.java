package pacote_interfaces;

public class ClasseConcreta2 implements SpecialInterface {

	@Override
	public void metodo_1() {
		System.out.println("Método 1 implementado pela classe concreta 2");

	}

	@Override
	public void metodo_2() {
		System.out.println("Método 2 implementado pela classe concreta 2");

	}

	@Override
	public void metodo_3() {
		System.out.println("Método 3 implementado pela classe concreta 2");

	}

	
	public void metodoEspecial() {
		System.out.println("Método especial implementado pela classe concreta 2");

	}

	
	public String getDescricaoEspecial() {
		return "getDescriçãoEspecial implementado pela classe concreta 2";
	}

}
