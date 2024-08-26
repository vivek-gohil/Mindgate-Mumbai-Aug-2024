package com.mindgate.main;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.main.domain.Employee;

public class EmployeeListMain {
	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();
		Employee employee1 = new Employee(101, "Shivam", "K", 10000);
		Employee employee2 = new Employee(102, "Shivam", "S", 10000);
		Employee employee3 = new Employee(103, "Chaitanya", "K", 10000);
		Employee employee4 = new Employee(103, "Chaitanya", "K", 10000);

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);

		for (Employee employee : employeeList) {
			System.out.println(employee);
		}

		System.out.println("----------------------------");
		employeeList.remove(employee4);
		System.out.println("----------------------------");
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}

	}
}
