/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-9
* Description: 
*/
package com.chujun.practice.mybatis.mapper;

import java.util.List;

/**
 * @author chujun
 * 通用查询接口
 * @param <T>
 */
public interface GenericMapper<T> {
	T findById(int id);
	
	List<T> findAll();
	
	int update(T t);
	
	int insert(T t);
	
	int deleteById(int id);
}
