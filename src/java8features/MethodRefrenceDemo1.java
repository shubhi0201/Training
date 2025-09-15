package java8features;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 11, 2025
 * Time    : 3:12:21 PM
 * project : AdvancedJavaProject

 */
@FunctionalInterface
interface MyInterface
{
	void myMethod(int a);
}

class Test // instance class
{
	void display(int x) // instance method
	{
		System.out.println("Iam a Instance Method"+x);
	}
}
public class MethodRefrenceDemo1 {
	//Method Reference - Shorthand of Lambda expression to call method


	public static void main(String[] args) {
		//traditional approach
		Test t1=new Test();
		t1.display(100);

		//Java8 Method Reference approach
		MyInterface m1ref=t1::display; // method reference to instance method of Object

		//calling method of FI
		m1ref.myMethod(200);

		// Lambda ---> FI
		// MR--- shorthand of Lambda
		//MR -->FI
	}

}
