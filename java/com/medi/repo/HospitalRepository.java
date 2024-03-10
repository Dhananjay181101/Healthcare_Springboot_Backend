package com.medi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medi.model.HospitalEntity;

public interface HospitalRepository extends JpaRepository<HospitalEntity, Integer> {

}
