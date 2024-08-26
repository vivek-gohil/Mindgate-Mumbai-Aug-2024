package com.mindgate.main;

import java.util.Scanner;

public class HelloWorldMain {

	public static void main(String args[]) {
		System.out.println("Hello World");
		System.out.println("Mindgate");
		System.out.println("Mumbai");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String fullName = scanner.nextLine();
		System.out.println(fullName);
		scanner.close();

	}
}
