package com.mindgate.main.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mindgate.main")
public class EmployeeConfiguration {

	public EmployeeConfiguration() {
		System.out.println("Configuration Object Created");
	}

}
