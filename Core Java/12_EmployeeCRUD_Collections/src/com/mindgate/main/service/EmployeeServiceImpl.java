package com.mindgate.main.service;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.repository.EmployeeRepository;
import com.mindgate.main.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
	// List<String> nameList = new ArrayList<String>();

	@Override
	public Employee addNewEmployee(Employee employee) {
		employee.setFirstName(employee.getFirstName().toUpperCase());
		employee.setLastName(employee.getLastName().toUpperCase());
		return employeeRepository.addNewEmployee(employee);
	}

	@Override
	public Employee updateSalary(Employee employee) {
//		if (employee.getSalary() == 0) {
//			throw new InvalidSalaryException();
//		} else {
//			return employeeRepository.updateSalary(employee);
//		}

		return employeeRepository.updateSalary(employee);

	}

	@Override
	public Employee updateFirstNameLastName(Employee employee) {
		employee.setFirstName(employee.getFirstName().toUpperCase());
		employee.setLastName(employee.getLastName().toUpperCase());
		return employeeRepository.updateFirstNameLastName(employee);
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		return employeeRepository.deleteEmployeeByEmployeeId(employeeId);
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		return employeeRepository.getEmployeeByEmployeeId(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.getAllEmployees();
	}

}
