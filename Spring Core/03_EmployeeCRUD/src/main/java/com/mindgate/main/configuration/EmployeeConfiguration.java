package com.mindgate.main.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.mindgate.main")
public class EmployeeConfiguration {

	public EmployeeConfiguration() {
		System.out.println("Default constructor of EmployeeConfiguration");
	}

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "mindgatemumbai";
		String password = "mindgatemumbai";
		String driverName = "oracle.jdbc.driver.OracleDriver";

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driverName);
		dataSource.setUrl(url);
		dataSource.setPassword(password);
		dataSource.setUsername(userName);

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		return jdbcTemplate;

	}
}
