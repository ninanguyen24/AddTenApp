package com.addten.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class BootcampApplication {

	public static void main(String[] args) {
		Properties properties;
		properties = System.getProperties();
		properties.setProperty("java.runtime.version", "15");
		System.setProperties(properties);
		//properties.list(System.out);

		SpringApplication.run(BootcampApplication.class, args);

	}

}
