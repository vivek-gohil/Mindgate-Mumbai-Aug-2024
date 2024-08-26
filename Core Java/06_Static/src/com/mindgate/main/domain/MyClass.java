package com.mindgate.main.domain;

public class MyClass {
	private static int number1 = 10;
	private static int number2 = 10;

	public MyClass() {
		System.out.println("Constrcutor of MyClass");
	}

	{
		System.out.println("non static block of MyClass");
	}

	static {
		System.out.println("static block of MyClass");
	}

	public static void display() {
		System.out.println("Value of static variable number1 = " + number1);
		System.out.println("Value of non static variable number2 = " + number2);

		number1 += 10;
		number2 += 10;

		System.out.println("Value of static variable number1 = " + number1);
		System.out.println("Value of non static variable number2 = " + number2);

	}
}

//10 10 20 20 
//20 10 30 20
