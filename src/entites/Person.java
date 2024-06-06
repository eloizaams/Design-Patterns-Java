package entites;


public class Person {

	private String name;
	private String lastName;
	private String email;
	private String id;
	private String hometown;

	 // Constructor private - must instance object using inner classs PersonBuilder
	private Person(String name, String lastName, String email, String id, String hometown) {
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.id = id;
		this.hometown = hometown;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", email=" + email + ", id=" + id + ", hometown="
				+ hometown + "]";
	}

	
	public static class PersonBuilder {
		
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
}
