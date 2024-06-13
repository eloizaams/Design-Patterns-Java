package chainOfResponsibility.problem;

import java.math.BigDecimal;

import chainOfResponsibility.Brand;
import chainOfResponsibility.Car;

public class SaleCarService {

	public BigDecimal saleValueCalculate (Car car) {
		BigDecimal saleValue = car.getPrice();
		
		if (Brand.FIAT.equals(car.getBrand())) {
			return saleValue.subtract(new BigDecimal(1000));
		}

		if (Brand.FORD.equals(car.getBrand())) {
			return saleValue.subtract(new BigDecimal(2000));
		}

		if (car.getPrice().compareTo(new BigDecimal(100000))>0) {
			return saleValue.subtract(new BigDecimal(10000));
		}
		
		return saleValue;
	}
}
