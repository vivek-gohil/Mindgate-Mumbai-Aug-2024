package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.Employee;

public interface EmployeeRepository {
	Employee addNewEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	Employee getEmployeeByEmployeeId(int employeeId);

	boolean deleteEmployeeByEmployeeId(int employeeId);

	List<Employee> getAllEmployees();
}
