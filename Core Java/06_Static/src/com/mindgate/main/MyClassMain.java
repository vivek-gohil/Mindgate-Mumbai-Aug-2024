package com.mindgate.main;

import com.mindgate.main.domain.MyClass;

public class MyClassMain {
	public static void main(String[] args) {
//		MyClass myClass = new MyClass();
//		myClass.display();
//		
//		System.out.println("------------------------");
//	
//		MyClass myClass2 = new MyClass();
//		myClass2.display();

//		MyClass.display();
//		System.out.println();
//		MyClass myClass = new MyClass();
//		myClass.display();

		System.out.println("main start");
//		MyClass myClass1 = new MyClass(); // constructor
//		myClass1.display();
//		
//		System.out.println();

		try {
			Class.forName("com.mindgate.main.domain.MyClass");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		MyClass.display();

//		MyClass myClass2 = new MyClass(); // constructor
//		myClass2.display();
//
//		// MyClass.display();

		System.out.println("main end");
	}
}
