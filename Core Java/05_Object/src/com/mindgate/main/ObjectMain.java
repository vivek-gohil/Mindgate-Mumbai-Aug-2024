package com.mindgate.main;

import com.mindgate.main.domain.Employee;

public class ObjectMain {
	public static void main(String[] args) {
		String messageOne = "Hi";
		String messageTwo = new String("Hi");

		System.out.println("HashCode of messageOne = " + messageOne.hashCode());
		System.out.println("HashCode of messageTwo = " + messageTwo.hashCode());

		// messageOne = messageOne + " Akshay";

		System.out.println(messageOne); // Hi Akshay
		System.out.println(messageTwo); // Hi

		System.out.println("HashCode of messageOne = " + messageOne.hashCode());
		System.out.println("HashCode of messageTwo = " + messageTwo.hashCode());

		// Its matching
		if (messageOne.equals(messageTwo)) {
			System.out.println("Its matching");
		} else {
			System.out.println("Not matching");
		}

		System.out.println("---------------------------------");

		Employee employeeOne = new Employee(101, "Akshay", "G", 900000);
		Employee employeeTwo = new Employee(101, "Akshay", "G", 900009);

		System.out.println("HashCode of employeeOne = " + employeeOne.hashCode());
		System.out.println("HashCode of employeeTwo = " + employeeTwo.hashCode());

		// Not matching
		if (employeeOne.equals(employeeTwo)) {
			System.out.println("Its matching");
		} else {
			System.out.println("Not matching");
		}

		System.out.println("---------------------------------");

		StringBuilder stringOne = new StringBuilder("Hi");
		StringBuilder stringTwo = new StringBuilder("Hi");

		System.out.println("HashCode of stringOne = " + stringOne.hashCode());
		System.out.println("HashCode of stringTwo = " + stringTwo.hashCode());

		if (stringOne.toString().equals(stringTwo.toString())) {
			System.out.println("Its matching");
		} else {
			System.out.println("Not matching");
		}
	}
}
