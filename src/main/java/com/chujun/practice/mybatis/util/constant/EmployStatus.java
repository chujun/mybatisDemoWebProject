/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-9
* Description: 
*/
package com.chujun.practice.mybatis.util.constant;
public enum EmployStatus {
	NORMAL(0,"正常"),
	READY(1,"试用"),
	LEFT(2,"离职");
	
	private int code;
	
	private String description;	
	private EmployStatus(int code,String description){
		this.code=code;
		this.description=description;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
