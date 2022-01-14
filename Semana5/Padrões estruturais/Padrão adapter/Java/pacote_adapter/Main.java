package pacote_adapter;

public class Main {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		Android android = new Android();
		AdapterDemo adapter = new AdapterDemo();
		
		adapter.rechargeLightningPhone(iphone);
		adapter.rechargeMicroUsbPhone(android);
		
		adapter.rechargeMicroUsbPhone(new IphoneMicroUsbAdapter(iphone));
		/*
		 * A classe IphoneMicroAdapter implementa a interface MicroUsbPhone e também recebe 
		 * um objeto do tipo LightnignPhone. Por esse motivo, a classe Iphone está encapsulada
		 * e pode ser utilizada na função rechargeMicroUsbPhone
		 */
	
	}

}
