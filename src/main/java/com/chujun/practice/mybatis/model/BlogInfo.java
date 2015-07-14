/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-10
* Description: 
*/
package com.chujun.practice.mybatis.model;

import java.util.List;

import com.chujun.practice.mybatis.domain.Author;
import com.chujun.practice.mybatis.domain.Blog;
import com.chujun.practice.mybatis.domain.Post;

public class BlogInfo extends Blog{
	private Author author;
		
	private Author coAuthor;
	
	private List<Post> posts;
	
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
	
	
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();		
		builder.append("BlogInfo [").append(super.toString());
		builder.append("author=").append(author);
		builder.append("coAuthor=").append(coAuthor);
		builder.append("posts=").append(posts);
		builder.append("]");
		return builder.toString();
	}
	
}
