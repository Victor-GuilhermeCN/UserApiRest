package com.victor.RestApiUser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor.RestApiUser.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
