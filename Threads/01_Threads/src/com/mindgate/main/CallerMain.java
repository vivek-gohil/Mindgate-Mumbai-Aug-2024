package com.mindgate.main;

import com.mindgate.main.resource.CallMeResource;
import com.mindgate.main.threads.CallerThread;

public class CallerMain {
	public static void main(String[] args) {
		System.out.println("main start");

		CallMeResource callMeResource = new CallMeResource();

//		callMeResource.call("Hi");
//		callMeResource.call("Hello");
//		callMeResource.call("How are you");

		Thread thread1 = new Thread(new CallerThread(callMeResource, "Hi"));
		thread1.start();

		Thread thread2 = new Thread(new CallerThread(callMeResource, "Hello"));
		thread2.start();

		Thread thread3 = new Thread(new CallerThread(callMeResource, "How are you"));
		thread3.start();

		Thread thread4 = new Thread(new CallerThread(callMeResource, "This is Nirav"));
		thread4.start();

		System.out.println("main end");
	}
}
