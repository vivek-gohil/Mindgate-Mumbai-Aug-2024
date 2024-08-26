package com.mindgate.main;

import com.mindgate.main.domain.EmployeeDetails;

public class EmployeeDetailsMain {

	public static void main(String[] args) {
		EmployeeDetails employeeDetails = new EmployeeDetails();

		employeeDetails.setEmployeeId(101);
		employeeDetails.setFirstName("Vivek");
		employeeDetails.setLastName("Gohil");
		employeeDetails.setSalary(10000);

		System.out.println("EmployeeId = " + employeeDetails.getEmployeeId());
		System.out.println("First Name = " + employeeDetails.getFirstName());
		System.out.println("Last Name = " + employeeDetails.getLastName());
		System.out.println("Salary = " + employeeDetails.getSalary());
		System.out.println("main end");
	}

}
