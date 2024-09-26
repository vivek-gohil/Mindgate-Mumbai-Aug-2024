package com.mindgate.main.threads;

public class ThreadOne extends Thread {
	@Override
	public void run() {
		System.out.println("ThreadOne Start");
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread One = " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ThreadOne End");
	}
}
