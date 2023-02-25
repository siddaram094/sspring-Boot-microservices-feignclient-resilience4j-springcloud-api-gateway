package com.practice.spring.microservices.db.resource;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.practice.spring.microservices.db.model.UserData;
import com.practice.spring.microservices.db.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserResource {

	UserRepository userRepo;
	
	
	public UserResource(UserRepository userRepo) {
		this.userRepo = userRepo;
	}


	@PostMapping("/adduser")
	public String addUser(@RequestBody UserData user) {
		userRepo.save(user);
		return user.getName()+" saved successfully";
	}
	
	@GetMapping("/getAllData")
	public List<UserData> getAllData(){
		return userRepo.findAll();
	}
}
