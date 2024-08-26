package com.mindgate.main;

import com.mindgate.main.domain.Calculations;
import com.mindgate.main.domain.Employee;
import com.mindgate.main.exceptions.InvalidSalaryException;

public class CalculationsMain {
	public static void main(String[] args) {
		System.out.println("main start");

//		Calculations calculations = new Calculations();
//		calculations.accept();
//		calculations.calculate();
//		calculations.display();

//		try {
//			Employee employee = new Employee(101, "First Name", "Last Name", 10);
//			System.out.println(employee);
//		} catch (InvalidSalaryException e) {
//			System.out.println(e.getMessage());
//		}

//		try {
//			Employee employee = new Employee(101, "First Name", "Last Name", 0);
//		} catch (InvalidSalaryException e) {
//			System.out.println(e.getMessage());
//		}

		Employee employee = new Employee(101, "First Name", "Last Name", 0);
		System.out.println("main end");
	}
}
