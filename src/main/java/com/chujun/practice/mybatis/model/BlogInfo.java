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
		
	private Author coAuthor;
	
	public BlogInfo(){
		
	}
	public BlogInfo(long id){
		this.setId(id);
	}
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Author getCoAuthor() {
		return coAuthor;
	}
	public void setCoAuthor(Author coAuthor) {
		this.coAuthor = coAuthor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();		
		builder.append("BlogInfo [").append(super.toString()).append("author=").append(author).append("coAuthor=").append(coAuthor).append("]");
		return builder.toString();
	}
	
}
