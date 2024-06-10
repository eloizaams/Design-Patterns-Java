package adapter;

import java.math.BigDecimal;

public class ClientJarCurrentAccountOperationAdapter {
	
	private JarCurrentAccountOperationAdapter jarAccountAdapter;

	public ClientJarCurrentAccountOperationAdapter(JarCurrentAccountOperationAdapter jarAccountAdapter) {
		this.jarAccountAdapter = jarAccountAdapter;
	}
	
	public void withdraw (BigDecimal amount) {
		jarAccountAdapter.withdraw(amount);
	}
		
	public void deposit (BigDecimal amount) {
		jarAccountAdapter.deposit(amount);
	}	

}
