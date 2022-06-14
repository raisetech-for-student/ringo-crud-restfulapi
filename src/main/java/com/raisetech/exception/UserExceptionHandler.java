package com.raisetech.exception;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.raisetech.response.ValidationErrorResponseMessage;

@RestControllerAdvice
public class UserExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<Object> handleConstraintViolationException(ConstraintViolationException ex,
			WebRequest request) {
		ValidationErrorResponseMessage error = new ValidationErrorResponseMessage("validation error");
		ex.getConstraintViolations().forEach(v -> error.addValidationMessage(v.getMessage()));
		return super.handleExceptionInternal(ex, error, null, HttpStatus.BAD_REQUEST, request);
	}

}