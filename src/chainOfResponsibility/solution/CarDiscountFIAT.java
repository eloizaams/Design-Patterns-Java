package chainOfResponsibility.solution;

import java.math.BigDecimal;

import chainOfResponsibility.Brand;
import chainOfResponsibility.Car;

public class CarDiscountFIAT extends CarDiscount{

	public CarDiscountFIAT(CarDiscount nextDiscount) {
		super(nextDiscount);
	}

	@Override
	public BigDecimal applyDiscount(Car car) {
		BigDecimal saleValue = car.getPrice();
		
		if (Brand.FIAT.equals(car.getBrand())) {
			return saleValue.subtract(new BigDecimal(1000));
		}

		return nextDiscount.applyDiscount(car);
			
	}

	
}
