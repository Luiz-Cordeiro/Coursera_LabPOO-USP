package pacote_interfaces;

public class Main {

	public static void main(String[] args) {
		ClasseConcreta1 classe1 = new ClasseConcreta1();
		ClasseConcreta2 classe2 = new ClasseConcreta2();
		
		classe1.metodo_1();
		classe1.metodo_2();
		classe1.metodo_3();
		classe2.metodo_1();
		classe2.metodo_2();
		classe2.metodo_3();
		classe2.metodoEspecial();

	}

}