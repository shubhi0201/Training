package java8features;

import java.util.Base64;
import java.util.Scanner;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 11, 2025
 * Time    : 4:31:27 PM
 * project : AdvancedJavaProject

*/
public class Base64Demo {

	public static void main(String[] args) {
		// Java Program to Encrypt & decrypt data


		Scanner s=new Scanner(System.in);
				String userName,password;
				
				System.out.println(" ********* Welcome to Coforge Technolgies ***********");
				System.out.println("Enter Your User Name : ");
				userName=s.next();
				
				System.out.println("Enter Your Password : ");
				password=s.next();
				
				// Encoding the byte String to Base64 format
				String encodedPassword=Base64.getEncoder().encodeToString(password.getBytes());
				
				System.out.println("Login Successfull  !!!!");
				System.out.println("User Name : "+userName);
				System.out.println("Password : "+encodedPassword);
				
				System.out.println("*********** Decrypt the Password **************");
				
				//decode Base64 format to String
				String decodedPassword =new String(Base64.getDecoder().decode(encodedPassword));
				System.out.println("The password is  : "+decodedPassword);
				
				
				System.out.println("************* URL Encoding *******************");
				
				Base64.Encoder encoder=Base64.getUrlEncoder();
				String eUrl=encoder.encodeToString
							("https://www.coforge.com/industries/public-sector".getBytes());
				
				System.out.println("Encode URL : "+eUrl);
				
				s.close();

	}

}
