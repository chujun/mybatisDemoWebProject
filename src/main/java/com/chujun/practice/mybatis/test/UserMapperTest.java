/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-8
* Description: 
*/
package com.chujun.practice.mybatis.test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.chujun.practice.mybatis.domain.User;
import com.chujun.practice.mybatis.factory.CreateSqlSessionFactory;
import com.chujun.practice.mybatis.mapper.UserMapper;
import com.chujun.practice.mybatis.model.UserInfo;
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
		user.setSalary(new BigDecimal(12345.353));
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
		user.setCreateTime(new Date());
		user.setEmployTime(new Date());
		user.setSalary(new BigDecimal(12345.35343534534));
		user.setUserAge(22);
		userMapper.update(user);
		session.commit();
		session.close();
	}
	
	public void testUpdateForDemoTrim(){
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);	
		User user = userMapper.findById(11);
		user.setUserAddress("anhui,huangshan");
		user.setCreateTime(new Date());
		user.setEmployTime(new Date());
		//user.setSalary(new BigDecimal(12345.35343534534));
		user.setUserAge(20);
		userMapper.updateForDemoTrim(user);
		session.commit();
		session.close();
	}
	
	public void testBatchUpdate(){
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);	
	    List<User> users = userMapper.findAll();		
		userMapper.batchUpdate(users);
		session.commit();
		session.close();
	}
	
	public void testDeleteById(){
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);	
	    userMapper.deleteById(21);		
		session.commit();
		session.close();
	}
	
	public void testFindUserInfoAll(){
		/*SqlSession session = sqlSessionFactory.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);	
	    List<UserInfo> userInfos = userMapper.findUserInfoAll();
	    System.out.println(userInfos);
		session.commit();
		session.close();*/
	}
}
