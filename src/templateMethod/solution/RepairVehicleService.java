package templateMethod.solution;

import templateMethod.CarForRepair;

public abstract class RepairVehicleService {

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

	protected abstract boolean carForRepair();
	

}
