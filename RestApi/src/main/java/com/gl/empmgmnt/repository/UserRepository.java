package com.gl.empmgmnt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.empmgmnt.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmail(String email);
}
