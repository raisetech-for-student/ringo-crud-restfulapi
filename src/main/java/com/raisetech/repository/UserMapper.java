package com.raisetech.repository;

import org.apache.ibatis.annotations.Mapper;

import com.raisetech.bean.User;

@Mapper
public interface UserMapper {

	/** 登録 */
	public void setUser(User user);

}