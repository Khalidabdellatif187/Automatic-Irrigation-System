package com.luv2code.springboot.AutomaticIrrigationSystem.CustomExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class Resourcenotfoundexception extends RuntimeException {
	
	
	 private String resourceName;
	    private String fieldName;
	    private long fieldValue;
		public Resourcenotfoundexception(String resourceName, String fieldName, long fieldValue) {
			super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
			this.resourceName = resourceName;
			this.fieldName = fieldName;
			this.fieldValue = fieldValue;
		}
		public String getResourceName() {
			return resourceName;
		}
		
		public String getFieldName() {
			return fieldName;
		}
		
		public long getFieldValue() {
			return fieldValue;
		}
		public Resourcenotfoundexception(String resourceName, String fieldName) {
			super();
			this.resourceName = resourceName;
			this.fieldName = fieldName;
		}
		
		
		
		

		
		
	   
	
	

}
