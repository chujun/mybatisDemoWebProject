/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-8
* Description: 
*/
package com.chujun.practice.mybatis.platform.mybatis.typeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

/**
 * @author chujun
 * 自定义了一个将Date存为毫秒时间的VARCHAR类型的TypeHandler
 * 将Date类型转换为毫秒时间字符串存储到数据库当中，读取时将毫秒时间字符串转化回Date类型，
 * 好处：自己不用在应用程序中来回转换数据格式，同时提供了一个公共TypeHandler处理特殊的日期类型需求
 */
public class CustomTimeStampHandler extends BaseTypeHandler<Date>{

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i,
			Date parameter, JdbcType jdbcType) throws SQLException {		
		//ps.setString(i, String.valueOf(parameter.getTime()));
		ps.setLong(i, parameter.getTime());
	}

	@Override
	public Date getNullableResult(ResultSet rs, String columnName)
			throws SQLException {		
		long sqlTimestamp = rs.getLong(columnName);
		if(sqlTimestamp!=0){
			return new Date(sqlTimestamp);
		}
		return null;
	}

	@Override
	public Date getNullableResult(ResultSet rs, int columnIndex)
			throws SQLException {
		long sqlTimestamp = rs.getLong(columnIndex);
		if(sqlTimestamp!=0){
			return new Date(sqlTimestamp);
		}
		return null;
	}

	@Override
	public Date getNullableResult(CallableStatement cs, int columnIndex)
			throws SQLException {
		long sqlTimestamp = cs.getLong(columnIndex);
		if(sqlTimestamp!=0){
			return new Date(sqlTimestamp);
		}
		return null;
	}

}
