package com.practice.spring.microservices.client.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.spring.microservices.client.model.UserData;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/getData")
public class UserDetailsResource {

	@Autowired
	UserDataConsumer userDataConsumer;
	
	@CircuitBreaker(name="inventory",fallbackMethod = "fallBackMethod")
	@GetMapping("/getAllUserData")
	public List<UserData> getData() {
		
		return userDataConsumer.getUsers();
	}
	
	public List<UserData> fallBackMethod(RuntimeException e)
	{
		return null;
	}
	
	
}
