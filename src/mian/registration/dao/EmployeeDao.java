package mian.registration.dao;

import mian.registration.model.Employee;

public class EmployeeDao {

	public int registerEmployee(Employee employee) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO employee"
				+ " (id, first_name, last_name, username, password, address, contact) "
				+ "VALUES (?,?,?,?,?,?,?);";
		int result =0;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		
	}
}
