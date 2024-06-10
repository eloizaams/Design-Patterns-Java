package proxy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

import builder.Person;

public class PersonRepositoryProxy extends PersonRepository{
	
	private static Logger log = Logger.getLogger(PersonRepositoryProxy.class.getName());
	
	private Map<Long, Person> cache = new HashMap<>();
	
	@Override
	public void save(Person person) {
		log.info("Starting save method call...");
		super.save(person);
		log.info("Save method call completed.");
	}
	
	@Override
	public Person findById(Long id) {
		log.info("Starting findById method call...");
		long begin = System.currentTimeMillis();
		
		Person person;
		if(Objects.nonNull(cache.get(id))) {
			log.info("Using chache");
			person =  cache.get(id);
		} else {
			log.info("Using personRepository");
			person = super.findById(id);
			cache.put(id,person);
		}
		log.info("findById method call completed.");
		long end = System.currentTimeMillis();
	
		log.info ("Call duratinon..." + (end - begin));
		return person;
	}

}
