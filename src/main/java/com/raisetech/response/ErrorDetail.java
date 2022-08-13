package com.raisetech.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Setter;

@Setter
public class ErrorDetail {
	@JsonProperty("detailMessage")
	String detailMessage;
}
