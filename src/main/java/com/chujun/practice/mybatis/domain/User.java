/*
 * Copyright (C) 2006-2015 Tuniu All rights reserved
 * Author: chujun
 * Date: 2015-7-1
 * Description: 
 */
package com.chujun.practice.mybatis.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.chujun.practice.mybatis.util.constant.EmployStatus;

public class User {
	private int id;
	private String userName;
	private int userAge;
	private String userAddress;
	private Date createTime;
	private Date employTime;
	private EmployStatus employStatus;
	private BigDecimal salary;

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

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
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

	public EmployStatus getEmployStatus() {
		return employStatus;
	}

	public void setEmployStatus(EmployStatus employStatus) {
		this.employStatus = employStatus;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=").append(id).append(", userName=")
				.append(userName).append(", userAge=").append(userAge)
				.append(", userAddress=").append(userAddress)
				.append(", createTime=").append(createTime)
				.append(", employTime=").append(employTime)
				.append(", employStatus=").append(employStatus)
				.append(", salary=").append(salary).append("]");
		return builder.toString();
	}

}
