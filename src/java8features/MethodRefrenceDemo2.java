package java8features;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 11, 2025
 * Time    : 3:16:15 PM
 * project : AdvancedJavaProject

*/
@FunctionalInterface
interface IDemo
{
	void sum(int  x,int y);
}

class Calculation
{
	void addition(int  a,int b)
	{
		System.out.println("The Addition is : "+(a+b));
	}
}

public class MethodRefrenceDemo2 {

	public static void main(String[] args) {
		// Program to demonstrate Method reference to an instance method of a class

	



		Calculation c1=new Calculation();
				
				//using Lambda expressions
				IDemo d1=(a,b)->System.out.println("The Addition is : "+(a+b));
				d1.sum(10, 45);
				
				//Using Method reference to call instance method
				IDemo d2=c1::addition;
				d2.sum(200,150);

	}

}
