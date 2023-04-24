package com.lancesoft.letsbond.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lancesoft.letsbond.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
