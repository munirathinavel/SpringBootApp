package com.spring.userresource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.userresource.service.IUserService;
import com.spring.userresource.vo.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;

	@PostMapping(consumes = "application/json", produces = "application/json")
	@ResponseBody
	public User createUser(@RequestBody User user) {

		userService.createUser(user);
		return user;

	}

	@PutMapping(consumes = "application/json", produces = "application/json")
	@ResponseBody
	public User updateUser(@RequestBody User user) {

		User userOut = userService.updateUser(user);
		return userOut;

	}

	@DeleteMapping(consumes = "application/json", produces = "application/json")
	@ResponseBody
	public User deleteUser(@RequestBody User user) {
		User userOut = userService.deleteUser(user);
		return userOut;

	}

	@GetMapping
	@ResponseBody
	public String testMeothd() {
		return "Hello There!";
	}
}
