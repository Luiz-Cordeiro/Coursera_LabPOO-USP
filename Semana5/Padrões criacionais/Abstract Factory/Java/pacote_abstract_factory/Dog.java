package pacote_abstract_factory;

public class Dog implements Animal{
	
	public String getType() {
		return "Dog";
	}
	
	public String makeSound() {
		return "Barks";
	}
	
}