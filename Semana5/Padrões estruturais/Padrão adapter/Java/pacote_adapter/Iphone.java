package pacote_adapter;

public class Iphone implements LightningPhone{
	private boolean connector = false;
	
	public void recharge() {
		if(connector) {
			System.out.println("Recharge started");
			System.out.println("Recharge finished");
		}
		else
			System.out.println("Connect Lightning first");
	}
	
	public void useLightning() {
		this.connector = true;
		System.out.println("Lightning connected");
	}
}