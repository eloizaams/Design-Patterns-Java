package designPatterns;

import entites.FisicalProduct;
import entites.Product;
import entites.DigitalProduct;
import services.TypeProduct;

public class FactoryProduct {
	
	public Product getInstance(TypeProduct type) {

		switch (type) {
		case FISICAL:
			FisicalProduct fp = new FisicalProduct();
			fp.setHasFisicalDimensions(true);
			return fp;
		case DIGITAL:
			DigitalProduct dp = new DigitalProduct();
			dp.setHasFisicalDimensions(false);
			return dp;

		default:
			throw new IllegalArgumentException("product type not available");

		}
	}
}
