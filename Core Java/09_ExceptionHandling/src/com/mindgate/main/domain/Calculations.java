package com.mindgate.main.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculations {
	private int number1;
	private int number2;
	private int result;

	public void accept() {
		System.out.println("accept() start");
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter number1");
			number1 = scanner.nextInt();
			System.out.println("Enter number2");
			number2 = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input From User");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Thank you");
			scanner.close();
		}
		System.out.println("accept() end");
	}

	public void calculate() {
		System.out.println("calculate() start");
		result = number1 + number2;
		System.out.println("calculate() end");
	}

	public void display() {
		System.out.println("display() start");
		System.out.println("Result = " + result);
		System.out.println("display() end");
	}
}
