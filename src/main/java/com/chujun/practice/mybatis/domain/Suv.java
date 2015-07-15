/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-15
* Description: 
*/
package com.chujun.practice.mybatis.domain;
public class Suv extends Vehicle{
	private boolean allWheelDrive;

	public boolean isAllWheelDrive() {
		return allWheelDrive;
	}

	public void setAllWheelDrive(boolean allWheelDrive) {
		this.allWheelDrive = allWheelDrive;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Suv [allWheelDrive=").append(allWheelDrive);
		builder.append(",").append(super.toString()).append("]");
		return builder.toString();
	}	
}
