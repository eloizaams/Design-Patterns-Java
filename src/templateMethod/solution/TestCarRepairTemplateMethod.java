package templateMethod.solution;

import templateMethod.CarForRepair;

public class TestCarRepairTemplateMethod {
	public static void main(String[] args) {
		System.out.println("-------------LUXURY--------------");
		CarForRepair luxuryCar = new CarForRepair();
		luxuryCar.setDamagePercentage(51);
		
		RepairVehicleService rpl = new RepairLuxuryVehicleServiceTemplatedMethod(luxuryCar);
		
		rpl.carRepair();
		
		System.out.println("------------COMMON---------------");
		
		CarForRepair commonCar = new CarForRepair();
		commonCar.setDamagePercentage(69);
		
		RepairVehicleService rpc = new RepairCommonVehicleServiceTemplatedMethod(commonCar);
		
		rpc.carRepair();
		
		
	}
	
}
