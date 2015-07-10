/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-9
* Description: 
*/
package com.chujun.practice.mybatis.model;

import com.chujun.practice.mybatis.domain.Address;
import com.chujun.practice.mybatis.domain.User;

public class UserInfo extends User{
	/**
	 * 地址
	 */
	private Address address;
	
	/**
	 * 详细地址信息
	 */
	private String detail;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserInfo [address=").append(address)
				.append(", detail=").append(detail).append("]");
		builder.append(super.toString());
		return builder.toString();
	}

	
	
	
}
