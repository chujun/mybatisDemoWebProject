/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-1
* Description: 
*/
package com.chujun.practice.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.chujun.practice.mybatis.model.User;

public interface UserMapper extends GenericMapper<User>{
		
	public User selectUserByID(int id);
	
	@Select("select * from user where user_name like #{name}")
	public List<User> selectUsersByName(String name);
	
	/*public List<User> findAll();
	
	public int insert(User oneUser);
	
	public int update(User user);*/
}
