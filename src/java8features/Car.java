package java8features;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 11, 2025
 * Time    : 3:39:44 PM
 * project : AdvancedJavaProject

*/
public class Car implements Vehicle{
	private String brand;

	 Car(String brand) {
		this.brand = brand;
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "Car is speading up...";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "Car is Slowing Down ...........";
	}

}
