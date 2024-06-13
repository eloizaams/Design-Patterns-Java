package chainOfResponsibility;

import java.math.BigDecimal;

public class Car {

	private Brand brand;
	
	private String model;
	
	private BigDecimal price;

	public final Brand getBrand() {
		return brand;
	}

	public final void setBrand(Brand brand) {
		this.brand = brand;
	}

	public final String getModel() {
		return model;
	}

	public final void setModel(String model) {
		this.model = model;
	}

	public final BigDecimal getPrice() {
		return price;
	}

	public final void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + "]";
	}
	
	
}
