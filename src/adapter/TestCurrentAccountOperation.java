package adapter;

import java.math.BigDecimal;

public class TestCurrentAccountOperation {

	public static void main(String[] args) {
		
		JarCurrentAccountOperation jarAccount = new JarCurrentAccountOperation();
		
		ClientJarCurrentAccountOperation client = new ClientJarCurrentAccountOperation(jarAccount);
		
		// In this case, validation is being done by the programmer
		BigDecimal value = new BigDecimal(1000);
		if (client.isValidBalance(value )) {
			client.withdraw(value);
		}

		client.deposit(new BigDecimal ( 500));
		
		
		
		
		
	}

}
