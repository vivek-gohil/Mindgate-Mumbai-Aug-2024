package com.mindgate.main.mapper;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.dto.EmployeeDto;

public class EmployeeMapper {
	public static EmployeeDto mapToEmployeeDto(Employee employee, EmployeeDto employeeDto) {
		employeeDto.setEmployeeId(employee.getEmployeeId());
		employeeDto.setFirstName(employee.getFirstName());
		employeeDto.setLastName(employee.getLastName());
		employeeDto.setSalary(employee.getSalary());
		return employeeDto;
	}

	public static Employee mapToEmployee(EmployeeDto employeeDto, Employee employee) {
		employee.setEmployeeId(employeeDto.getEmployeeId());
		employee.setFirstName(employeeDto.getFirstName());
		employee.setLastName(employeeDto.getLastName());
		employee.setSalary(employeeDto.getSalary());
		return employee;
	}
}
