package adapter;

import java.math.BigDecimal;

public class ClientJarCurrentAccountOperation  {

	private JarCurrentAccountOperation jcao;

	public ClientJarCurrentAccountOperation(JarCurrentAccountOperation jcao) {
		this.jcao = jcao;
	}
	
	public boolean isValidBalance (BigDecimal amount) {
		return jcao.isValidBalance(amount);
	}
	
	public void withdraw (BigDecimal amount) {
		jcao.withdraw(amount);
	}
		
	public void deposit (BigDecimal amount) {
		jcao.deposit(amount);
	}
	
}
