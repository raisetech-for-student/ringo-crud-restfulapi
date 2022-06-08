package com.raisetech.service.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raisetech.bean.User;
import com.raisetech.repository.UserMapper;
import com.raisetech.service.RegisterUserService;

@Service
public class RegisterUserServiceImpl implements RegisterUserService {

	@Autowired
	private UserMapper mapper;

	/** 登録 */
	@Override
	public void createUser(String name, LocalDate birthdate) {

		this.mapper.setUser(User.userNew(name, birthdate));
	}

}