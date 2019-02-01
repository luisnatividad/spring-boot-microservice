package com.farmaciasperuanas.springbootmicroservice.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmaciasperuanas.springbootmicroservice.models.User;
import com.farmaciasperuanas.springbootmicroservice.repositories.UserRepository;

@RestController
public class MainController {
	
	@Autowired
    UserRepository userRespository;
	
	@PostMapping("/user")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		userRespository.save(user);
		return ResponseEntity.ok(user);
	}
	
	@GetMapping("/user")
	float getAgeAverage() {
		
		return 0;
	}
	
	@GetMapping("/users")
    public List<User> users(){
        return userRespository.findAll();
    }
	
	
	
}