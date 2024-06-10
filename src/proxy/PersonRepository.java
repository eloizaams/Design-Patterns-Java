package proxy;

import java.util.HashMap;
import java.util.Map;


import builder.Person;



public class PersonRepository {
	
	//simulate a database
	private Map<Long, Person> base = new HashMap<>();
	
	private static Long countId = 1L;
	
	public void save (Person person) {
		base.put(countId++, person);
	}
	
	public Person findById (Long id) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return base.get(id);
	}
	

}
