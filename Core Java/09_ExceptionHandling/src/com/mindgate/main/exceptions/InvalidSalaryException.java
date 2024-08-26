package com.mindgate.main.exceptions;

//Creating checked exception
public class InvalidSalaryException extends RuntimeException {

	public InvalidSalaryException() {
		System.out.println("InvalidSalaryException object created");
	}

	@Override
	public String getMessage() {
		return "Salary cannot <= 0";
	}
}
