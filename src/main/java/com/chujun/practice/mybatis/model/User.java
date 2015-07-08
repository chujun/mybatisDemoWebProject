/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-1
* Description: 
*/
package com.chujun.practice.mybatis.model;

import java.util.Date;

public class User {
	private int id;
    private String userName;
    private String userAge;
    private String userAddress;
    private Date createTime;
    private Date employTime;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserAge() {
        return userAge;
    }
    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }
    public String getUserAddress() {
        return userAddress;
    }
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Date getEmployTime() {
		return employTime;
	}
	public void setEmployTime(Date employTime) {
		this.employTime = employTime;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userAge="
				+ userAge + ", userAddress=" + userAddress + ", createTime="
				+ createTime + ", employTime=" + employTime + "]";
	}
		
}
