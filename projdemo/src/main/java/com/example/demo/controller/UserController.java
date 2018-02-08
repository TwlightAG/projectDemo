package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
    UserRepository userRepository;
	
	 @RequestMapping(value = "/{Page_Id}") 
	    public User read(@PathVariable String Page_Id) {
	        return userRepository.findOne( Page_Id);
	    }
}
