package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.UserEntity;
import com.example.demo.model.User;


public interface UserRepository 
{
	@Query(value="select * from user_entity")
 public List<User> getUserDetails(Integer u_id) throws Exception;
 
 public List<User> getDetails(Integer u_id) throws Exception;
}
