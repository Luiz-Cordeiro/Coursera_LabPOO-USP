package pacote_abstract_factory;

public class Duck implements Animal{

	public String getType() {
		return "Duck";
	}
	
	public String makeSound() {
		return "Quacks";
	}	
}