package pacote_adapter;

public class Android implements MicroUsbPhone{
private boolean connector = false;
	
	public void recharge() {
		if(connector) {
			System.out.println("Recharge started");
			System.out.println("Recharge finished");
		}
		else
			System.out.println("Connect Lightning first");
	}
	
	public void useMicroUsb() {
		this.connector = true;
		System.out.println("Micro USB connected");
	}
}
