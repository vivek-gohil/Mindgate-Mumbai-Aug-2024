package com.mindgate.main.dto;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorResponseDto {
	private String apiPath;
	private HttpStatus httpStatus;
	private String errorMessage;
	private LocalDateTime errorDateTime;

	public ErrorResponseDto() {
		// TODO Auto-generated constructor stub
	}

	public ErrorResponseDto(String apiPath, HttpStatus httpStatus, String errorMessage, LocalDateTime errorDateTime) {
		super();
		this.apiPath = apiPath;
		this.httpStatus = httpStatus;
		this.errorMessage = errorMessage;
		this.errorDateTime = errorDateTime;
	}

	public String getApiPath() {
		return apiPath;
	}

	public void setApiPath(String apiPath) {
		this.apiPath = apiPath;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public LocalDateTime getErrorDateTime() {
		return errorDateTime;
	}

	public void setErrorDateTime(LocalDateTime errorDateTime) {
		this.errorDateTime = errorDateTime;
	}

}
