package com.mindgate.main;

import com.mindgate.main.threads.ThreadTwo;

public class ThreadTwoMain {
	public static void main(String[] args) {
		System.out.println("Main start");
		ThreadTwo threadTwo = new ThreadTwo();
		Thread thread = new Thread(threadTwo);
		thread.start();

		System.out.println("Main end");

	}
}
