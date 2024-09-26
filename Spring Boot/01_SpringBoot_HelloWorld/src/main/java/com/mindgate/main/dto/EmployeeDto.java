package com.mindgate.main.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class EmployeeDto {
	private int employeeId;
	@NotBlank(message = "Firstname cannot be blank")
	private String firstName;
	@NotBlank(message = "Lastname cannot be blank")
	private String lastName;
	@Positive(message = "Salary cannot be 0 or < 0")
	private double salary;

	public EmployeeDto() {
		System.out.println("Employee object created");
	}

	public EmployeeDto(int employeeId, @NotBlank(message = "Firstname cannot be blank") String firstName,
			@NotBlank(message = "Lastname cannot be blank") String lastName,
			@Positive(message = "Salary cannot be 0 or < 0") double salary) {
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
