package com.raisetech.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

import de.huxhorn.sulky.ulid.ULID;

public class User {

	private final String id;
	private String name;
	private LocalDate birthdate;
	private boolean deleted;
	private LocalDateTime createdAt;
	private String createdBy;
	private LocalDateTime updatedAt;
	private String updatedBy;
	private LocalDateTime deletedAt;
	private String deletedBy;

	public User(String name, LocalDate birthdate, String createdBy) {

		ULID ulid = new ULID();

		this.id = ulid.nextULID();
		this.name = name;
		this.birthdate = birthdate;
		this.createdBy = createdBy;
		this.updatedBy = createdBy;

		LocalDateTime now = LocalDateTime.now();
		this.createdAt = now;
		this.updatedAt = now;
	}

	public User(String id, String name, LocalDate birthdate, boolean deleted, LocalDateTime createdAt, String createdBy,
			LocalDateTime updatedAt, String updatedBy, LocalDateTime deletedAy, String deletedBy) {

		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.deleted = deleted;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.deletedAt = deletedAy;
		this.deletedBy = deletedBy;

	}

	public static User userNew(String name, LocalDate birthdate) {

		return new User(name, birthdate, "api");

	}

	public User userUpdate(User user, String name, LocalDate birthdate) {

		this.name = name;
		this.birthdate = birthdate;
		this.updatedAt = LocalDateTime.now();
		this.updatedBy = "api";

		return user;

	}

	public User userDelete(User user) {

		this.deletedAt = LocalDateTime.now();
		this.deletedBy = "api";

		return user;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public LocalDate getBirthdate() {
		return this.birthdate;
	}

	public LocalDateTime getDeletedAt() {
		return this.deletedAt;
	}

	public String getDeletedBy() {
		return this.deletedBy;
	}

}
