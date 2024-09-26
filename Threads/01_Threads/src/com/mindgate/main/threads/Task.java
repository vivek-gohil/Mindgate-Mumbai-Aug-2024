package com.mindgate.main.threads;

public class Task implements Runnable {

	private String threadName;

	public Task(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		System.out.println("Thread : " + threadName + "Started");
		System.out.println("Doing task");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread : " + threadName + " Ended");
		;

	}
}
