package com.restaurant.semillero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.semillero.dto.UserDTO;
//import com.restaurant.semillero.repository.IUserJpaRepository;
import com.restaurant.semillero.service.UserServiceImplement;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/restaurant_users")
public class UserController {
	
	@Autowired
	//private IUserJpaRepository uJpaRepository;
	private UserServiceImplement uServiceImplement;

	public UserController(UserServiceImplement uServiceImplement) {
		super();
		//this.uJpaRepository = uJpaRepository;
		this.uServiceImplement = uServiceImplement;
	}


	@ApiOperation(value="Method that returns users data through method HTTP.GET. This is how all users come.",
			response = Integer.class)	
	@GetMapping("Full Users")	
	public List<UserDTO> getAllUsers( ){
		return uServiceImplement.consultUser();
	}	
	
	@ApiOperation(value="Method that returns users data through method HTTP.GET using a specific parameter for a single user.",
			response = Integer.class, tags="id_person simple way. 'http://localhost:8080/Person/find/1'")
	@GetMapping("find/{idUser}")
	public UserDTO getAllUsers2(@PathVariable("idUser") int id){
		return uServiceImplement.consultUserById(id);
	}
		

	@ApiOperation(value="Method that returns users data through method HTTP.POST.",
			response = Integer.class)
	@PostMapping
	public @ResponseBody UserDTO createPerson(@RequestBody() UserDTO userDTO) {
		return uServiceImplement.createUser(userDTO);
	}
	
	
	@ApiOperation(value="Method that returns users data through method HTTP.PUT.",
			response = Integer.class)
	@PutMapping
	public @ResponseBody UserDTO updatePerson(UserDTO userDTO){
		return uServiceImplement.updateUser(userDTO);
	}
	
	
	@ApiOperation(value="Method that returns users data through method HTTP.DELETE.",
			response = Integer.class)
	@DeleteMapping
	public boolean deletePerson(int id){
		return uServiceImplement.deleteUserById(id);
	}

		
	
}
