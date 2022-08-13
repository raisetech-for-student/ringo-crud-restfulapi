package com.raisetech.response;

import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Setter;

@Setter
public class ErrorResponseBody {

	@JsonProperty("timestamp")
	private ZonedDateTime exceptionOccurrenceTime;
	@JsonProperty("status")
	private int status;
	@JsonProperty("error")
	private String error;
	@JsonProperty("message")
	private String message;
	@JsonProperty("path")
	private String path;
	@JsonProperty("errorDetail")
	private ErrorDetail errorDetail;
}
