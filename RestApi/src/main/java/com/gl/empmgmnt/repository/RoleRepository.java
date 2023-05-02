package com.gl.empmgmnt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.empmgmnt.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByName(String name);
}
