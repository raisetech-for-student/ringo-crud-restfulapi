package com.raisetech.service.impl;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.raisetech.bean.User;
import com.raisetech.repository.UserMapper;
import com.raisetech.service.RegisterUserService;

@Service
public class RegisterUserServiceImpl implements RegisterUserService {

	private final UserMapper mapper;

	public RegisterUserServiceImpl(UserMapper mapper) {
		this.mapper = mapper;
	}

	/** 登録 */
	@Override
	public void createUser(String name, LocalDate birthdate) {

		this.mapper.setUser(User.userNew(name, birthdate));
	}

}