package mian.registration.dao;

import main.registration.exception.EmployeeRegistrationException;
import mian.registration.model.Employee;

public interface EmployeeDao {
	
	public int registerEmployee(Employee employee) throws ClassNotFoundException, EmployeeRegistrationException;

}
