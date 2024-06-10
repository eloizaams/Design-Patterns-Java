package singleton;

import java.lang.reflect.InvocationTargetException;

public class TestSingleton {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//Testin Singleton 
		SingletonSchedule schedule = SingletonSchedule.getInstance();
		reserveDay("SUNDAY");
		reserveDay("FRIDAY");
		System.out.println(schedule.hashCode());
	}
	
	// Show that the object schedule2 is the same of schedule, has only one instance.
	public static void reserveDay(String day) {
		SingletonSchedule schedule2 = SingletonSchedule.getInstance();
		schedule2.busyDay(day);
		System.out.println(schedule2.getDays());
		System.out.println(schedule2.hashCode());
	}

}
