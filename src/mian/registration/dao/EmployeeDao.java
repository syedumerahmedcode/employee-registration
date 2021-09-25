package mian.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;

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
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false", "root", "root");
		}
		
	}
}
