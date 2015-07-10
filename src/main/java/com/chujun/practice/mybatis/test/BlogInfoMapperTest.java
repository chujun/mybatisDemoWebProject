/*
 * Copyright (C) 2006-2015 Tuniu All rights reserved
 * Author: chujun
 * Date: 2015-7-10
 * Description: 
 */
package com.chujun.practice.mybatis.test;

import java.util.List;

import junit.framework.TestCase;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.chujun.practice.mybatis.factory.CreateSqlSessionFactory;
import com.chujun.practice.mybatis.mapper.BlogInfoMapper;
import com.chujun.practice.mybatis.model.BlogInfo;

public class BlogInfoMapperTest extends TestCase {
	private static SqlSessionFactory sqlSessionFactory;

	static {
		try {
			sqlSessionFactory = CreateSqlSessionFactory
					.builderFromXML("com/chujun/practice/configs/mybatis/mybatis-config-simple.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void testFindAll() {
		SqlSession session = sqlSessionFactory.openSession();
		BlogInfoMapper mapper = session.getMapper(BlogInfoMapper.class);
		List<BlogInfo> blogs = mapper.findAll();
		System.out.print(blogs);
	}
	
	public void testFindByBlogId() {
		SqlSession session = sqlSessionFactory.openSession();
		BlogInfoMapper mapper = session.getMapper(BlogInfoMapper.class);
		BlogInfo blogInfo = mapper.findById(1);
		System.out.print(blogInfo);
	}
}
