/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-10
* Description: 
*/
package com.chujun.practice.mybatis.domain;
public class Author {
	private long id;
	
	private String userName;
	
	private String password;
	
	private String email;
	
	private String bio;
	
	private String favouriteSection;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getFavouriteSection() {
		return favouriteSection;
	}

	public void setFavouriteSection(String favouriteSection) {
		this.favouriteSection = favouriteSection;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Author [id=").append(id).append(", userName=")
				.append(userName).append(", password=").append(password)
				.append(", email=").append(email).append(", bio=").append(bio)
				.append(", favouriteSection=").append(favouriteSection)
				.append("]");
		return builder.toString();
	}
		
}
