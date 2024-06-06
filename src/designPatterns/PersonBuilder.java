package designPatterns;

import entites.Person;

public class PersonBuilder {
	
	private String name;
	private String lastName;
	private String email;
	private String id;
	private String hometown;
	
	public PersonBuilder name(String name) {
		this.name = name;
		return this;
	}
	public PersonBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public PersonBuilder email(String email) {
		this.email = email;
		return this;
	}
	public PersonBuilder id(String id) {
		this.id = id;
		return this;
	} 
	public PersonBuilder hometown(String hometown) {
		this.hometown = hometown;
		return this;
	}
	
	public Person build() {
		return new Person(name, lastName, email, id, hometown);
	}
	
	
}
