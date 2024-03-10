package com.medi.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
 
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.medi.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	
//	  @Query(value="SELECT u from User u Where u.userName=:username")
//	  Optional<UserEntity> getbyusername(String username);
//	  
//	  @Query(value="SELECT u from User u WHERE u.userType=:usertype")
//	  List<UserEntity> getbyusertype(String usertype);
	 
	@Query(value = "SELECT u FROM UserEntity u WHERE u.userEmail = :userEmail AND u.userPassword = :userPassword")
	//@Query(value="Select u from UserEntity u where u.userEmail =:user_email and u.userPassword=:user_password")
	//Optional<UserEntity> getByEmailAndPassword(String userEmail, String userPassword);
	Optional<UserEntity> getByEmailAndPassword(@Param("userEmail") String userEmail, @Param("userPassword") String userPassword);
	

}