package com.bus.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class BusProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusProjectApplication.class, args);
		


		System.out.println("save the record");

	}

}
