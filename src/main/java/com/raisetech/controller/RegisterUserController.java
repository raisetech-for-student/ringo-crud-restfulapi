package com.raisetech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raisetech.bean.UserForm;
import com.raisetech.service.RegisterUserService;

@RestController
public class RegisterUserController {

	@Autowired
	private RegisterUserService registerUserService;

	@PostMapping("/users")
	public String signup(@ModelAttribute UserForm form) {

		this.registerUserService.createUser(form.getName(), form.getBirthdate());

		return "登録完了";

	}

}