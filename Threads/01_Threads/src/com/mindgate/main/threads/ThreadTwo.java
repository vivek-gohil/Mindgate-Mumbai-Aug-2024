package com.mindgate.main.threads;

public class ThreadTwo implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread Two Start");
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread Two = " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ThreadTwo End");
	}
}
