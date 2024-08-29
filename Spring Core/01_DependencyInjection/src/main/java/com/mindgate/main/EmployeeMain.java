package com.mindgate.main;

import com.mindgate.main.domain.Address;
import com.mindgate.main.domain.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		//1. Parameterized Constructor
		
		// Create Employee Object - Call Parameterized constructor
		Address address = new Address(101, "B-321,Woodland Park", "M.G. Road", "Mumbai", "Maharashtra", 400012);
		Employee employee = new Employee(1, "Rohan", 50000, address);

		// Print Employee Object
		System.out.println(employee);
		
		//2. Setter
		
	}
}
