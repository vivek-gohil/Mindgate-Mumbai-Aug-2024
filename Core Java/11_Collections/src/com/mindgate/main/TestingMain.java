package com.mindgate.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.sort.SortByFirstName;
import com.mindgate.main.sort.SortByLastName;

public class TestingMain {
	public static void main(String[] args) {
		String[] friends = { "Shivam", "Chaitanya", "Yugs", "Nikhil" };
		for (String name : friends) {
			System.out.println(name);
		}
		System.out.println("------------------------");
		// Arrays.sort(friends);
		System.out.println("------------------------");
		for (String name : friends) {
			System.out.println(name);
		}
		System.out.println("------------------------");
		List<String> friendsList = Arrays.asList(friends);
		Collections.sort(friendsList);
		for (String name : friendsList) {
			System.out.println(name);
		}
		System.out.println("------------------------");
		List<Employee> employeeList = new ArrayList<Employee>();
		Employee employee1 = new Employee(101, "Shivam", "K", 10000);
		Employee employee2 = new Employee(102, "Shivam", "S", 10000);
		Employee employee3 = new Employee(103, "Chaitanya", "K", 10000);
		Employee employee4 = new Employee(103, "Chaitanya", "K", 10000);

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		// Default sort - By employeeId
		// Collections.sort(employeeList);

		// sort - By FirstName
//		SortByFirstName byFirstName = new SortByFirstName();
//		Collections.sort(employeeList, byFirstName);

		// sort - By LastName
		Collections.sort(employeeList, new SortByLastName());

		for (Employee employee : employeeList) {
			System.out.println(employee);
		}

	}
}
