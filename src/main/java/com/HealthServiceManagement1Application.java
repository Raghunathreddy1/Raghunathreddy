package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HealthServiceManagement1Application {

	public static void main(String[] args) {
		SpringApplication.run(HealthServiceManagement1Application.class, args);
		System.out.println("connected to database");

	}

}