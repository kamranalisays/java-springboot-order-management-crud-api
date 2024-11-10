package org.expandablesupportservices.ecommerceshop.controllers;

import java.util.List;
import java.util.Optional;

import org.expandablesupportservices.ecommerceshop.models.User;
import org.expandablesupportservices.ecommerceshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	@GetMapping("/all")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}

	
	@GetMapping("/{userId}")
	public Optional<User> getUserById(@PathVariable Long userId)
	{
		return userService.getUserById(userId);
	}
	
}
