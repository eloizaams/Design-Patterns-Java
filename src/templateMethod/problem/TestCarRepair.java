package templateMethod.problem;

import templateMethod.CarForRepair;

public class TestCarRepair {
	public static void main(String[] args) {
		System.out.println("-------------LUXURY--------------");
		CarForRepair luxuryCar = new CarForRepair();
		luxuryCar.setDamagePercentage(49);
		
		RepairLuxuryVehicleService rpl = new RepairLuxuryVehicleService(luxuryCar);
		
		rpl.carRepair();
		
		System.out.println("------------COMMON---------------");
		
		CarForRepair commonCar = new CarForRepair();
		commonCar.setDamagePercentage(71);
		
		RepairCommonVehicleService rpc = new RepairCommonVehicleService(commonCar);
		
		rpc.carRepair();
		
		
	}
	
}
