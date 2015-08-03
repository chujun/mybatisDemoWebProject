/*
 * Copyright (C) 2006-2015 Tuniu All rights reserved
 * Author: chujun
 * Date: 2015-7-10
 * Description: 
 */
package com.chujun.practice.mybatis.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.chujun.practice.mybatis.domain.Author;
import com.chujun.practice.mybatis.domain.Post;
import com.chujun.practice.mybatis.factory.CreateSqlSessionFactory;
import com.chujun.practice.mybatis.mapper.BlogInfoMapper;
import com.chujun.practice.mybatis.model.BlogInfo;

public class BlogInfoMapperTest extends TestCase {
	private static SqlSessionFactory sqlSessionFactory;
	
	private static final Logger logger = LogManager.getLogger(BlogInfoMapperTest.class);

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
	
	public void testFindAllLeftJoinPost() {
		SqlSession session = sqlSessionFactory.openSession();
		BlogInfoMapper mapper = session.getMapper(BlogInfoMapper.class);
		List<BlogInfo> blogs = mapper.findAllLeftJoinPost();
		System.out.print(blogs);
	}
	
	public void testFindActivePostWithSubjectLike(){
		SqlSession session = sqlSessionFactory.openSession();
		BlogInfoMapper mapper = session.getMapper(BlogInfoMapper.class);
		List<Post> posts = mapper.findActivePostWithSubjectLike("%历史%");
		System.out.print(posts);
	}
	
	/**
	 * 可选地通过“subject”和“author name”两个条件搜索
	 */
	public void testFindActiveBlogLike(){
		SqlSession session = sqlSessionFactory.openSession();
		BlogInfoMapper mapper = session.getMapper(BlogInfoMapper.class);
		Map<String,Object> params=new HashMap<String,Object>();
		params.put("subject", "%历史%");
		Author author=new Author();
		author.setUserName("%储%");
		params.put("author",author);
		List<Post> posts = mapper.findActiveBlogLike(params);
		System.out.print(posts);
	}
	
	public void testFindActiveBlogLikev2(){
		SqlSession session = sqlSessionFactory.openSession();
		BlogInfoMapper mapper = session.getMapper(BlogInfoMapper.class);
		Map<String,Object> params=new HashMap<String,Object>();
		//params.put("subject", "%1%");
		Author author=new Author();
		author.setUserName("%汪彬%");
		params.put("author",author);
		List<Post> posts = mapper.findActiveBlogLikev2(params);
		System.out.print(posts);
	}
	
	public void testFindActiveBlogLikev3(){
		SqlSession session = sqlSessionFactory.openSession();
		BlogInfoMapper mapper = session.getMapper(BlogInfoMapper.class);
		Map<String,Object> params=new HashMap<String,Object>();
		//params.put("subject", "%1%");		
		Author author=new Author();
		author.setUserName("%汪彬%");
		params.put("author",author);
		logger.trace(params);
		List<Post> posts = mapper.findActiveBlogLikev3(params);
		System.out.print(posts);
	}
	
	public void testFindActiveBlogLikev4(){
		SqlSession session = sqlSessionFactory.openSession();
		BlogInfoMapper mapper = session.getMapper(BlogInfoMapper.class);
		Map<String,Object> params=new HashMap<String,Object>();
		params.put("state", 0);
		//params.put("subject", "%园林%");		
		Author author=new Author();
		author.setUserName("%汪彬%");
		params.put("author",author);
		logger.trace(params);
		List<Post> posts = mapper.findActiveBlogLikev4(params);
		System.out.print(posts);
	}
}
