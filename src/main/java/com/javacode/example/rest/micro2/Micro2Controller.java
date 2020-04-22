package com.javacode.example.rest.micro2;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/micro2")
public class Micro2Controller {
	protected Logger logger = Logger.getLogger(Micro2Controller.class.getName());

	@GetMapping
	public String getTest() {
		String result = "{\"resultCode\":\"4444\", \"test\":\"4444\", \"test\": \"5555\"}";
		return result;
	}

}
