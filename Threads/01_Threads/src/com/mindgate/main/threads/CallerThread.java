package com.mindgate.main.threads;

import com.mindgate.main.resource.CallMeResource;

public class CallerThread implements Runnable {

	private CallMeResource callMeResource;
	private String message;

	public CallerThread(CallMeResource callMeResource, String message) {
		this.callMeResource = callMeResource;
		this.message = message;
	}

	@Override
	public void run() {
		callMeResource.call(message);
	}
}
