package com.mindgate.main.builder;

import com.mindgate.main.domain.Employee;

public class EmployeeBuilder {
	private Employee employee;

	public EmployeeBuilder() {
		employee = Employee.getEmployee();
	}

	public EmployeeBuilder withEmployeeId(int employeeId) {
		employee.setEmployeeId(employeeId);
		return this;
	}

	public EmployeeBuilder withFirstName(String firstName) {
		employee.setFirstName(firstName);
		return this;
	}

	public EmployeeBuilder withLastName(String lastName) {
		employee.setLastName(lastName);
		return this;
	}

	public EmployeeBuilder withSalary(double salary) {
		employee.setSalary(salary);
		return this;
	}

	public Employee build() {
		return employee;
	}

}
