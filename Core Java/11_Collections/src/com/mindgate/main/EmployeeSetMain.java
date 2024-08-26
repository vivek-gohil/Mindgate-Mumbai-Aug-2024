package com.mindgate.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mindgate.main.domain.Employee;

public class EmployeeSetMain {
	public static void main(String[] args) {

		Set<Employee> employeeSet = new HashSet<Employee>();
		Employee employee1 = new Employee(101, "Shivam", "K", 10000);
		Employee employee2 = new Employee(102, "Shivam", "S", 10000); // 3453 - 2
		Employee employee3 = new Employee(103, "Chaitanya", "K", 10000);
		// Employee employee4 = new Employee(103, "Chaitanya", "K", 10000);

		// Employee employee4 = new Employee(101, "Shivam", "K", 10000);
		Employee employee4 = employee1;

		employeeSet.add(employee1);
		employeeSet.add(employee2);
		employeeSet.add(employee3);
		// employeeSet.add(employee4);

		for (Employee employee : employeeSet) {
			System.out.println(employee);
		}

		System.out.println("----------------------------");
		employeeSet.remove(employee4);
		System.out.println("----------------------------");
		for (Employee employee : employeeSet) {
			System.out.println(employee);
		}

	}
}
