package factoryMethod;

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
