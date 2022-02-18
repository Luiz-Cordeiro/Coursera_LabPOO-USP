package pacote_prototype;

import java.util.HashMap;

public class ColorFactory implements AbstractFactory<Color>{

	HashMap <String, Color> prototipoCores = new HashMap<>();
	 
	
	public Color create(String color) {
		if("Brown".equalsIgnoreCase(color))
			return new Brown();
		else if("White".equalsIgnoreCase(color))
			return new White();
		else 
			return null;
	}
}