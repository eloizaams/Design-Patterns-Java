package strategy;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Employee {
	
	private String name;
	
	private BigDecimal salary;
	
	private ContractTypeEnum contractType;

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final BigDecimal getSalary() {
		return salary;
	}

	public final void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public final ContractTypeEnum getContractType() {
		return contractType;
	}

	public final void setContractType(ContractTypeEnum contractType) {
		this.contractType = contractType;
	}

	@Override
	public String toString() {
		
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"));
        currencyFormat.setCurrency(Currency.getInstance("BRL"));
	        
	    String formattedValue = currencyFormat.format(salary);
	        
		return "Employee [name=" + name + ", salary=" + formattedValue + ", contractType=" + contractType + "]";
	}
	

}
