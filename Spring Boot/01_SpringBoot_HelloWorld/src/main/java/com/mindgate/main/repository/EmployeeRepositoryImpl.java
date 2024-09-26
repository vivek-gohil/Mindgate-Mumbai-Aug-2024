package com.mindgate.main.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	private JdbcTemplate jdbcTemplate;

	public EmployeeRepositoryImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	private static final String GENERATE_NEXT_EMPLOYEE_ID = "SELECT employee_id_sq.NEXTVAL FROM dual";
	private static final String INSERT_NEW_EMPLOYEE = "INSERT INTO employee_details VALUES(?,?,?,?,'Vivek',SYSDATE,'Vivek',SYSDATE)";
	// private static final String UPDATE_SALARY = "UPDATE employee_details SET
	// salary = ? WHERE employee_id = ?";
	// private static final String UPDATE_FIRST_NAME_LAST_NAME = "UPDATE
	// employee_details SET first_name = ? , last_name = ? WHERE employee_id = ?";
	private static final String UPDATE_EMPLOYEE = "UPDATE employee_details SET first_name = ? , last_name = ? , salary = ? , updated_at = SYSDATE  WHERE employee_id = ?";
	private static final String SELECT_ALL_EMPLOYEES = "SELECT * FROM employee_details";
	private static final String SELECT_EMPLOYEE_BY_EMPLOYEE_ID = "SELECT * FROM employee_details WHERE employee_id = ?";
	private static final String DELETE_EMPLOYEE_BY_EMPLOYEE_ID = "DELETE employee_details WHERE employee_id = ?";

	@Override
	public Employee addNewEmployee(Employee employee) {

		int generatedEmployeeId = jdbcTemplate.queryForObject(GENERATE_NEXT_EMPLOYEE_ID, Integer.class);
		employee.setEmployeeId(generatedEmployeeId);

		Object[] params = { employee.getEmployeeId(), employee.getFirstName(), employee.getLastName(),
				employee.getSalary() };

		int rowCount = jdbcTemplate.update(INSERT_NEW_EMPLOYEE, params);
		if (rowCount > 0)
			return employee;
		else
			return null;
	}

//	@Override
//	public Employee updateSalary(Employee employee) {
//		Object[] params = { employee.getSalary(), employee.getEmployeeId() };
//		int rowCount = jdbcTemplate.update(UPDATE_SALARY, params);
//		if (rowCount > 0)
//			return employee;
//		else
//			return null;
//	}
//
//	@Override
//	public Employee updateFirstNameLastName(Employee employee) {
//		Object[] params = { employee.getFirstName(), employee.getLastName(), employee.getEmployeeId() };
//		int rowCount = jdbcTemplate.update(UPDATE_FIRST_NAME_LAST_NAME, params);
//		if (rowCount > 0)
//			return employee;
//		else
//			return null;
//	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Object[] params = { employee.getFirstName(), employee.getLastName(), employee.getSalary(),
				employee.getEmployeeId() };
		int rowCount = jdbcTemplate.update(UPDATE_EMPLOYEE, params);
		if (rowCount > 0)
			return employee;
		else
			return null;
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		Employee employee = jdbcTemplate.queryForObject(SELECT_EMPLOYEE_BY_EMPLOYEE_ID, new EmployeeRowMapper(),
				employeeId);
		return employee;
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		int rowCount = jdbcTemplate.update(DELETE_EMPLOYEE_BY_EMPLOYEE_ID, employeeId);
		if (rowCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public List<Employee> getAllEmployees() {
		EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
		List<Employee> allEmployees = jdbcTemplate.query(SELECT_ALL_EMPLOYEES, employeeRowMapper);

		return allEmployees;
	}

}
