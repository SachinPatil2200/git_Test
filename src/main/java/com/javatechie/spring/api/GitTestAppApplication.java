package com.javatechie.spring.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitTestAppApplication {

	@PostMapping("/purchase")
	public String purchase(@RequestBody Order order) {
		return "Hi " + order.getUName() + " order for " + order.getProductName() + " with amount "
				+ order.getAmmount() + " stored successfully...";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitTestAppApplication.class, args);
	}
}
