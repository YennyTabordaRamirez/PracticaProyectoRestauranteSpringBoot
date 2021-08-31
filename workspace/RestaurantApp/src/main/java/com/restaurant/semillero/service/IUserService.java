package com.restaurant.semillero.service;

import java.util.List;

//import org.springframework.security.core.userdetails.UserDetailsService;

import com.restaurant.semillero.dto.UserDTO;

public interface IUserService  {
//extends UserDetailsService{
	
	
	UserDTO createUser(UserDTO userDTO);
	
	List<UserDTO> consultUser();
	
	UserDTO consultUserById(int id);
	
	UserDTO updateUser(UserDTO userDTO);

	boolean deleteUserById(int id);	
}
