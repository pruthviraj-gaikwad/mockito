package com.in28minutes.rest.webservices.restful_web_services.exception;

import java.time.LocalDateTime;

public class ErrorDetails{

	private LocalDateTime timestamp;
	private String message;	
	private String detail;
	
	public ErrorDetails(LocalDateTime localDateTime, String message, String detail) {
		super();
		this.timestamp = localDateTime;
		this.message = message;
		this.detail = detail;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetail() {
		return detail;
	}
	
	
}
