/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-15
* Description: 
*/
package com.chujun.practice.mybatis.domain;
public class Truck extends Vehicle{
	private int boxSize;
	
	private String extendedCab;

	public int getBoxSize() {
		return boxSize;
	}

	public void setBoxSize(int boxSize) {
		this.boxSize = boxSize;
	}

	public String getExtendedCab() {
		return extendedCab;
	}

	public void setExtendedCab(String extendedCab) {
		this.extendedCab = extendedCab;
	}
	
	
}
