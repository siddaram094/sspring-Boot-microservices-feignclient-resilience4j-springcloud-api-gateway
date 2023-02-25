package com.practice.spring.book.service.resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.spring.book.service.model.BookOrder;

@RestController
@RequestMapping("/order")
public class OrderResource {

	@PostMapping("/placeOrder")
	public String placeOrder(@RequestBody BookOrder order) {
		
		
		
		return "";
	}
}
