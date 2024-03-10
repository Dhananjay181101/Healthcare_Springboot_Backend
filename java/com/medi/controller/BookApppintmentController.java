package com.medi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medi.model.BookAppointmentEntity;
import com.medi.model.HospitalEntity;
import com.medi.model.UserEntity;
import com.medi.service.BookAppointmentService;
import com.medi.service.HospitalService;
import com.medi.service.UserService;

@RestController
@CrossOrigin("http://localhost:4200")
public class BookApppintmentController {

	@Autowired


	BookAppointmentService service;


	
	@GetMapping("/getAllAppointment")
	public List<BookAppointmentEntity> getAll(){
		List<BookAppointmentEntity> lst=service.getAllAppointment();
		System.out.println("got data ="+lst);
		return lst;
		
	}
	
	
	

	public BookAppointmentService getService() {
		return service;
	}


	public void setService(BookAppointmentService service) {
		this.service = service;
	}

	//private UserEntity service;
	@PostMapping("/bookAppointment")
	public BookAppointmentEntity BookAppointment(@RequestBody BookAppointmentEntity book) {
		System.out.println("controller...registerUser.."+book);
	    return service.bookappintment(book);
	    
	    
	}
	
	@GetMapping("/showbyemail/{pid}")
	public List<BookAppointmentEntity> showBookAppointmentByPid(@PathVariable String pid) {
		System.out.println("showbyemail "+pid);
		List<BookAppointmentEntity> appt= service.getBookappointmentByPid(pid);
		System.out.println("Got==="+appt);
		return appt;
	}

	
	
	
	
	
}
