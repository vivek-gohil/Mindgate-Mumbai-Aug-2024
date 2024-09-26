package com.mindgate.main.processor;

import org.springframework.batch.item.ItemProcessor;

import com.mindgate.main.domain.Customer;

public class CustomerItemProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer customer) throws Exception {
		String upperFirstName = customer.getFirstName().toUpperCase();
		String upperLastName = customer.getLastName().toUpperCase();
		Customer processedCustomer = new Customer(customer.getCustomerId(), upperFirstName, upperLastName);
		return processedCustomer;
	}
}
