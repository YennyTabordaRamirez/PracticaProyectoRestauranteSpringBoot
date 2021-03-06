package com.restaurant.semillero.service;

//import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.restaurant.semillero.dto.UserDTO;
import com.restaurant.semillero.entity.UserEntity;
import com.restaurant.semillero.repository.IUserJpaRepository;

@Service
public class UserServiceImplement implements IUserService {

	private IUserJpaRepository uJpaRepository;

	@Autowired
	public UserServiceImplement(IUserJpaRepository uJpaRepository) {
		this.uJpaRepository = uJpaRepository;
	}

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		UserEntity userEntity = uJpaRepository.findByLogin(username);
//		
//		if (null == userEntity)
//			throw new UsernameNotFoundException(username);
//
//		if (null != userEntity && userEntity.getId() > 0) {
//			return new User(userEntity.getLogin(), userEntity.getPassword(), new ArrayList<>());
//		}
//		return null;
//	}

	@Override
	public UserDTO createUser(UserDTO userDTO) {

		userDTO.setId(Integer.parseInt(UUID.randomUUID().toString()));

		UserEntity userEntity = new UserEntity();

		userEntity.setDocument(userDTO.getDocument());
		userEntity.setFullName(userDTO.getFullName());
		userEntity.setEmail(userDTO.getEmail());
		userEntity.setTelephone(userDTO.getTelephone());
		userEntity.setLogin(userDTO.getLogin());
		userEntity.setPassword(userDTO.getPassword());
		userEntity.setRolesEntity(userEntity.getRolesEntity());

		userEntity = uJpaRepository.save(userEntity);

		if (null != userEntity && userEntity.getId() > 0) {
			ModelMapper modelMapper = new ModelMapper();

			UserDTO userMap = modelMapper.map(userEntity, UserDTO.class);

			return userMap;
		}
		return null;
	}

	@Override
	public List<UserDTO> consultUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO consultUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO updateUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUserById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
