package com.training.JobScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class JobSchedulerApplication extends SpringBootServletInitializer {

	/*
	* When running as a JAR
	 */
	public static void main(String[] args) {

		SpringApplication.run(JobSchedulerApplication.class, args);
	}

	/*
	* When running as a WAR
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

		return builder.sources(JobSchedulerApplication.class);
	}

}