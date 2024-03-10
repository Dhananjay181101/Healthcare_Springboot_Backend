package com.medi.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medi.model.UserEntity;
import com.medi.service.UserService;
@RequestMapping("/api")
 @RestController
@CrossOrigin("http://localhost:4200")
public class UserController {
	@Autowired
	
	UserService service;
	
	
	
	@GetMapping("/getAll")
	public List<UserEntity> getAll(){
		List<UserEntity> lst=service.getAllUsers();
		System.out.println("got data ="+lst);
		return lst;
		
	}
	
	
	
	
	 
	
	@GetMapping("/getbyemailandpassword/{email}/{pass}")
	public Optional<UserEntity> getByEmailAndPassword(@PathVariable String email,@PathVariable String pass){
		System.out.println("controller----getByEmailAndPassword----"+email+" "+pass);
		   return service.getByEmailAndPassword(email, pass);
	   }
	
	
	public UserService getService() {
		return service;
	}


	public void setService(UserService service) {
		this.service = service;
	}

	//private UserEntity service;
	@PostMapping("/register")
	public UserEntity registerUser(@RequestBody UserEntity user) {
		System.out.println("controller...registerUser.."+user);
	    return service.registerUser(user);
	    
	    
	}
	
	
	
	
	
	
	
	
//
//	@GetMapping("/getUserById/{uid}")
//	public Optional<UserEntity>getUserById(@PathVariable int uid) {
//		return service.getUser(uid);
//		
//	}

}
