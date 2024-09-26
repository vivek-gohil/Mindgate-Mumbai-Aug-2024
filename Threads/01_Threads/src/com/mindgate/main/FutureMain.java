package com.mindgate.main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.mindgate.main.threads.CallableThread;

public class FutureMain {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		System.out.println("Non blocking operation start");
		// Non block
		List<Future<Integer>> allFutures = new ArrayList<Future<Integer>>();

		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 100; i++) {
			// System.out.println("main :: " + i );
			Future<Integer> futureInt = executorService.submit(new CallableThread());
			allFutures.add(futureInt);
		}
		System.out.println(System.currentTimeMillis());

		System.out.println("Callable threads submitted");

//		for (int i = 0; i < 10; i++) {
//			try {
//				System.out.println("main " + i);
//				Thread.sleep(600);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		System.out.println("Blocking operation start");
//		for (int i = 0; i < allFutures.length; i++) {
//			int result = allFutures.get(i).get();
//			
//		}
//		for (Future<Integer> future : allFutures) {
//			try {
//				int result = future.get();
//				System.out.println("Result : " + result);
//			} catch (InterruptedException | ExecutionException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		System.out.println("main end");

	}
}
