package jdbcdemo;

import java.util.Scanner;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 11, 2025
 * Time    : 12:06:40 PM
 * project : AdvancedJavaProject

*/
public class CallableStatmentDemo {

	public static void main(String[] args) {
		try {
			Skills s=new Skills();
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Candidate Details to get skills : ");
			System.out.println("Enter Candidate Id : ");
			int id=scan.nextInt();
			
			s.getSkils(id);
			scan.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
