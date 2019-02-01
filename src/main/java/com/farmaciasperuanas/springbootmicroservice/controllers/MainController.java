package com.farmaciasperuanas.springbootmicroservice.controllers;


import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;
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
	public ResponseEntity<Double> getAgeAverage() {
		List<User> users = userRespository.findAll();
		int totalAges = 0;
		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			totalAges = totalAges + user.getAge();
		}
		Double average = new Double(totalAges/users.size());

		return ResponseEntity.ok(average);
	}
	
	@GetMapping("/users")
    public ResponseEntity<List<User>> users(){
		List<User> users = userRespository.findAll();
		final int averageLife = 75;
		List<User> newUsers = new ArrayList<>();
		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			user.setDeathDate(DateUtils.addYears(user.getBirthdate(), averageLife));
			newUsers.add(user);
		}
        return ResponseEntity.ok(newUsers);
    }
	
	
	
}