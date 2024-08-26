package com.mindgate.main;

import com.mindgate.main.domain.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee[] allEmployees = new Employee[5];

		System.out.println("Array Length :: " + allEmployees.length);

		allEmployees[0] = new Employee(101, "Chaitanya", "Kadali", 900000);
		allEmployees[1] = new Employee(102, "Nirav", "Gujrathi", 900000);
		allEmployees[2] = new Employee(102, "Akshay", "G", 900000);
		allEmployees[4] = new Employee(103, "Adarsh", "Mishra", 900000);

		System.out.println("Getting values");
		for (Employee employee : allEmployees) {
			if (employee != null) {
				System.out.println(employee.toString());
//				System.out.println(employee.getEmployeeId());
//				System.out.println(employee.getFirstName());
//				System.out.println(employee.getLastName());
//				System.out.println(employee.getSalary());
			} else {
				System.out.println("No employee on this index");
			}
			System.out.println();
		}
	}
}
