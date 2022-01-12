package pacote_strategy;

public class RubberDuck extends Duck{
	public RubberDuck () {
		super("flyNoWay");
	}
	
	@Override
	public void display() {
		System.out.println("Here we have a Rubber duck drawn in the screen");
	}
}