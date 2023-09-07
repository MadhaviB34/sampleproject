package com.omniwyse.sampleproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.omniwyse.sampleproject.dto.User;
import com.omniwyse.sampleproject.entities.UserEntity;
import com.omniwyse.sampleproject.service.UserService;


@Controller
@RequestMapping("/operations")
public class OperationsController {
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("/signup")
	public String getSignUpForm(ModelMap model){
		
		return "signup";
	}
	
	@PostMapping("/signup")
	public String createUser(ModelMap model,UserEntity userEntity){
		
		userService.saveUser(userEntity);
		
		
		return "signupSuccess";
	}
	
	@GetMapping("/login")
	public String getLoginForm(ModelMap model){
		
		return "login";
	}
	
	@PostMapping("/login")
	public String Login(ModelMap model,User user){
		
		UserEntity userEntity = userService.getUser(user);
		
		if(userEntity != null && userEntity.getPassword().equalsIgnoreCase(user.getPassword().trim())) {
			return "loginSuccess";
		}else {
			return "loginFail";
		}
		
		
	}

}
