package com.mindgate.main.resource;

public class CallMeResource {
	public synchronized void call(String message) {
		System.out.print("[");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(message);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
