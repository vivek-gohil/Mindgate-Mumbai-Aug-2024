package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.main.domain.Shape;
import com.mindgate.main.factory.ShapeFactory;

public class ShapeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ShapeFactory factory = new ShapeFactory();
		Shape shape;
		int choice;

		System.out.println("Menu");
		System.out.println("1. Draw Circle");
		System.out.println("2. Draw Triangle");
		System.out.println("3. Draw Line");
		System.out.println("Enter your choice");
		choice = scanner.nextInt();
		shape = factory.getShape(choice);
		shape.draw();

		scanner.close();
	}
}
