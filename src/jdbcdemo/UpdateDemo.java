package jdbcdemo;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 11, 2025
 * Time    : 11:23:00 AM
 * project : AdvancedJavaProject

*/
public class UpdateDemo {
public static void main(String[] args) {
	Candidate c1 = new Candidate();
	try {
		c1.getConnection();
		c1.UpdateCandidate();
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
