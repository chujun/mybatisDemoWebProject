/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-15
* Description: 
*/
package com.chujun.practice.mybatis.domain;
public class Vehicle {
	private long id;
	
	private String vin;
	
	private String year;
	
	private String make;
	
	private String model;
	
	private String color;
	
	private int type;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehicle [id=").append(id).append(", vin=").append(vin)
				.append(", year=").append(year).append(", make=").append(make)
				.append(", model=").append(model).append(", color=")
				.append(color).append(", type=").append(type).append("]");
		return builder.toString();
	}
		
}
