package strategy.solution;

import java.math.BigDecimal;

import strategy.Employee;

public class AnnualAdjustmentSalaryCalculatorCLT implements AnnualAdjustmentSalaryCalculator {

	@Override
	public void calculateAnnualAdjustment(Employee employee) {
		BigDecimal salary = employee.getSalary();
		employee.setSalary(salary.add(salary.multiply(new BigDecimal (0.10))));
		
	}

}
