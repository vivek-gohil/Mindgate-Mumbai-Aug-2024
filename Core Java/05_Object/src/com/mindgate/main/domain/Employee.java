package com.mindgate.main.domain;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String firstName, String lastName, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
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

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return employeeId + firstName.hashCode() + lastName.hashCode() + (int) salary;
	}

	@Override
	public boolean equals(Object obj) {
		Employee employee = (Employee) obj;
		if (employee.employeeId == this.employeeId && employee.firstName.equals(this.firstName)
				&& employee.lastName.equals(this.lastName) && employee.salary == this.salary) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + "]";
	}

}
