package com.lancesoft.letsbond.entity;


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
@Table(name="user_registration")
public class User {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String lastName;
	private String firstName;
	private String phoneNumber;
	private String gender;
}
