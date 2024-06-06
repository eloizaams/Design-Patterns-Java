package application;

import designPatterns.PersonBuilder;
import entites.Person;

public class TestDesignPatterns {
	public static void main(String[] args) {
		
		Person person = new Person("Eloiza", "Souza", "eloizaams@yahoo.com.br", "111.222.333-44", "Barbacena");
		
		System.out.println(person);
		
		Person person2 = new PersonBuilder()
				.name("Eloiza")
				.lastName("Souza")
				.email("eloizaams@yahoo.com.br")
				.hometown("Barbacena")
				.id("111.222.333-44").build();
		
		System.out.println(person2);
		
		
		
	}

}
