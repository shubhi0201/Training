package java8features;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 11, 2025
 * Time    : 2:18:11 PM
 * project : AdvancedJavaProject

 */
public class LambdaDemo2 {

	public static void main(String[] args) {
		NumericTest isEven =(n) -> (n%2==0);
		NumericTest isNegative =(n) -> (n<0);

		System.out.println("7 is even number" + isEven.computeTest(7));
		System.out.println("-55 is negative number" + isNegative.computeTest(-55));
		
		//boolean a =(n) -> (n%2==0); // error - lambda expression should be stored in instance of FI
	}

}
