package adapter;

import java.math.BigDecimal;

public class JarCurrentAccountOperation {

	public boolean isValidBalance (BigDecimal amount) {
		System.out.println("validating balance...");
		return true;
	}
	
	public void withdraw (BigDecimal amount) {
		
		System.out.println("withdraw...");
	}
	
	public void deposit (BigDecimal amount) {
		System.out.println("deposit...");
	}
	
}
