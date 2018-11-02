package com.example.demo;

import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.quartz.TestScheduler;

@SpringBootApplication
public class Quartz1Application {

	@Autowired
	private TestScheduler scheduler;

	public static void main(String[] args) throws SchedulerException {
		SpringApplication.run(Quartz1Application.class, args);
	}
}
