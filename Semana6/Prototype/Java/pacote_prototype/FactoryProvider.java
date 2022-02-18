package pacote_prototype;

public class FactoryProvider {
	@SuppressWarnings("rawtypes")
	public AbstractFactory getFactory (String factoryType) {
		if("Toy".equalsIgnoreCase(factoryType))
			return new AnimalFactory();
		else if("Color".equalsIgnoreCase(factoryType))
			return new ColorFactory();
		else
			return null;
	}
}
