package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class MyCustomerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCustomerAppApplication.class, args);
	}
	
	@GetMapping("/")
	public String sayHello()
	{
		return "index";
	}

}
