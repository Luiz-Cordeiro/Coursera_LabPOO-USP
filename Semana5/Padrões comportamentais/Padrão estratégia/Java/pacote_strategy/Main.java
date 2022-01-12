package pacote_strategy;
import java.util.Scanner;
public class Main {
	static Duck duck;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one duck to create: 1 - Mallard Duck, 2 - Red Head Duck, 3 - Rubber Duck");
		int option = sc.nextInt();
		
		
		switch(option) {
			case 1:
				duck = new MallardDuck();
				break;
			case 2:
				duck = new RedHeadDuck();
				break;
			case 3:
				duck = new RubberDuck();
				break;
		}
		
		
		duck.display();
		duck.performFly();
		
	}
	

}