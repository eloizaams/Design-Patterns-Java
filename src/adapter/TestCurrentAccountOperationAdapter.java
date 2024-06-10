package adapter;

import java.math.BigDecimal;

public class TestCurrentAccountOperationAdapter {

	public static void main(String[] args) {
		JarCurrentAccountOperation jarAccount = new JarCurrentAccountOperation();
		JarCurrentAccountOperationAdapter jarAccountAdapter = new JarCurrentAccountOperationAdapter(jarAccount);
		
		ClientJarCurrentAccountOperationAdapter clientAdapter = new ClientJarCurrentAccountOperationAdapter(jarAccountAdapter);
		
		// In this case, validation is being done by the class
		BigDecimal value = new BigDecimal(1000);
		clientAdapter.withdraw(value);

		clientAdapter.deposit(new BigDecimal ( 500));
	}

}
