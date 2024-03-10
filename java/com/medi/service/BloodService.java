package com.medi.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medi.model.BloodEntity;
import com.medi.model.UserEntity;
import com.medi.repo.bloodrepo;
@Service
public class BloodService {
	@Autowired
	 bloodrepo repo;
	
	// this is for get all deta
	public List<BloodEntity> getAllBlood() {
		return repo.findAll();
	}


	
	
	
}

