package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserEntity;
import com.example.demo.model.User;




@Repository(value="userRepository")
public class UserRepositoryImpl implements UserRepository {
	@Autowired
	private EntityManager entityManager;

	
	@Override
	public List<User> getUserDetails(Integer u_id) throws Exception {
		List<UserEntity> userList=entityManager.createQuery("select u from USER_ENTITY u",UserEntity.class).getResultList();		
		// TODO Auto-generated method stub
		if(userList!=null) {
			
			List<User> uList= new ArrayList<User>();
		
		for(UserEntity userEntity:userList)
		{
			if(userEntity.getU_id()==u_id) {
				User user=new User();
				user.setU_id(userEntity.getU_id());
				user.setU_email(userEntity.getU_email());
				user.setU_mobile(userEntity.getU_mobile());
				user.setU_name(userEntity.getU_name());
				user.setU_real_id(userEntity.getU_id());
				uList.add(user);
			}
		}
		return uList;
		}
		return null;
	}
	
	@Override
	public List<User> getDetails(Integer u_id) throws Exception {
		List<UserEntity> userList=entityManager.createQuery("select u from user_entity",UserEntity.class).getResultList();		
		// TODO Auto-generated method stub
		if(userList!=null) {
			
			List<User> uList= new ArrayList<User>();
		
		for(UserEntity userEntity:userList)
		{
				User user=new User();
				user.setU_id(userEntity.getU_id());
				user.setU_email(userEntity.getU_email());
				user.setU_mobile(userEntity.getU_mobile());
				user.setU_name(userEntity.getU_name());
				user.setU_real_id(userEntity.getU_id());
				uList.add(user);
		}
		return uList;
		}
		return null;
	
		
	}

}
