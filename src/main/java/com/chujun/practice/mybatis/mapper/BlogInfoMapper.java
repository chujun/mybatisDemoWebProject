/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-10
* Description: 
*/
package com.chujun.practice.mybatis.mapper;
import java.util.List;

import com.chujun.practice.mybatis.model.BlogInfo;
public interface BlogInfoMapper extends GenericMapper<BlogInfo>{
	List<BlogInfo> findAllLeftJoinPost();
}
