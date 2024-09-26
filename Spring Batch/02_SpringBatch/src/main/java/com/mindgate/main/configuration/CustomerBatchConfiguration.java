package com.mindgate.main.configuration;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.mindgate.main.domain.Customer;
import com.mindgate.main.processor.CustomerItemProcessor;

@Configuration
public class CustomerBatchConfiguration {

	// Read .csv file map to customer object - reader
	@Bean
	FlatFileItemReader<Customer> reader() {
		System.out.println("Creating Reader To Read Data From CSV File");
		FlatFileItemReader<Customer> reader = new FlatFileItemReaderBuilder<Customer>().name("customerItemReader")
				.resource(new ClassPathResource("customer.csv")).delimited()
				.names("customerId", "firstName", "lastName").targetType(Customer.class).build();
		reader.setLinesToSkip(1);
		return reader;
	}

	@Bean
	CustomerItemProcessor getCustomerItemProcessor() {
		return new CustomerItemProcessor();
	}

	@Bean
	JdbcBatchItemWriter<Customer> writer(DataSource dataSource) {
		return new JdbcBatchItemWriterBuilder<Customer>()
				.sql("INSERT INTO customer_details values(:customerId,:firstName,:lastName)").dataSource(dataSource)
				.beanMapped().build();
	}

	@Bean
	Step step1(JobRepository jobRepository, DataSourceTransactionManager manager, FlatFileItemReader<Customer> reader,
			CustomerItemProcessor processor, JdbcBatchItemWriter<Customer> writer) {
		return new StepBuilder("step1", jobRepository).<Customer, Customer>chunk(5, manager).reader(reader)
				.processor(processor).writer(writer).build();

	}

	@Bean
	Job importCustomerJob(JobRepository jobRepository, Step step1, JobCompletionNotificationListener listener) {
		return new JobBuilder("importCustomerJob", jobRepository).start(step1).listener(listener).build();
	}

}
