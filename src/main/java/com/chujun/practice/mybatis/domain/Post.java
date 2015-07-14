/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-14
* Description: 
*/
package com.chujun.practice.mybatis.domain;

import java.util.Date;

public class Post {
	private long id;
	
	private long blogId;
	
	private long authorId;
	
	private Date createTime;
	
	private String section;
	
	private String subject;
	
	private String draft;
	
	private String body;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getBlogId() {
		return blogId;
	}

	public void setBlogId(long blogId) {
		this.blogId = blogId;
	}

	public long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDraft() {
		return draft;
	}

	public void setDraft(String draft) {
		this.draft = draft;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Post [id=").append(id).append(", blogId=")
				.append(blogId).append(", authorId=").append(authorId)
				.append(", createTime=").append(createTime)
				.append(", section=").append(section).append(", subject=")
				.append(subject).append(", draft=").append(draft)
				.append(", body=").append(body).append("]");
		return builder.toString();
	}			
}
