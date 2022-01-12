package pacote_adapter;

public class AdapterDemo {
	public void rechargeMicroUsbPhone(MicroUsbPhone phone) {
		phone.useMicroUsb();
		phone.recharge();
	}
	
	public void rechargeLightningPhone(LightningPhone phone) {
		phone.useLightning();
		phone.recharge();
	}
}