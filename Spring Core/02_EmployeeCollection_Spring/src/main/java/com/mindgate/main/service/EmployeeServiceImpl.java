package com.mindgate.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.repository.EmployeeRepository;
import com.mindgate.main.repository.EmployeeRepositoryImpl;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;
	// List<String> nameList = new ArrayList<String>();

//	public EmployeeServiceImpl() {
//		System.out.println("Service Object Created");
//	}

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

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
