package chainOfResponsibility.solution;

import java.math.BigDecimal;

import chainOfResponsibility.Car;

public class SaleCarServiceChainOfResponsibility {
	
	public BigDecimal saleValueCalculate (Car car) {
		CarDiscount discount = new CarDiscountFIAT(
									new CarDiscountFORD(
										new CarDiscountValueBiggerOneHundredThousand(
											new NoRightDiscount(null))));
		
		return discount.applyDiscount(car);
	}
}
