package chainOfResponsibility.solution;

import java.math.BigDecimal;

import chainOfResponsibility.Car;

public class NoRightDiscount extends CarDiscount{

	public NoRightDiscount(CarDiscount nextDiscount) {
		super(nextDiscount);
	}

	@Override
	public BigDecimal applyDiscount(Car car) {
		return BigDecimal.ZERO;
			
	}
}
