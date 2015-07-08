/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-8
* Description: 
*/
package com.chujun.practice.mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.chujun.practice.mybatis.factory.CreateSqlSessionFactory;
import com.chujun.practice.mybatis.mapper.AddressMapper;
import com.chujun.practice.mybatis.model.Address;

import junit.framework.TestCase;

public class AddressMapperTest extends TestCase {
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
		AddressMapper mapper = session.getMapper(AddressMapper.class);
		List<Address> addresses = mapper.findByCountryId(1);
		System.out.print(addresses);
	}
}
