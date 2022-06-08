package com.raisetech.service;

import java.time.LocalDate;

public interface RegisterUserService {

	/** 登録 */
	public void createUser(String name, LocalDate birthdate);

}