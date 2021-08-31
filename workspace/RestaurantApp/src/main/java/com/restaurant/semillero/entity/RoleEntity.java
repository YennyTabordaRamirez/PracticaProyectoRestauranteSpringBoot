package com.restaurant.semillero.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.restaurant.semillero.enums.RoleEnums;

@Entity
@Table(name = "TBL_ROL")
public class RoleEntity {

	@Id
	@Column(name = "ROLE_ID", nullable = false)
	private int id;

	@Column(name = "ROLE_NAME", nullable = false)
	@Enumerated(EnumType.STRING)
	private RoleEnums rolName;

	@ManyToMany(mappedBy = "rolesEntity")
	private Set<UserEntity> usersEntity;

	public RoleEntity() {

	}

	public RoleEntity(int id, RoleEnums rolName) {
		super();
		this.id = id;
		this.rolName = rolName;
	}

	public Set<UserEntity> getUsersEntity() {
		return usersEntity;
	}

	public void setUsersEntity(Set<UserEntity> usersEntity) {
		this.usersEntity = usersEntity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RoleEnums getRolName() {
		return rolName;
	}

	public void setRolName(RoleEnums rolName) {
		this.rolName = rolName;
	}

}
