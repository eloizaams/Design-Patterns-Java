package entites;

public class Person {

	private String name;
	private String lastName;
	private String email;
	private String id;
	private String hometown;

	public Person(String name, String lastName, String email, String id, String hometown) {
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
	
}
