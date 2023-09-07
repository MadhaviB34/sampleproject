package com.omniwyse.sampleproject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omniwyse.sampleproject.dto.User;
import com.omniwyse.sampleproject.entities.UserEntity;
import com.omniwyse.sampleproject.repository.UserRepository;
import com.omniwyse.sampleproject.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	

	@Override
	public void saveUser(UserEntity userEntity) {

		userRepository.save(userEntity);
		
	}


	@Override
	public UserEntity getUser(User user) {
		
		return userRepository.findByEmail(user.getEmail().trim());

		
		
	}
	
	
	
	
	
	

}
