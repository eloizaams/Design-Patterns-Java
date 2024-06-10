package builder;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestBuilder {

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
				

	}

}
