package com.mindgate.main;

import com.mindgate.main.functional.ArithmaticOperation;
import com.mindgate.main.functional.Greetings;
import com.mindgate.main.functional.StringLengthLambda;

public class LambdaExprssionsMain {

	public static void main(String[] args) {
//		Greetings greetings = new Greetings() {
//
//			@Override
//			public void greet() {
//				System.out.println("Good Morning");
//			}
//		};

		Greetings greetings = () -> System.out.println("Good Moring");
		Greetings greetings2 = () -> {
			System.out.println("Good Moring");
			System.out.println("Welcome to lambda");
		};

		greetings2.greet();

		System.out.println();

		String text = "Lambda Exprssion Is Simple";

//		StringLengthLambda lambda = (String t) -> {
//			return t.length();
//		};

		StringLengthLambda lambda = (t) -> t.length();
		System.out.println(lambda.getLength(text));

		ArithmaticOperation addition = (n1, n2) -> n1 + n2;
		calculateLambda(addition, 10, 2);

		calculateLambda((n1, n2) -> n1 - n2, 10, 20);
		calculateLambda((n1, n2) -> n1 * n2, 90, 4);
		calculateLambda((n1, n2) -> n1 / n2, 10, 2);
	}

	public static void calculateLambda(ArithmaticOperation arithmaticOperation, double n1, double n2) {
		System.out.println("Result = " + arithmaticOperation.doCalculations(n1, n2));
	}

}
