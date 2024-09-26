package com.mindgate.main.threads;

import java.util.List;
import java.util.concurrent.Callable;

import com.mindgate.main.domain.Order;

public class FetchOrder implements Callable<Order> {
	
	private Order order;
	
	public FetchOrder(Order order) {
		this.order = order;
	}


	public Order call() throws Exception {
		List<String> orderStatus = order.getOrderStatus();
		orderStatus.add("FetchOrder");
		//save into database - code
		Thread.sleep(500);
		System.out.println(order);
		return order;
	}
}
