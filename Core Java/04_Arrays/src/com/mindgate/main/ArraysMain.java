package com.mindgate.main;

public class ArraysMain {
	public static void main(String[] args) {

//		int[] numbers = new int[5];
//
//		System.out.println("Setting Values");
//		numbers[0] = 12;
//		numbers[1] = 32;
//		numbers[2] = 62;
//		numbers[3] = 121;
//		numbers[4] = 52;

		int[] numbers = { 12, 22, 63, 88, 32, 132 };

		System.out.println("Getting Values");
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);
		System.out.println("Using For loop");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		System.out.println("Using Foreach loop");
		for (int i : numbers) {
			System.out.println(i);
		}

	}
}
