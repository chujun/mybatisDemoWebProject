package com.chujun.practice.mybatis.test;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.chujun.practice.mybatis.factory.CreateSqlSessionFactory;
import com.chujun.practice.mybatis.mapper.UserMapper;
import com.chujun.practice.mybatis.model.User;

public class Test {
	private static SqlSessionFactory sqlSessionFactory;	

	static {
		try {			
			sqlSessionFactory=CreateSqlSessionFactory.builderFromXML("com/chujun/practice/configs/mybatis/mybatis-config-simple.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSession() {
		return sqlSessionFactory;
	}

	public static void main(String[] args) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			//old方式
			User user=null;
			user = (User) session.selectOne("com.chujun.practice.mybatis.mapper.UserMapper.selectUserByID", 1);
			System.out.println(user);	
			//new方式
			UserMapper userMapper = session.getMapper(UserMapper.class);
			user = userMapper.selectUserByID(1);
			System.out.println(user);	
			//测试selectUsersByName方法
			List<User> users = userMapper.selectUsersByName("%chu%");
			System.out.println(users);
			
		} finally {
			session.close();
		}
	}
	
}