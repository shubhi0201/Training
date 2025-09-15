package jdbcdemo;

import java.sql.*;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 11, 2025
 * Time    : 9:41:50 AM
 * project : AdvancedJavaProject

*/
public class ConnectionUtil {
	public static Connection createConnection() throws Exception
	{

Class.forName("com.mysql.cj.jdbc.Driver");

					// Establish the connection
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","MyPass123");
					return con;

	}

}
