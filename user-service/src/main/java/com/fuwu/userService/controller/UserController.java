package com.fuwu.userService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fuwu.dto.UserDTO;

@RestController
public class UserController {
	
	
	@Value("${user.name}")
	String userName;//测试config server
	
	@Autowired
	Environment env;
	
	
	@GetMapping("/users")
	public UserDTO getUser() { 
		int port=Integer.valueOf(env.getProperty("local.server.port"));
		return new UserDTO(1000l,userName,port);
	}

}
