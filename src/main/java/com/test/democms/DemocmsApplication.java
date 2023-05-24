package com.test.democms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemocmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemocmsApplication.class, args);
		System.out.println("maven build test ...");
	}

}
