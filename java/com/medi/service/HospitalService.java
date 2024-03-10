package com.medi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medi.model.BloodEntity;
import com.medi.model.HospitalEntity;
import com.medi.repo.HospitalRepository;


@Service
public class HospitalService {

	@Autowired
	 HospitalRepository repo;
	

	// this is for get all deta
	public List<HospitalEntity> getAllhosptal() {
		return repo.findAll();
	}
	
}
