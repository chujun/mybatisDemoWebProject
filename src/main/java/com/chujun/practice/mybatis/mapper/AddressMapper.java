/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-7-1
* Description: 
*/
package com.chujun.practice.mybatis.mapper;

import java.util.List;

import com.chujun.practice.mybatis.domain.Address;

public interface AddressMapper extends GenericMapper<Address> {
		
	public List<Address> findByCountryId(int countryId);
		
}
