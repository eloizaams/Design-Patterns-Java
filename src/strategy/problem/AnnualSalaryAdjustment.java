package strategy.problem;

import java.math.BigDecimal;

import strategy.ContractTypeEnum;
import strategy.Employee;

public class AnnualSalaryAdjustment {
	
	public void annualAdjustmentCalculate (Employee employee) {
		
		if (ContractTypeEnum.CLT.name().equals(employee.getContractType().name())) {
			BigDecimal salary = employee.getSalary();
			employee.setSalary(salary.add(salary.multiply(new BigDecimal (0.10))));
		}
		else if (ContractTypeEnum.PJ.name().equals(employee.getContractType().name())) {
			BigDecimal salary = employee.getSalary();
			employee.setSalary(salary.add(salary.multiply(new BigDecimal (0.05))));
		}
		else if (ContractTypeEnum.TEMP.name().equals(employee.getContractType().name())) {
			BigDecimal salary = employee.getSalary();
			employee.setSalary(salary.add(salary.multiply(new BigDecimal (0.02))));
		}
	}

}
