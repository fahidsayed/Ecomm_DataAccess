package com.ecomm.grapes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="userid")
	private int userId;
	
	@Column(name="activeuser")
	private boolean activeUser;
	
	@Column(name = "user_password")
	private String password;
	
	@Column(name = "roles")
	private String role;
	
	@Column(name="user_name")
	private String userName;
}
