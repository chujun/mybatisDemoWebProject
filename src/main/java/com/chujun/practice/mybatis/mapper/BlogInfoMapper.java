/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-10
* Description: 
*/
package com.chujun.practice.mybatis.mapper;
import java.util.List;
import java.util.Map;

import com.chujun.practice.mybatis.domain.Post;
import com.chujun.practice.mybatis.model.BlogInfo;
public interface BlogInfoMapper extends GenericMapper<BlogInfo>{
	List<BlogInfo> findAllLeftJoinPost();
	
	List<Post> findActivePostWithSubjectLike(String subject);
	
	List<Post> findActiveBlogLike(Map<String,Object> params);
	
	/**
	 * 测试choose、when、otherwise元素
	 * @param params
	 * @return
	 */
	List<Post> findActiveBlogLikev2(Map<String,Object> params);
	
	List<Post> findActiveBlogLikev3(Map<String,Object> params);
	
	List<Post> findActiveBlogLikev4(Map<String,Object> params);
}
