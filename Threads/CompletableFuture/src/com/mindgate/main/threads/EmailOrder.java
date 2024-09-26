package com.mindgate.main.threads;

import java.util.List;
import java.util.concurrent.Callable;

import com.mindgate.main.domain.Order;

public class EmailOrder implements Callable<Order> {

	private Order order;

	public EmailOrder(Order order) {
		this.order = order;
	}

	public Order call() throws Exception {
		List<String> orderStatus = order.getOrderStatus();
		orderStatus.add("Email , Completed");
		if (order.getOrderId() == 103) {
			Thread.sleep(10000);
		}
		// save into database - code
		Thread.sleep(500);
		System.out.println(order);
		return order;
	}
}
