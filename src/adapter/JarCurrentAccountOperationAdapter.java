package adapter;

import java.math.BigDecimal;

public class JarCurrentAccountOperationAdapter {
	
	private JarCurrentAccountOperation jarAccount;

	public JarCurrentAccountOperationAdapter(JarCurrentAccountOperation jarAccount) {
		this.jarAccount = jarAccount;
	}
	

	// In this case, validation is being done by the class
	public void withdraw (BigDecimal amount) {
		if (jarAccount.isValidBalance(amount)) {
			jarAccount.withdraw(amount);
		} 
		else {
			throw new IllegalArgumentException("withdrawal amount not allowed");
		}
		
	}
	
	public void deposit (BigDecimal amount) {
		jarAccount.deposit(amount);
	}

}
