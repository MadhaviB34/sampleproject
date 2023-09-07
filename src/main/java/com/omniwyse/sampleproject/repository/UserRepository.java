package com.omniwyse.sampleproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.omniwyse.sampleproject.entities.UserEntity;

@Repository
public interface UserRepository  extends JpaRepository<UserEntity,Integer> {
	
	@Query(value="select * from users where email = :email",nativeQuery = true)
	public UserEntity findByEmail(@Param("email") String email);

}
