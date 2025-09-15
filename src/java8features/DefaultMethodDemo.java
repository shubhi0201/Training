package java8features;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 11, 2025
 * Time    : 3:39:24 PM
 * project : AdvancedJavaProject

*/
public class DefaultMethodDemo {
	public static void main(String[] args) {
Vehicle car=new Car("BMW");
		
		//invoke overriden methods
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		
		//invoke default methods
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlarmOff());
		
		//invoke static method of Interface
		System.out.println(Vehicle.getHorsePower(2500, 400));

	}

}
