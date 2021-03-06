/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-15
* Description: 
*/
package com.chujun.practice.mybatis.domain;
public class Car extends Vehicle{
	private int doorCount;

	public int getDoorCount() {
		return doorCount;
	}

	public void setDoorCount(int doorCount) {
		this.doorCount = doorCount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [doorCount=").append(doorCount).append(",");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}	
	
}
