package pacote_abstract_factory;

import java.util.Scanner;

public class Client {
	static AbstractFactory abstractFactory;
	static Animal animalObj;
	static Color colorObj;


	public static void main(String[] args) {
		/*
		abstractFactory = new FactoryProvider().getFactory("Toy");
		
		Animal animal = (Animal)abstractFactory.create("Dog");
		
		abstractFactory = new FactoryProvider().getFactory("Color");
		
		Color color = (Color)abstractFactory.create("White");
		
		String result = "The " + color.getColorName() + " " + animal.getType() + " " + animal.makeSound();
		
		System.out.println(animal.makeSound());
		*/
		testaPadrao();
			
	}
	
	public static void testaPadrao() {
		
		Scanner sc = new Scanner(System.in);
		
		String animal = "animal";
		String color = "color";
		
		while(animal != "exit" || color != "exit") {
			System.out.print("Animal: ");
			animal = sc.nextLine();
			System.out.print("Cor: ");
			color = sc.nextLine();
			
			abstractFactory = new FactoryProvider().getFactory("Toy");
			animalObj = (Animal)abstractFactory.create(animal);
			abstractFactory = new FactoryProvider().getFactory("Color");
			colorObj = (Color)abstractFactory.create(color);
			try {
			String result = "The " + colorObj.getColorName() + " " + animalObj.getType() + " " + animalObj.makeSound();
			System.out.println(result);
			} catch (NullPointerException e) {
				System.out.println("Saindo do loop...");
				System.exit(0);
			}
			
		}
		
		
	}
}
