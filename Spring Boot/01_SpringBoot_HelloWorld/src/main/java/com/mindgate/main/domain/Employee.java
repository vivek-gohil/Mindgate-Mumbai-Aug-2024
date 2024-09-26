package com.mindgate.main.domain;

public class Employee extends Audit {
	private int employeeId;
	private String firstName;
	private String lastName;
	private double salary;

	public Employee() {
		System.out.println("Employee object created");
	}

	public Employee(int employeeId, String firstName, String lastName, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		System.out.println("Parameterized of Employee");
	}

	public int getEmployeeId() {
		System.out.println("getEmployeeId");
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		System.out.println("setEmployeeId");
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		System.out.println(this.hashCode());
		System.out.println("getFirstName = " + firstName);
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println(this.hashCode());
		System.out.println("setFirstName = " + firstName + " " + firstName.equals(""));
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("getLastName");
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("setLastName");
		this.lastName = lastName;
	}

	public double getSalary() {
		System.out.println("getSalary");
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("setSalary");
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + "]";
	}

}
