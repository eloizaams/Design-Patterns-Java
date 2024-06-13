package strategy.solution;

import java.math.BigDecimal;

import strategy.ContractTypeEnum;
import strategy.Employee;

public class testAnnualSalaryAdjustmentStrategy {

	public static void main(String[] args) {

		AnnualSalaryAdjustmentStrategy annualSalaryAdjustment = new AnnualSalaryAdjustmentStrategy();
		
		Employee employeeCLT = new Employee();
		employeeCLT.setName("Victor");
		employeeCLT.setContractType(ContractTypeEnum.CLT);
		employeeCLT.setSalary(new BigDecimal(5000));
		
		Employee employeePJ = new Employee();
		employeePJ.setName("Podolsky");
		employeePJ.setContractType(ContractTypeEnum.PJ);
		employeePJ.setSalary(new BigDecimal(10000));
		
		Employee employeeTEMP = new Employee();
		employeeTEMP.setName("Oswaldo");
		employeeTEMP.setContractType(ContractTypeEnum.TEMP);
		employeeTEMP.setSalary(new BigDecimal(2000));
		
		annualSalaryAdjustment.annualAdjustmentCalculate(employeeCLT,new AnnualAdjustmentSalaryCalculatorCLT());
		annualSalaryAdjustment.annualAdjustmentCalculate(employeePJ, new AnnualAdjustmentSalaryCalculatorPJ());
		annualSalaryAdjustment.annualAdjustmentCalculate(employeeTEMP, new AnnualAdjustmentSalaryCalculatorTEMP());
		
		System.out.println(employeeCLT);
		System.out.println(employeePJ);
		System.out.println(employeeTEMP);
	}

}
