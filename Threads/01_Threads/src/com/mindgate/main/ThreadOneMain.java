package com.mindgate.main;

import com.mindgate.main.threads.ThreadOne;
import com.mindgate.main.threads.ThreadTwo;

public class ThreadOneMain {
	public static void main(String[] args) {

		System.out.println("main start");

		Thread thread = Thread.currentThread();
		System.out.println(thread);

		System.out.println();

		ThreadOne threadOne = new ThreadOne();
		threadOne.start();
		System.out.println(threadOne);

		Thread thread2 = new Thread(new ThreadTwo());
		System.out.println(thread2);
		thread2.start();

		System.out.println("main end");

	}
}
