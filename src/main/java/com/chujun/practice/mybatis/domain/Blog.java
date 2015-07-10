/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-10
* Description: 
*/
package com.chujun.practice.mybatis.domain;
public class Blog {
	private long id;
	
	private String title;
	
	private long authorId;
	
	/**
	 * 合作作者
	 */
	private long coAuthorId;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}

	public long getCoAuthorId() {
		return coAuthorId;
	}

	public void setCoAuthorId(long coAuthorId) {
		this.coAuthorId = coAuthorId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Blog [id=").append(id).append(", title=").append(title)
				.append(", authorId=").append(authorId).append(", coAuthorId=")
				.append(coAuthorId).append("]");
		return builder.toString();
	}	
}
