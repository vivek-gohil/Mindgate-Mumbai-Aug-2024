package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.Employee;

public interface EmployeeRepository {
	Employee addNewEmployee(Employee employee);

	Employee updateSalary(Employee employee);

	Employee updateFirstNameLastName(Employee employee);

	Employee getEmployeeByEmployeeId(int employeeId);

	boolean deleteEmployeeByEmployeeId(int employeeId);

	List<Employee> getAllEmployees();
}
