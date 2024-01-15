package com.smh.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smh.springsecurity.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
