package com.donderdag.thursday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThursdayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThursdayApplication.class, args);
		System.out.println("doet ie het of doet ie het niet");
	}

}
