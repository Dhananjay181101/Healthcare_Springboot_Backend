package com.medi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medi.model.BloodEntity;
import com.medi.model.HospitalEntity;
import com.medi.service.HospitalService;

@RestController
@CrossOrigin("http://localhost:4200")
public class HospitalController {

	@Autowired
	HospitalService service;
	

	
	
	@GetMapping("/getAllhosptal")
	public List<HospitalEntity> getAll(){
		List<HospitalEntity> lst=service.getAllhosptal();
		System.out.println("got data ="+lst);
		return lst;
		
	}
	
}
