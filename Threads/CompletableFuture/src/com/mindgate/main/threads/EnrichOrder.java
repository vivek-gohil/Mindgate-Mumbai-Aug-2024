package com.mindgate.main.threads;

import java.util.List;
import java.util.concurrent.Callable;

import com.mindgate.main.domain.Order;

public class EnrichOrder implements Callable<Order> {
	
	private Order order;
	
	public EnrichOrder(Order order) {
		this.order = order;
	}


	public Order call() throws Exception {
		List<String> orderStatus = order.getOrderStatus();
		orderStatus.add("Enrich");
		//save into database - code
		Thread.sleep(500);
		System.out.println(order);
		return order;
	}
}
