package com.Springboot.taskproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.Springboot.taskproject.ServiceImpl.UserServiceImpl;
import com.Springboot.taskproject.service.UserService;


@Controller
public class UserController {
	@Autowired
	public UserServiceImpl userServiceImpl;
	@GetMapping("/register")
	public String showregister() {
		return "userregister";
	}
}
