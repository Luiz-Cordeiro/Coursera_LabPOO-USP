package pacote_adapter;

public class IphoneMicroUsbAdapter implements MicroUsbPhone{
	/*
	 * A classe adaptadora precisa implementar a interface que deseja adaptar ao objeto recebido pelo construtor
	 */
	private LightningPhone lightningPhone;
	
	public IphoneMicroUsbAdapter(LightningPhone lightningPhone) {
		this.lightningPhone = lightningPhone;
	}
	
	public void recharge() {
		lightningPhone.recharge();
	}
	
	public void useMicroUsb() {
		lightningPhone.useLightning();
	}	

}
