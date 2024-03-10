package com.medi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medi.model.BookAppointmentEntity;
import com.medi.model.HospitalEntity;
import com.medi.model.UserEntity;
import com.medi.repo.BookAppointmentRepository;
import com.medi.repo.HospitalRepository;

@Service
public class BookAppointmentService {
	@Autowired
	 BookAppointmentRepository repo;
	
	public List<BookAppointmentEntity> getAllAppointment() {
		return repo.findAll();
	}

	public BookAppointmentEntity bookappintment(BookAppointmentEntity book) {
	    // Perform any additional validation or logic if needed
	    return repo.save(book);

}
	public List<BookAppointmentEntity> getBookappointmentByPid(String pid) {
		return repo.findByPid(pid);
	}
//
//
//	   public Optional<UserEntity> getByEmailAndPassword(String email,String password){
//		   
//		   return repo.getByEmailAndPassword(email, password);
//	   }

}

