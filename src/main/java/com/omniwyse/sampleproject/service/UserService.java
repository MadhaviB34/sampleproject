package com.omniwyse.sampleproject.service;

import com.omniwyse.sampleproject.dto.User;
import com.omniwyse.sampleproject.entities.UserEntity;

public interface UserService {
	
	
	public void saveUser(UserEntity userEntity);
	
	public UserEntity getUser(User user);
	

}
