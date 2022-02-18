package pacote_prototype;

import java.util.HashMap;

public class AnimalFactory implements AbstractFactory<Animal>{

	//O hashmap permite mapear a string com o objeto buscado
	HashMap <String, Animal> prototipoAnimais = new HashMap<>();

	public AnimalFactory(){
		prototipoAnimais.put("Dog", new Dog());
		prototipoAnimais.put("Duck", new Duck());
	}
	
	public Animal create(String animalType) {
		//Agora basta buscar a string dentro da coleção para retornar um clone do objeto
		return prototipoAnimais.get(animalType).clone();
	}
	
}