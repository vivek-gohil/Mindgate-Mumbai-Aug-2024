package com.mindgate.main.threads;

import java.util.List;
import java.util.concurrent.Callable;

import com.mindgate.main.domain.Order;

public class PaymentOrder implements Callable<Order> {

	private Order order;

	public PaymentOrder(Order order) {
		this.order = order;
	}

	public Order call() throws Exception {
		List<String> orderStatus = order.getOrderStatus();
		orderStatus.add("Payment");
		// save into database - code
		Thread.sleep(500);
		System.out.println(order);
		return order;
	}
}
