package com.mindgate.main;

import com.mindgate.main.threads.ThreadOne;
import com.mindgate.main.threads.ThreadTwo;

public class JoinMain {
	public static void main(String[] args) {

		System.out.println("Main start");

		ThreadOne threadOne = new ThreadOne();

		threadOne.start();

		System.out.println();
		try {
			threadOne.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread threadTwo = new Thread(new ThreadTwo());
		threadTwo.start();
		try {
			threadTwo.join();
		} catch (InterruptedException e) {                                                                  
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main end");
	}
}
