package strategy.solution;

import strategy.Employee;

public class AnnualSalaryAdjustmentStrategy {

	public void annualAdjustmentCalculate(Employee employee, AnnualAdjustmentSalaryCalculator calculator) {

		calculator.calculateAnnualAdjustment(employee);

	}

}
