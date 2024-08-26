package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.service.EmployeeService;
import com.mindgate.main.service.EmployeeServiceImpl;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EmployeeService employeeService = new EmployeeServiceImpl();
		Employee employee = null;
		Employee employeeFromDB = null;
		int employeeId;
		String firstName, lastName;
		double salary;
		int choice;
		String continueChoice;

		do {
			System.out.println("Menu");
			System.out.println("1. Add New Employee");
			System.out.println("2. Update Employee Salary");
			System.out.println("3. Update Employee FirstName and LastName");
			System.out.println("4. Delete Employee By EmployeeId");
			System.out.println("5. Print Employee By EmployeeId");
			System.out.println("6. Print All Employees");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter first name");
				firstName = scanner.next();
				System.out.println("Enter last name");
				lastName = scanner.next();
				System.out.println("Enter salary");
				salary = scanner.nextDouble();
				employee = new Employee(firstName, lastName, salary);
				employeeFromDB = employeeService.addNewEmployee(employee);
				System.out.println("Your employeeId = " + employeeFromDB.getEmployeeId());
				break;
			case 2:
				System.out.println("Enter employeeId");
				employeeId = scanner.nextInt();
				employeeFromDB = employeeService.getEmployeeByEmployeeId(employeeId);
				if (employeeFromDB != null) {
					System.out.println("Enter salary");
					salary = scanner.nextDouble();
					employeeFromDB.setSalary(salary);
					employeeFromDB = employeeService.updateSalary(employeeFromDB);
					System.out.println("Updated Employee");
					System.out.println(employeeFromDB);
				} else {
					System.out.println("Invalid EmployeeId");
				}
				break;
			case 3:
				System.out.println("Enter employeeId");
				employeeId = scanner.nextInt();
				employeeFromDB = employeeService.getEmployeeByEmployeeId(employeeId);
				if (employeeFromDB != null) {
					System.out.println("Enter firstName");
					firstName = scanner.next();
					System.out.println("Enter lastName");
					lastName = scanner.next();
					employeeFromDB.setFirstName(firstName);
					employeeFromDB.setLastName(lastName);
					employeeFromDB = employeeService.updateFirstNameLastName(employeeFromDB);
					System.out.println("Updated Employee");
					System.out.println(employeeFromDB);
				} else {
					System.out.println("Invalid EmployeeId");
				}
				break;
			case 4:
				System.out.println("Enter employeeId");
				employeeId = scanner.nextInt();
				if (employeeService.deleteEmployeeByEmployeeId(employeeId)) {
					System.out.println("Employee deleted successfully");
				} else {
					System.out.println("Employee not found");
				}
				break;
			case 5:
				System.out.println("Enter employeeId");
				employeeId = scanner.nextInt();
				employeeFromDB = employeeService.getEmployeeByEmployeeId(employeeId);
				if (employeeFromDB != null) {
					System.out.println(employeeFromDB);
				} else {
					System.out.println("Invalid EmployeeId");
				}
				break;
			case 6:
				System.out.println("List of employees");
				for (Employee e : employeeService.getAllEmployees()) {
					System.out.println(e);
				}
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue yes/no ");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes"));

	}

}
