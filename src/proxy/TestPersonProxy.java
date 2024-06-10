package proxy;

import builder.Person;

public class TestPersonProxy {
	public static void main(String[] args) {
		//dependency injection
				PersonService personService = new PersonService(new PersonRepositoryProxy());
				
				Person person = new Person.PersonBuilder()
						.name("Eloiza")
						.lastName("Souza")
						.email("eloizaams@yahoo.com.br")
						.hometown("Brazil")
						.build();
			
				personService.save(person);
				
				Person returnedPerson = personService.findById(1L);
				
				System.out.println(returnedPerson);
				Person returnedPersonCache = personService.findById(1L);
				
				System.out.println(returnedPersonCache);
		
	}
}
