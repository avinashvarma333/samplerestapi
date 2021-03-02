package com.njc.sample.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.njc.sample.restservice.entity.User;
import com.njc.sample.restservice.repository.UserRepository;

@RestController
@RequestMapping(path = "/users")
public class UserController {

	@Autowired
	private UserRepository repository;

	@GetMapping(path = "/{username}")
	public User find(@PathVariable("username") String username) {
		return repository.findOne(username);
	}

	@PostMapping(consumes = "application/json")
	public User create(@RequestBody User user) {
		return repository.save(user);
	}

}