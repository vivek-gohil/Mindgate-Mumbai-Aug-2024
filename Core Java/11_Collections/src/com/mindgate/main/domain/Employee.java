package com.mindgate.main.domain;

public class Employee implements Comparable<Employee> {

	private static int employeeIdGenerator = 100;
	private int employeeId;
	private String firstName;
	private String lastName;
	private double salary;

	public Employee() {
		employeeId = employeeIdGenerator;
		employeeIdGenerator++;
	}

	public Employee(String firstName, String lastName, double salary) {
		employeeId = employeeIdGenerator;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		employeeIdGenerator++;
	}

	public int getEmployeeId() {
		return employeeId;
	}

//	public void setEmployeeId(int employeeId) {
//		this.employeeId = employeeId;
//	}

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
	public boolean equals(Object obj) {
		System.out.println("calling equals");
		Employee employee = (Employee) obj;
		if (employee.employeeId == this.employeeId && employee.firstName.equals(this.firstName)
				&& employee.lastName.equals(this.lastName) && employee.salary == this.salary) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("calling hashCode");
		return employeeId + firstName.hashCode() + lastName.hashCode() + (int) salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e) {
		return this.employeeId - e.employeeId;
	}

}
