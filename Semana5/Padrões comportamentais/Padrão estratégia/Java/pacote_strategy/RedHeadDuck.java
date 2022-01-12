package pacote_strategy;

public class RedHeadDuck extends Duck {
	public RedHeadDuck () {
		super("flyWithWings");
	}
	
	@Override
	public void display() {
		System.out.println("Here we have a Red Head duck drawn in the screen");
	}
}