package pacote_singleton_inic_tardia;

/*
 * Esta implementação de singleton permite que o objeto seja instanciado apenas quando necessário
 */
public class SingletonInicTardia {
	
	private static SingletonInicTardia instancia;

	private SingletonInicTardia() {
		
	}
		
	public static SingletonInicTardia getInstance() {
		if(instancia == null)
			instancia = new SingletonInicTardia();
		return instancia;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonInicTardia singleton1 = SingletonInicTardia.getInstance();
		SingletonInicTardia singleton2 = SingletonInicTardia.getInstance();
		
		System.out.println(singleton1.toString());
		System.out.println(singleton2);
	}

}
