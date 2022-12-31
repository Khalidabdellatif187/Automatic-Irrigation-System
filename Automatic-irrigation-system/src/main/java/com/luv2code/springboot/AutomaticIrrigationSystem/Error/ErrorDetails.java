package com.luv2code.springboot.AutomaticIrrigationSystem.Error;

import java.util.Date;

public class ErrorDetails {
	
	
	private Date date;
	private String message;
	private String details;
	public ErrorDetails(Date date, String message, String details) {
		super();
		this.date = date;
		this.message = message;
		this.details = details;
	}
	
	
	
	public ErrorDetails() {
		
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public String getDetails() {
		return details;
	}



	public void setDetails(String details) {
		this.details = details;
	}
	
	

}