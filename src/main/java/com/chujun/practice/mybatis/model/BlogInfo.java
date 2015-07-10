/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-10
* Description: 
*/
package com.chujun.practice.mybatis.model;

import com.chujun.practice.mybatis.domain.Author;
import com.chujun.practice.mybatis.domain.Blog;

public class BlogInfo extends Blog{
	private Author author;

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();		
		builder.append("BlogInfo [").append(super.toString()).append("author=").append(author).append("]");
		return builder.toString();
	}
	
}
