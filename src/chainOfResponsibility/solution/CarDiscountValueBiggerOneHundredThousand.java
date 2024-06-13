package chainOfResponsibility.solution;

import java.math.BigDecimal;

import chainOfResponsibility.Car;

public class CarDiscountValueBiggerOneHundredThousand extends CarDiscount{

	public CarDiscountValueBiggerOneHundredThousand(CarDiscount nextDiscount) {
		super(nextDiscount);
	}

	@Override
	public BigDecimal applyDiscount(Car car) {
		BigDecimal saleValue = car.getPrice();
		
		if (car.getPrice().compareTo(new BigDecimal(100000))>0) {
			return saleValue.subtract(new BigDecimal(10000));
		}
		
		return nextDiscount.applyDiscount(car);
			
	}
}
