package pacote_abstract_factory;

public class AnimalFactory implements AbstractFactory<Animal>{
	
	public Animal create(String animalType) {
		if("Dog".equalsIgnoreCase(animalType))
			return new Dog();
		else if ("Duck".equalsIgnoreCase(animalType))
			return new Duck();
		
		else
			return null;
	}
	
}