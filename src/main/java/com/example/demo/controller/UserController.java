package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserEntity;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepositoryImpl;



@RestController
public class UserController{

	@Autowired
	private UserRepositoryImpl userRepositoryImpl;

	  @RequestMapping(value="/userId/{id}",method= RequestMethod.GET) 
	  @ResponseBody
	  public List<User> getuserDetails(@PathVariable Integer id) {
		  List<User>  userList= new ArrayList<User>();
				  
		  try {
			userList= userRepositoryImpl.getUserDetails(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	  return userList;
	  
	 }
	  
	  @RequestMapping(value="/userId",method= RequestMethod.POST) 
	  @ResponseBody
	  public String adduserDetails(@RequestBody UserEntity user) {
		  List<UserEntity>  userList= new ArrayList<UserEntity>();
				  
		  
	  return "hello";
	  
	 }
	 
}
