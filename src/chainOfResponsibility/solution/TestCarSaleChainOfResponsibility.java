package chainOfResponsibility.solution;

import java.math.BigDecimal;

import chainOfResponsibility.Brand;
import chainOfResponsibility.Car;

public class TestCarSaleChainOfResponsibility {
	public static void main(String[] args) {
		SaleCarServiceChainOfResponsibility saleCarService = new SaleCarServiceChainOfResponsibility();
		
		Car car1 = new Car();
		car1.setBrand(Brand.FORD);
		car1.setModel("Fusion");
		car1.setPrice(new BigDecimal(90000.00));
		
		BigDecimal saleValue1 = saleCarService.saleValueCalculate(car1);
		
		System.out.println("Fusion selling price: " + car1.getPrice());
		System.out.println("Fusion selling price with discount: " + saleValue1);
		
		Car car2 = new Car();
		car2.setBrand(Brand.FIAT);
		car2.setModel("Uno");
		car2.setPrice(new BigDecimal(40000.00));
		
		BigDecimal saleValue2 = saleCarService.saleValueCalculate(car2);
		
		System.out.println("Uno selling price: " + car2.getPrice());
		System.out.println("Uno selling price with discount: " + saleValue2);
		
		Car car3 = new Car();
		car3.setBrand(Brand.CHEVROLET);
		car3.setModel("Camaro");
		car3.setPrice(new BigDecimal(200000.00));
		
		BigDecimal saleValue3 = saleCarService.saleValueCalculate(car3);
		
		System.out.println("Camaro selling price: " + car3.getPrice());
		System.out.println("Camaro selling price with discount: " + saleValue3);
		
		
	}
	

	

}
