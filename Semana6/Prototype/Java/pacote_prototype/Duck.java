package pacote_prototype;

public class Duck implements Animal{

	public String getType() {
		return "Duck";
	}
	
	public String makeSound() {
		return "Quacks";
	}	

	public Animal clone(){
		return new Duck();
	}
}