package mian.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mian.registration.model.Employee;

public class EmployeeDao {

	public int registerEmployee(Employee employee) throws ClassNotFoundException {
		/**
		 * Insert statement is written in native sql. 
		 * Have a look at the firstName and lastName columns
		 * ---> They match the column names in the table of the database.
		 */
		String INSERT_USERS_SQL = "INSERT INTO employee"
				+ " (id, first_name, last_name, username, password, address, contact) "
				+ "VALUES (?,?,?,?,?,?,?);";
		int result =0;
		
		Class.forName("com.mysql.jdbc.Driver");
		try (
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false", "root", "root");
			
			// Step 2: Create a statement using connection object
			PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USERS_SQL)){
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, employee.getFirstName());
			preparedStatement.setString(3, employee.getLastName());
			preparedStatement.setString(4, employee.getUsername());
			preparedStatement.setString(5, employee.getPassword());
			preparedStatement.setString(6, employee.getAddress());
			preparedStatement.setString(7, employee.getContact());
			
			System.out.println("The prepared statement is: "+preparedStatement);
			
			// Step 3: Execute the query
			result= preparedStatement.executeUpdate();
			
		}catch (SQLException ex) {
			ex.printStackTrace();
		}
		return result;
	}
}
