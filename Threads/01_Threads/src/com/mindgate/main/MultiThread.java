package com.mindgate.main;

import com.mindgate.main.threads.ThreadOne;
import com.mindgate.main.threads.ThreadTwo;

public class MultiThread {
	public static void main(String[] args) {

		System.out.println("Main start");

		ThreadOne threadOne = new ThreadOne();

		threadOne.start();

		Thread threadTwo = new Thread(new ThreadTwo());
		threadTwo.start();
	
		System.out.println("Main end");
	}
}
