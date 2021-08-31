package com.restaurant.semillero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurant.semillero.entity.UserEntity;

@Repository
public interface IUserJpaRepository extends JpaRepository<UserEntity, Integer>{

	UserEntity findByLogin(String login);
}
