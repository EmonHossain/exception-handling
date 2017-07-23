package com.emon;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6730284982853443399L;

	@ResponseBody
	@ExceptionHandler
	public ResponseEntity<GlobalMessage> internalServerErrorException(Model model,Exception exception) {
		//System.err.println("Exception trigered");
		return new ResponseEntity<GlobalMessage>(
				new GlobalMessage(HttpStatus.INTERNAL_SERVER_ERROR.value(), exception.getMessage()),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
