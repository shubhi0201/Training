package java8features;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 11, 2025
 * Time    : 12:54:35 PM
 * project : AdvancedJavaProject

*/
@FunctionalInterface
interface MyFI
{
	public String sayHello(); // by default absrtract
	
}
public class LambdaDemo1 {
	public static void main(String[] args) {
		MyFI msg = () -> {return "Hello World";}; // lambda function
		MyFI msg1 = () -> {return "Java 8 features";};
		MyFI msg2 = () -> {return "Coforge";};
		MyFI msg3 = () -> {return "Coforge"+ " "+" Technologies";};
		MyFI msg4 = () -> {return "Hello World";};
		
		System.out.println(msg.sayHello());
		System.out.println(msg1.sayHello());
		System.out.println(msg2.sayHello());
		System.out.println(msg3.sayHello());
		System.out.println(msg4.sayHello());
	}

}
