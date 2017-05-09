package com.person.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.person.model.PersonError;

@RestControllerAdvice
public class PersonServiceExceptionHandler {

	
	@ExceptionHandler(Exception.class)
	public PersonError handleAllException(Exception e){
		return new PersonError("SYS_ERROR", "Error while processing your reqeust.");
	}
	
}
