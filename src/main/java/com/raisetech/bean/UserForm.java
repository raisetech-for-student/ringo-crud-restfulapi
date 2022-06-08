package com.raisetech.bean;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class UserForm {

	// バリデーション未実装

	// @NotBlank
	private String name;

	// @NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthdate;

	public String getName() {
		return this.name;
	}

	public LocalDate getBirthdate() {
		return this.birthdate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

}
