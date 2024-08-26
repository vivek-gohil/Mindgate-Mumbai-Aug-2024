package com.mindgate.main.domain;

import com.mindgate.main.exceptions.InvalidSalaryException;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private double salary;

	public Employee() {
		if (salary == 0) {
			throw new InvalidSalaryException();
		}
	}

	public Employee(double salary) throws InvalidSalaryException {
		if (salary > 0)
			this.salary = salary;
		else
			throw new InvalidSalaryException();
	}

	public Employee(int employeeId, String firstName, String lastName, double salary) throws InvalidSalaryException {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		if (salary > 0)
			this.salary = salary;
		else
			throw new InvalidSalaryException();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) throws InvalidSalaryException {
		if (salary > 0)
			this.salary = salary;
		else
			throw new InvalidSalaryException();
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + "]";
	}

}
