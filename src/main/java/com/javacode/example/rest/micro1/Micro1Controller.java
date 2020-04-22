package com.javacode.example.rest.micro1;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/micro1")
public class Micro1Controller {

	protected Logger logger = Logger.getLogger(Micro1Controller.class.getName());

	@GetMapping
	public String getTest() {
		return "{\"resultCode\":\"20000\", \"resultDescription\":\"Success\", \"data\": { \"base64Image\" :\"xxxxxxxxxx\" }}";
	}
}
