package com.luv2code.springboot.AutomaticIrrigationSystem.CustomExceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.luv2code.springboot.AutomaticIrrigationSystem.Error.ErrorDetails;



@ControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler {
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handelexception(Exception exception , WebRequest request){
		
		ErrorDetails errordetails = new ErrorDetails(new Date() , exception.getMessage() , request.getDescription(false));
		
		return new ResponseEntity<>(errordetails , HttpStatus.BAD_REQUEST);
	}


}
