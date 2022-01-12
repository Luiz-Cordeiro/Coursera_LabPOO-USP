package pacote_strategy;

public class MallardDuck extends Duck{
	public MallardDuck() {
		super("flyWithWings");
	}
	
	@Override
	public void display() {
		System.out.println("Here we have a Mallard duck drawn in the screen");
	}
}