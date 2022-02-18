package pacote_abstract_factory;

public class ColorFactory implements AbstractFactory<Color>{
	
	public Color create(String color) {
		if("Brown".equalsIgnoreCase(color))
			return new Brown();
		else if("White".equalsIgnoreCase(color))
			return new White();
		else 
			return null;
	}
}