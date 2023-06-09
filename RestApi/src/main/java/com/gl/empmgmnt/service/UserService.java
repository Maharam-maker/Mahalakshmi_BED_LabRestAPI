package com.gl.empmgmnt.service;

import com.gl.empmgmnt.model.User;
import com.gl.empmgmt.dto.UserDto;

import java.util.List;

public interface UserService {
	
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
