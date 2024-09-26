package com.mindgate.main.threads;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableThread implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		Thread.sleep(500);
		return new Random().nextInt();
	}
}
