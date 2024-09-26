package com.mindgate.main;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.mindgate.main.threads.CallableThread;
import com.mindgate.main.threads.CallerThread;
import com.mindgate.main.threads.Task;
import com.mindgate.main.threads.ThreadOne;
import com.mindgate.main.threads.ThreadTwo;

public class CallableMain {
	public static void main(String[] args) {
		// Thread thread = new Thread(new CallableThread());

//		System.out.println("Without executor service");
//		
//		for (int i = 0; i < 10; i++) {
//			Thread thread = new Thread(new ThreadOne());
//			thread.start();
//		}

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 10; i++) {
			executorService.execute(new Task("Thread " + i));
		}

	}
}
