/*
 * Copyright (C) 2006-2015 Tuniu All rights reserved
 * Author: chujun
 * Date: 2015-7-10
 * Description: 
 */
package com.chujun.practice.mybatis.test;

import java.io.Console;
import java.util.List;
import java.util.Scanner;

import junit.framework.TestCase;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.chujun.practice.mybatis.domain.Vehicle;
import com.chujun.practice.mybatis.factory.CreateSqlSessionFactory;
import com.chujun.practice.mybatis.mapper.BlogInfoMapper;
import com.chujun.practice.mybatis.mapper.VehicleMapper;
import com.chujun.practice.mybatis.model.BlogInfo;

public class VehicleMapperTest extends TestCase {
	private static SqlSessionFactory sqlSessionFactory;

	static {
		try {
			sqlSessionFactory = CreateSqlSessionFactory
					.builderFromXML("com/chujun/practice/configs/mybatis/mybatis-config-simple.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void testFindById() {
		SqlSession session = sqlSessionFactory.openSession();
		VehicleMapper mapper = session.getMapper(VehicleMapper.class);
		Vehicle vehicle = mapper.findById(1);
		System.out.print(vehicle);
	}
	
	public void testFindAll() {
		SqlSession session = sqlSessionFactory.openSession();
		VehicleMapper mapper = session.getMapper(VehicleMapper.class);
		List<Vehicle> vehicles = mapper.findAll();
		System.out.println(vehicles);
	}
	
	public void testCache(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String next = sc.next();
			if("Y".equals(next.toUpperCase().trim())){
				this.testFindAll();				
			}
			if("EXIT".equals(next.toUpperCase().trim())){
				break;				
			}
		}		
	}
}
