package com.example.userscrud.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
	
	private LocalDateTime time;
	private String details;
	private String message;
	
	
	public ErrorDetails(LocalDateTime time, String details, String message) {
		super();
		this.time = time;
		this.details = details;
		this.message = message;
	}
	
	public LocalDateTime getTime() {
		return time;
	}
	public String getDetails() {
		return details;
	}
	public String getMessage() {
		return message;
	}
	
	

}
