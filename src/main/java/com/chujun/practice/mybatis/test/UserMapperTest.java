/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-8
* Description: 
*/
package com.chujun.practice.mybatis.test;

import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.chujun.practice.mybatis.factory.CreateSqlSessionFactory;
import com.chujun.practice.mybatis.mapper.UserMapper;
import com.chujun.practice.mybatis.model.User;
import com.chujun.practice.mybatis.util.constant.EmployStatus;

public class UserMapperTest extends TestCase {
	private static SqlSessionFactory sqlSessionFactory;	

	static {
		try {			
			sqlSessionFactory=CreateSqlSessionFactory.builderFromXML("com/chujun/practice/configs/mybatis/mybatis-config-simple.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void testFindAll(){
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> useres = mapper.findAll();
		System.out.print(useres);
		session.close();
	}
	
	public void testInsert(){
		SqlSession session = sqlSessionFactory.openSession();
		User user=new User();
		user.setUserName("chujiaqi");
		user.setUserAge(24);
		user.setUserAddress("anhui,huangshan");
		user.setCreateTime(new Date());
		user.setEmployTime(new Date());
		user.setEmployStatus(EmployStatus.NORMAL);
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.insert(user);
		//System.out.print(useres);
		session.commit();
		session.close();
	}
	
	public void testUpdate(){
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);	
		User user = userMapper.findById(11);
		user.setUserAddress("anhui,huangshan");
		userMapper.update(user);
		session.commit();
		session.close();
	}
}
