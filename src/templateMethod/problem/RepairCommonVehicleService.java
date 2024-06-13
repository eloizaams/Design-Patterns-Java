package templateMethod.problem;

import templateMethod.CarForRepair;

public class RepairCommonVehicleService {

	private CarForRepair carForRepair;

	public RepairCommonVehicleService(CarForRepair carForRepair) {
		this.carForRepair = carForRepair;
	}
	
	public void carRepair() {
		workshopEntrance();
		analyzeDamage();
		if(carForRepair()) {
			repairCar();
			notifyRepairToInsuranceCompany();
		}
		else {
			notifyTotalLossToInsuranceCompany();
		}
	}

	private void notifyTotalLossToInsuranceCompany() {
		System.out.println("Notifying total loss to the insurance company...");	
	}

	private void notifyRepairToInsuranceCompany() {
		System.out.println("Notifying repair to the insurance company...");		
	}

	private void repairCar() {
		System.out.println("Repairing vehicle...");
		
	}

	private void analyzeDamage() {
		System.out.println("Analyzing damage...");
		
	}

	private void workshopEntrance() {
		System.out.println(("Vehicle entering the workshop... "));
		
	}

	private boolean carForRepair() {
		return carForRepair.getDamagePercentage() <= 70;
	}

}
