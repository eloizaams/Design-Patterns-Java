package application;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import designPatterns.FactoryProduct;
import entites.Person;
import entites.Product;
import services.TypeProduct;

public class TestDesignPatterns {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		// REFLECTION - How to access a private constructor
		Constructor<Person> constructorPerson = Person.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class);
		constructorPerson.setAccessible(true);
		Person personExpert = constructorPerson.newInstance("Expert","","","","");

		System.out.println(personExpert);
		

		// Creating an object whith inner class builder
		Person person = new Person.PersonBuilder()
				.name("Eloiza")
				.lastName("Souza")
				.email("eloizaams@yahoo.com.br")
				.hometown("Barbacena")
				.id("111.222.333-44").build();
		
		System.out.println(person);
		
		System.out.println();
		Product fisicalProduct = new FactoryProduct().getInstance(TypeProduct.FISICAL);
		
		Product digitalProduct = new FactoryProduct().getInstance(TypeProduct.DIGITAL);
		
		System.out.println(fisicalProduct);
		System.out.println(digitalProduct);
		
		
		
	}

}
