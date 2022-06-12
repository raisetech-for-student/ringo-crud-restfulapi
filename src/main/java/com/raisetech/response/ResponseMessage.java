package com.raisetech.response;

public class ResponseMessage {

	private String message;

	public ResponseMessage(String message) {

		this.message = message;
	}

	public static ResponseMessage newMessage(String message) {

		return new ResponseMessage(message);

	}

	public String getMessage() {

		return this.message;

	}
}
