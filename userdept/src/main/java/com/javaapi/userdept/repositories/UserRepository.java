package com.javaapi.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaapi.userdept.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {
    
}
