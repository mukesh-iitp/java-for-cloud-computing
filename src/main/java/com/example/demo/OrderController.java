package com.example.demo;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {

	private List<Order> list=null;
	{
		list=new ArrayList<>();

		list.add(new Order(1, "Pen"));
		list.add(new Order(2, "Pencil"));
	}

	@GetMapping("/orders")
	public List<Order> getAllOrder()
	{
		return list;
	}

	@PostMapping("/orders")
	public Order createOrder(@RequestBody Order order)
	{
		list.add(order);
		return order;
	}



}

