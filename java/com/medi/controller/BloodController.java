package com.medi.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.medi.model.BloodEntity;

import com.medi.service.BloodService;


@RestController
@CrossOrigin("http://localhost:4200")
public class BloodController {
	@Autowired
	

	BloodService service;
	
	
	
	@GetMapping("/getAllblood")
	public List<BloodEntity> getAll(){
		List<BloodEntity> lst=service.getAllBlood();
		System.out.println("got data ="+lst);
		return lst;
		
	}

	

	
	
	
}
