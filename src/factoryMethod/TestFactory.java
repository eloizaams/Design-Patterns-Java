package factoryMethod;

public class TestFactory {
	public static void main(String[] args) {
		// Testing Factory Method
		Product fisicalProduct = new FactoryProduct().getInstance(TypeProduct.FISICAL);

		Product digitalProduct = new FactoryProduct().getInstance(TypeProduct.DIGITAL);

		System.out.println(fisicalProduct);
		System.out.println(digitalProduct);
	}
}
