package com.mindgate.main.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class SpringMVCConfiguration {

	public SpringMVCConfiguration() {
		System.out.println("SpringMVCConfiguration Object Created");
	}

	@Bean
	public ViewResolver getViewResolver() {
		System.out.println("In getViewResolver()");
		InternalResourceViewResolver viewResolver 
			= new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
		return viewResolver;
	}

}
