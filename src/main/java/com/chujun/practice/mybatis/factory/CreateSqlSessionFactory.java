/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-1
* Description: 
*/
package com.chujun.practice.mybatis.factory;

import java.io.IOException;
import java.io.InputStream;

import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class CreateSqlSessionFactory {
	public static <T> SqlSessionFactory builder(DataSource dataSource,Class<T> classes){
		//DataSource dataSource = BlogDataSourceFactory.getBlogDataSource();
		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		Environment enviroment=new Environment("development", transactionFactory, dataSource);
		Configuration configuration=new Configuration(enviroment);
		configuration.addMapper(classes);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
		return sqlSessionFactory;
	}
	
	/**
	 * 从xml当中创建SqlSessionFactory
	 * @param resourceClassPath 格式形如：“org/mybatis/example/mybatis-config.xml”
	 * @return
	 * @throws IOException
	 */
	public static SqlSessionFactory builderFromXML(String resourceClassPath) throws IOException{
		//String resource = "org/mybatis/example/mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resourceClassPath);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			return sqlSessionFactory;
		} catch (IOException e) {			
			e.printStackTrace();
			throw e;
		}		
	}
}
