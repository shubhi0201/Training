package jdbcdemo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Author :Ayush.Joshi
 * Date   :Sep 10, 2025
 * Time   :4:25:04 PM
 * project:AdvancedJava
 */
public class JoinDemo2 {
	
    private static final String DB_URL = "jdbc:mysql://localhost:3306/coforgedb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "mysql123";

	public static void main(String[] args) {
		
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(
                 "SELECT e.emp_id, e.first_name, e.last_name, e.doj, d.dept_name " +
                 "FROM employees e JOIN departments d ON e.dept_id = d.d_id " +
                 "ORDER BY e.last_name, e.first_name")) {

           
            System.out.println("Employee Records with Department Information");
            System.out.println("----------------------------------------------------------------------------------");
            System.out.printf("%-5s %-15s %-15s %-15s %-20s%n",
                              "ID", "First Name", "Last Name", "Hire Date", "Department");
            System.out.println("----------------------------------------------------------------------------------");

            
            while (rs.next()) {
                int empId = rs.getInt("emp_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                Date hireDate = rs.getDate("doj");
                String deptName = rs.getString("dept_name");
              
                System.out.printf("%-5d %-15s %-15s %-15s %-20s%n",
                                  empId, firstName, lastName, hireDate, deptName);
            }
        } catch (SQLException e) {
            System.err.println("Database error occurred:");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("An unexpected error occurred:");
            e.printStackTrace();
        }
	}
}



