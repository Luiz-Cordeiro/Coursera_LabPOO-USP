package pacote_prototype;

public class Dog implements Animal{
	
	public String getType() {
		return "Dog";
	}
	
	public String makeSound() {
		return "Barks";
	}

	public Animal clone(){
		return new Dog();
	}
	
}