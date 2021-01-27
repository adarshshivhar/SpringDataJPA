package com.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdatajpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
