package com.javacode.example.rest.micro1;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan
public class Micro1Server {
	protected Logger logger = Logger.getLogger(Micro1Server.class.getName());

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "micro1-server");

		SpringApplication.run(Micro1Server.class, args);
	}
}
