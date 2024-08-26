package com.mindgate.main.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.mindgate.main.domain.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private int resultRowCount;
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userName = "mindgatemumbai";
	private String password = "mindgatemumbai";
	private String driverName = "oracle.jdbc.driver.OracleDriver";

	private static final String GENERATE_NEXT_EMPLOYEE_ID = "SELECT employee_id_sq.NEXTVAL FROM dual";
	private static final String INSERT_NEW_EMPLOYEE = "INSERT INTO employee_details VALUES(?,?,?,?)";
	private static final String UPDATE_SALARY = "UPDATE employee_details SET salary = ? WHERE employee_id = ?";
	private static final String UPDATE_FIRST_NAME_LAST_NAME = "UPDATE employee_details SET first_name = ? , last_name = ? WHERE employee_id = ?";
	private static final String SELECT_ALL_EMPLOYEES = "SELECT * FROM employee_details";
	private static final String SELECT_EMPLOYEE_BY_EMPLOYEE_ID = "SELECT * FROM employee_details WHERE employee_id = ?";
	private static final String DELETE_EMPLOYEE_BY_EMPLOYEE_ID = "DELETE employee_details WHERE employee_id = ?";

	@Override
	public Employee addNewEmployee(Employee employee) {
		int employeeId = 0;
		try {
			// Step 1 - Load Driver Class
			Class.forName(driverName);

			// Step 2 - Connect Database
			connection = DriverManager.getConnection(url, userName, password);

			if (connection != null) {

				// Step 3 Get EmployeeId From Database
				preparedStatement = connection.prepareStatement(GENERATE_NEXT_EMPLOYEE_ID);
				resultSet = preparedStatement.executeQuery();

				if (resultSet.next()) {
					employeeId = resultSet.getInt("NEXTVAL");
				}

				// Step 4 - Write Query and Set Values
				preparedStatement = connection.prepareStatement(INSERT_NEW_EMPLOYEE);

				preparedStatement.setInt(1, employeeId);
				preparedStatement.setString(2, employee.getFirstName());
				preparedStatement.setString(3, employee.getLastName());
				preparedStatement.setDouble(4, employee.getSalary());

				// Step 4 - Execute Query
				resultRowCount = preparedStatement.executeUpdate();

				if (resultRowCount > 0) {
					employee.setEmployeeId(employeeId);
					return employee;
				}

			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Faild To Connect Database");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Faild To Close Connection");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

		return null;
	}

	@Override
	public Employee updateSalary(Employee employee) {
		try {
			// Step 1 - Load Driver Class
			Class.forName(driverName);

			// Step 2 - Connect Database
			connection = DriverManager.getConnection(url, userName, password);

			if (connection != null) {

				// Step 3 - Write Query and Set Values
				preparedStatement = connection.prepareStatement(UPDATE_SALARY);

				preparedStatement.setDouble(1, employee.getSalary());
				preparedStatement.setInt(2, employee.getEmployeeId());

				// Step 4 - Execute Query
				resultRowCount = preparedStatement.executeUpdate();

				if (resultRowCount > 0) {
					return employee;
				}

			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Faild To Connect Database");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Faild To Close Connection");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Employee updateFirstNameLastName(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		try {
			// Step 1 - Load Driver Class
			Class.forName(driverName);

			// Step 2 - Connect Database
			connection = DriverManager.getConnection(url, userName, password);

			if (connection != null) {

				// Step 3 - Write Query and Set Values
				preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE_BY_EMPLOYEE_ID);

				preparedStatement.setInt(1, employeeId);

				// Step 4 - Execute Query
				resultRowCount = preparedStatement.executeUpdate();

				if (resultRowCount > 0) {
					return true;
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Faild To Connect Database");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Faild To Close Connection");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		try {
			// Step 1 - Load Driver Class
			Class.forName(driverName);

			// Step 2 - Connect Database
			connection = DriverManager.getConnection(url, userName, password);

			if (connection != null) {

				// Step 3 - Write And Execute Query
				preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_EMPLOYEE_ID);
				preparedStatement.setInt(1, employeeId);
				resultSet = preparedStatement.executeQuery();

				if (resultSet.next()) {
					employeeId = resultSet.getInt("employee_id");
					String firstName = resultSet.getString("first_name");
					String lastName = resultSet.getString("last_name");
					double salary = resultSet.getDouble("salary");

					Employee employee = new Employee(employeeId, firstName, lastName, salary);
					return employee;
				}

			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Faild To Connect Database");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Faild To Close Connection");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {

		try {
			// Step 1 - Load Driver Class
			Class.forName(driverName);

			// Step 2 - Connect Database
			connection = DriverManager.getConnection(url, userName, password);

			if (connection != null) {

				// Step 3 - Write And Execute Query
				preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEES);
				resultSet = preparedStatement.executeQuery();

				List<Employee> employeeList = new ArrayList<Employee>();
				while (resultSet.next()) {
					int employeeId = resultSet.getInt("employee_id");
					String firstName = resultSet.getString("first_name");
					String lastName = resultSet.getString("last_name");
					double salary = resultSet.getDouble("salary");

					Employee employee = new Employee(employeeId, firstName, lastName, salary);
					employeeList.add(employee);
				}
				return employeeList;
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Faild To Connect Database");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Faild To Close Connection");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

		return null;
	}

}
