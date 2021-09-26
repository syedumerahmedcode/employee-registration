package main.registration.exception;

public class EmployeeRegistrationException extends Exception{
	
	private static final String EMPLOYEE_REGISTRATION_FAILED_EXCEPTION = "Emplyoee Registration Failed exception";
	
	public EmployeeRegistrationException() {
		super(EMPLOYEE_REGISTRATION_FAILED_EXCEPTION);
	}
	
	public EmployeeRegistrationException(String message) {
		super(message);
	}

	

}
