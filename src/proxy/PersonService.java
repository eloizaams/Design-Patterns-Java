package proxy;

import builder.Person;

public class PersonService {
	//Composition
	private PersonRepositoryProxy personRepositoryProxy;

	public PersonService(PersonRepositoryProxy personRepositoryProxy) {
		this.personRepositoryProxy = personRepositoryProxy;
	}
	
	public void save (Person person) {
		personRepositoryProxy.save(person);
	}
	
	public Person findById(Long id) {
		return personRepositoryProxy.findById(id);
	}

}
