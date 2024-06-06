package application;

import entites.Person;

public class TestDesignPatterns {
	public static void main(String[] args) {
		
		Person person = new Person.PersonBuilder()
				.name("Eloiza")
				.lastName("Souza")
				.email("eloizaams@yahoo.com.br")
				.hometown("Barbacena")
				.id("111.222.333-44").build();
		
		System.out.println(person);
		
		
		
	}

}
