package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.dto.EmployeeDto;

public interface EmployeeService {
	EmployeeDto addNewEmployee(EmployeeDto employeeDto);

//	Employee updateSalary(Employee employee);
//
//	Employee updateFirstNameLastName(Employee employee);

	EmployeeDto updateEmployee(EmployeeDto employee);

	EmployeeDto getEmployeeByEmployeeId(int employeeId);

	boolean deleteEmployeeByEmployeeId(int employeeId);

	List<EmployeeDto> getAllEmployees();
}
