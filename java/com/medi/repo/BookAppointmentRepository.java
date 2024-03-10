package com.medi.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medi.model.BookAppointmentEntity;

public interface BookAppointmentRepository extends JpaRepository<BookAppointmentEntity, String> {

	List<BookAppointmentEntity> findByPid(String pid);
	
	
	
}
