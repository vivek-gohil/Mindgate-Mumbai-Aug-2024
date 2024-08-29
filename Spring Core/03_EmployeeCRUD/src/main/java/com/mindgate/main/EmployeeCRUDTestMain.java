package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.main.configuration.EmployeeConfiguration;
import com.mindgate.main.domain.Employee;
import com.mindgate.main.repository.EmployeeRepository;
import com.mindgate.main.repository.EmployeeRepositoryImpl;

public class EmployeeCRUDTestMain {
	public static void main(String[] args) {
		System.out.println("main start");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeeConfiguration.class);

		EmployeeRepository employeeRepository = applicationContext.getBean(EmployeeRepositoryImpl.class);

		Employee employee = new Employee(0, "Nirav", "Gujrathi", 900000);

		System.out.println(employeeRepository.addNewEmployee(employee));

		System.out.println("--------------------------------------");

		for (Employee e : employeeRepository.getAllEmployees()) {
			System.out.println(e);
		}

		System.out.println("main end");
	}
}
