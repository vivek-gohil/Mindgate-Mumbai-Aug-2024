package com.mindgate.main.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("customerbatchapi")
@RestController
public class CustomerController {

	private Job job;
	private JobLauncher jobLauncher;

	public CustomerController(Job job, JobLauncher jobLauncher) {
		super();
		this.job = job;
		this.jobLauncher = jobLauncher;
	}

	@GetMapping("import")
	public String importCustomers() {
		try {
			jobLauncher.run(job, new JobParameters());
			return "Job started successfully";
		} catch (JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException
				| JobParametersInvalidException e) {
			e.printStackTrace();
			return "Job Failed" + e.getMessage();
		}
	}
}
