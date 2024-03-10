package com.medi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medi.model.BloodEntity;
@Repository
public interface bloodrepo extends JpaRepository<BloodEntity, Integer> {

	
	
}
