package com.javacode.example.rest.micro2;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan
public class Micro2Server {
	protected Logger logger = Logger.getLogger(Micro2Server.class.getName());

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "micro2-server");

		SpringApplication.run(Micro2Server.class, args);
	}
}
