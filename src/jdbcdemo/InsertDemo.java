package jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 11, 2025
 * Time    : 10:17:53 AM
 * project : AdvancedJavaProject

 */
public class InsertDemo {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet rs;
		int count;

		try
		{
			con = ConnectionUtil.createConnection();
			String str = "INSERT INTO skills(name) VALUES ('Azure')";
			stmt = con.createStatement();
			count = stmt.executeUpdate(str); //return no. of records affected
			if(count>0) {
				System.out.println("Record inserted Successfully");
			}
			String str1 = "SELECT COUNT(id) FROM skills";
			rs = stmt.executeQuery(str1);
			int cnt = 0;
			while(rs.next()) {
				cnt = rs.getInt(1);

			}
			System.out.println("Total number of records is :" + cnt);

		}
		catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		//count total no.of records in table





	}

}
