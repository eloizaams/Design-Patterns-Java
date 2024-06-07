package designPatterns;

import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.Map;

public enum SingletonSchedule {
	
	INSTANCE;
	
	private Map<String, Boolean> availableDays = new HashMap<>();
	
	private SingletonSchedule() {
		for (int i = 1; i <= 7; i++) {
			availableDays.put(DayOfWeek.of(i).toString(), true);
		}
	}
	
	public static SingletonSchedule getInstance() {
		return INSTANCE;
	}

	public Map<String, Boolean> getDays(){
		return availableDays;
	}
	
	public void busyDay(String day) {
		availableDays.replace(day,false);
	}
	
}
