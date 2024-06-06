package application;

import designPatterns.FactoryProduct;
import entites.Person;
import entites.Product;
import services.TypeProduct;

public class TestDesignPatterns {
	public static void main(String[] args) {
		
		Person person = new Person.PersonBuilder()
				.name("Eloiza")
				.lastName("Souza")
				.email("eloizaams@yahoo.com.br")
				.hometown("Barbacena")
				.id("111.222.333-44").build();
		
		System.out.println(person);
		
		
		Product fisicalProduct = new FactoryProduct().getInstance(TypeProduct.FISICAL);
		
		Product digitalProduct = new FactoryProduct().getInstance(TypeProduct.DIGITAL);
		
		System.out.println(fisicalProduct);
		System.out.println(digitalProduct);
		
	}

}
