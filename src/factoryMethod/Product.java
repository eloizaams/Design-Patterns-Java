package factoryMethod;

public class Product {
	
	private String name;
	private String email;
	private boolean hasFisicalDimensions;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isHasFisicalDimensions() {
		return hasFisicalDimensions;
	}
	
	public void setHasFisicalDimensions(boolean hasFisicalDimensions) {
		this.hasFisicalDimensions = hasFisicalDimensions;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", email=" + email + ", hasFisicalDimensions=" + hasFisicalDimensions + "]";
	}
	
}
