package com.medi.service;

import java.util.*;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.medi.model.UserEntity;
import com.medi.repo.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repo;
	
	public List<UserEntity> getAllUsers() {
		return repo.findAll();
	}
	
	public Optional<UserEntity> getUser(int uid) {
		return repo.findById(uid);
		
	}
	
	public UserEntity registerUser(UserEntity user) {
	    // Perform any additional validation or logic if needed
	    return repo.save(user);

}


	   public Optional<UserEntity> getByEmailAndPassword(String email,String password){
		   
		   return repo.getByEmailAndPassword(email, password);
	   }

}






