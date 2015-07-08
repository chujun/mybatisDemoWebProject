/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-8
* Description: 
*/
package com.chujun.practice.mybatis.test;

import java.util.List;

import junit.framework.TestCase;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.chujun.practice.mybatis.factory.CreateSqlSessionFactory;
import com.chujun.practice.mybatis.mapper.UserMapper;
import com.chujun.practice.mybatis.model.Address;
import com.chujun.practice.mybatis.model.User;

public class UserMapperTest extends TestCase {
	private static SqlSessionFactory sqlSessionFactory;	

	static {
		try {			
			sqlSessionFactory=CreateSqlSessionFactory.builderFromXML("com/chujun/practice/configs/mybatis/mybatis-config-simple.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void testFindByUserId(){
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> useres = mapper.findAll();
		System.out.print(useres);
	}
}