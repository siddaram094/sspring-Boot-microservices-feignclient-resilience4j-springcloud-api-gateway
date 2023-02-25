package com.practice.spring.microservices.client.resource;

import java.util.List;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.practice.spring.microservices.client.model.UserData;

@FeignClient(name="db-service")
public interface UserDataConsumer {

	@GetMapping("/user/getAllData")
	public List<UserData> getUsers();
}
