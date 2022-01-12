package pacote_strategy;

public class Duck {
	FlyBehavior flyBehavior;
	
	public Duck(String flyBehavior) {
		setFlyBehavior(flyBehavior);
	}
	
	public void swim() {
		System.out.println("Duck is swimming on the pool");
	}
	
	private void setFlyBehavior(String flyBehavior) {
		if(flyBehavior == "flyWithWings")
			this.flyBehavior = new FlyWithWings();
		else if (flyBehavior == "flyNoWay")
			this.flyBehavior = new FlyNoWay();
	}
	
	public void performFly() {
		this.flyBehavior.fly();
	}
	
	public void display() {
		System.out.println("A generic duck is drawn in the screen");
	}
}

