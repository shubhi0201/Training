package jdbcdemo;

import java.sql.*;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 10, 2025
 * Time    : 2:16:35 PM
 * project : AdvancedJavaProject

*/
public class SelectDemo {
//Database Credintials
	private static final String URl = "jdbc:mysql://localhost:3306/classicmodels";
	private static final String USER = "root";
	private static final String PASSWORD = "MyPass123";
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs =null;
		try {
			// Step 1 Load MYSQLJDBC Driver (optional for JDBC 4.O+ , but safer)
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL Deiver Loaded Successfully ");
			
			//STEP 2 Establish Connection
			
			conn = DriverManager.getConnection(URl, USER, PASSWORD);
			System.out.println("Connected to Database Successfully");
			
			//STEP 3 Create STatement
			stmt = conn.createStatement();
			// STEP 4 Execute query 
			
			
			String sql = "SELECT customerNumber , customerName , city , creditLimit FROM customers";
			rs = stmt.executeQuery(sql);
			System.out.println("----------- customers Records -------------");
			//STEP 5 process result 
			while(rs.next()) {
				int customerNumber = rs.getInt("customerNumber");
				String customerName = rs.getString("customerName");
				String city = rs.getString(3);
				double creditLimit = rs.getDouble(4);
				
				System.out.printf("customerNumber:%d| customerName : %s |city:%s|creditLimit:%2f%n",customerNumber , customerName , city , creditLimit);
			}
		} catch (Exception e) {
			System.out.println("Database Operation Failed");
			e.printStackTrace();
			
			// TODO: handle exception
		}
		finally {
	//Close resources manually
			try {
				if(rs!=null)rs.close();if(stmt!=null)stmt.close();if(conn!= null) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Resources Closed");
		}
	

	}

}
