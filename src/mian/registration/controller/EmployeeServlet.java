package mian.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.registration.exception.EmployeeRegistrationException;
import mian.registration.dao.EmployeeDao;
import mian.registration.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	
	private static final String BASE_PATH_NAME = "WEB-INF/views/";
	private static final String EMPLOYEEREGISTER = BASE_PATH_NAME + "employeeregister.jsp";
	private static final String EMPLOYEEDETAILS = BASE_PATH_NAME + "employeedetails.jsp";
	/**
	 * These properties must match the value given in HTML as the input field name.
	 */
	private static final String CONTACT = "contact";
	private static final String ADDRESS = "address";
	private static final String PASSWORD = "password";
	private static final String USERNAME = "username";
	private static final String LAST_NAME = "lastName";
	private static final String FIRST_NAME = "firstName";

	private static final long serialVersionUID = 1L;

	private EmployeeDao employeeDao = new EmployeeDao();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		handleRequestViaRequestDispatcher(request, response, EMPLOYEEREGISTER);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter(FIRST_NAME);
		String lastName = request.getParameter(LAST_NAME);
		String username = request.getParameter(USERNAME);
		String password = request.getParameter(PASSWORD);
		String address = request.getParameter(ADDRESS);
		String contact = request.getParameter(CONTACT);

		Employee employee = createEmployee(firstName, lastName, username, password, address, contact);

		try {
			employeeDao.registerEmployee(employee);
		} catch (ClassNotFoundException | EmployeeRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		handleRequestViaRequestDispatcher(request, response, EMPLOYEEDETAILS);

	}

	private void handleRequestViaRequestDispatcher(HttpServletRequest request, HttpServletResponse response,
			String pathNameToTheResource) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher(pathNameToTheResource);
		dispatcher.forward(request, response);
	}

	private Employee createEmployee(String firstName, String lastName, String username, String password, String address,
			String contact) {
		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setUsername(username);
		employee.setPassword(password);
		employee.setAddress(address);
		employee.setContact(contact);
		return employee;
	}

}
