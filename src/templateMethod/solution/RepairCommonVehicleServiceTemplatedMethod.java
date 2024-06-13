package templateMethod.solution;

import templateMethod.CarForRepair;

public class RepairCommonVehicleServiceTemplatedMethod extends RepairVehicleService{
	
	private CarForRepair carForRepair;

	
	public RepairCommonVehicleServiceTemplatedMethod(CarForRepair carForRepair) {
		this.carForRepair = carForRepair;
	}


	@Override
	protected boolean carForRepair() {
		return carForRepair.getDamagePercentage() <= 70;
	}
	
	

}
