package templateMethod.solution;

import templateMethod.CarForRepair;

public class RepairLuxuryVehicleServiceTemplatedMethod extends RepairVehicleService{

	private CarForRepair carForRepair;

	

	public RepairLuxuryVehicleServiceTemplatedMethod(CarForRepair carForRepair) {
		this.carForRepair = carForRepair;
	}



	@Override
	protected boolean carForRepair() {
		return carForRepair.getDamagePercentage() <= 50;
	}
	
	

}
