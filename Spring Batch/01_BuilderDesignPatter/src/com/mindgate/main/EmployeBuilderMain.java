package com.mindgate.main;

import com.mindgate.main.builder.EmployeeBuilder;
import com.mindgate.main.domain.Employee;

public class EmployeBuilderMain {
	public static void main(String[] args) {
		Employee employee;

		employee = new EmployeeBuilder().withEmployeeId(101).withFirstName("Suman").build();

		System.out.println(employee);
	}
}
