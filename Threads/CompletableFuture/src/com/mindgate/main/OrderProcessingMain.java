package com.mindgate.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;

import com.mindgate.main.domain.Order;
import com.mindgate.main.threads.DispatchOrder;
import com.mindgate.main.threads.EmailOrder;
import com.mindgate.main.threads.EnrichOrder;
import com.mindgate.main.threads.FetchOrder;
import com.mindgate.main.threads.PaymentOrder;

public class OrderProcessingMain {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		Order order1 = new Order(101, 3, "Shirt", 100, new ArrayList<String>());
		Order order2 = new Order(102, 2, "Mouse", 7000, new ArrayList<String>());
		Order order3 = new Order(103, 3, "Water Bottel", 300, new ArrayList<String>());
		Order order4 = new Order(104, 1, "Key-board", 5000, new ArrayList<String>());
		Order order5 = new Order(105, 1, "Mobile", 1000, new ArrayList<String>());

		List<Order> allOrders = Arrays.asList(order1, order2, order3, order4, order5);

		//doOrderProcessing(allOrders, executorService);
		
		for (Order order : allOrders) {
			doAsyncOrderProcessing(executorService, order);
		}
	}
	
	public static void doAsyncOrderProcessing(ExecutorService executorService , Order order) {
		CompletableFuture.supplyAsync(() -> fetchOrder(executorService, order))
		.thenApply((o) -> enrichOrder(executorService, o))
		.thenApply((o) -> paymentOrder(executorService, o))
		.thenApply((o) -> dispatchOrder(executorService, o))
		.thenAccept((o) -> emailOrder(executorService, o));
	}

	public static Order fetchOrder(ExecutorService executorService, Order order) {
		try {
			Future<Order> fetchOrderFurure = executorService.submit(new FetchOrder(order));
			Order fetchedOrder = fetchOrderFurure.get();
			return fetchedOrder;
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static Order enrichOrder(ExecutorService executorService, Order order) {
		try {
			Future<Order> enrichOrderFurure = executorService.submit(new EnrichOrder(order));
			Order enrichedOrder = enrichOrderFurure.get();
			return enrichedOrder;
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static Order paymentOrder(ExecutorService executorService, Order order) {
		try {
			Future<Order> paymentOrderFurure = executorService.submit(new PaymentOrder(order));
			Order paidOrder = paymentOrderFurure.get();
			return paidOrder;
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static Order dispatchOrder(ExecutorService executorService, Order order) {
		try {
			Future<Order> dispatchOrderFurure = executorService.submit(new DispatchOrder(order));
			Order dispatchedOrder = dispatchOrderFurure.get();
			return dispatchedOrder;
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static Order emailOrder(ExecutorService executorService, Order order) {
		try {
			Future<Order> emailOrderFurure = executorService.submit(new EmailOrder(order));
			Order emailedOrder = emailOrderFurure.get();
			return emailedOrder;
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	private static void doOrderProcessing(List<Order> allOrders, ExecutorService executorService) {
		for (Order order : allOrders) {

			try {
				Future<Order> fetchOrderFurure = executorService.submit(new FetchOrder(order));
				Order fetchedOrder = fetchOrderFurure.get();
				System.out.println(fetchedOrder);

				Future<Order> enrichOrderFurure = executorService.submit(new EnrichOrder(fetchedOrder));
				Order enrichedOrder = enrichOrderFurure.get();
				System.out.println(enrichedOrder);

				Future<Order> paymentOrderFurure = executorService.submit(new PaymentOrder(enrichedOrder));
				Order paidOrder = paymentOrderFurure.get();
				System.out.println(paidOrder);

				Future<Order> dispatchOrderFurure = executorService.submit(new DispatchOrder(paidOrder));
				Order dispatchedOrder = dispatchOrderFurure.get();
				System.out.println(dispatchedOrder);

				Future<Order> emailOrderFurure = executorService.submit(new EmailOrder(dispatchedOrder));
				Order emailedOrder = emailOrderFurure.get();
				System.out.println(emailedOrder);

			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
	}
}
