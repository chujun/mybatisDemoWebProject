package com.chujun.practice.mybatis.test;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.chujun.practice.mybatis.domain.User;
import com.chujun.practice.mybatis.factory.CreateSqlSessionFactory;
import com.chujun.practice.mybatis.mapper.UserMapper;

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
			//SqlSession session = sqlSessionFactory.openSession();
			user=new User();
			user.setUserName("chujiaqi");
			user.setUserAge(24);
			user.setUserAddress("anhui,huangshan");
			user.setCreateTime(new Date());
			user.setEmployTime(new Date());
			UserMapper mapper = session.getMapper(UserMapper.class);
			int inserted=mapper.insert(user);
			System.out.print(inserted);
			session.commit();
			session.close();
		} finally {
			session.close();
		}
	}
	
}