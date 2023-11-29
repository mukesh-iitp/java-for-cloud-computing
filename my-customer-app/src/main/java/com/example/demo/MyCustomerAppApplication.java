package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class MyCustomerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCustomerAppApplication.class, args);
	}
	
	public String sayHello()
	{
		return "index";
	}

}
