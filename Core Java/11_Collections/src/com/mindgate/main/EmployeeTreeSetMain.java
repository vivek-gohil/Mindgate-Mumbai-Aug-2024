package com.mindgate.main;

import java.util.Set;
import java.util.TreeSet;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.sort.SortByFirstName;
import com.mindgate.main.sort.SortByLastName;

public class EmployeeTreeSetMain {
	public static void main(String[] args) {

		Set<Employee> employeeSet = new TreeSet<Employee>(new SortByLastName());
		Employee employee1 = new Employee(101, "Shivam", "K", 10000);
		Employee employee2 = new Employee(102, "Shivam", "S", 10000); // 3453 - 2
		Employee employee3 = new Employee(103, "Chaitanya", "K", 10000);
		Employee employee4 = new Employee(103, "Suman", "K", 10000);

		employeeSet.add(employee3);
		employeeSet.add(employee4);
		employeeSet.add(employee1);
		employeeSet.add(employee2);

		for (Employee employee : employeeSet) {
			System.out.println(employee);
		}

//		System.out.println("----------------------------");
		employeeSet.remove(employee4);
//		System.out.println("----------------------------");
//		for (Employee employee : employeeSet) {
//			System.out.println(employee);
//		}

	}
}
