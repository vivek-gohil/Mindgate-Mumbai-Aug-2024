package com.mindgate.main.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

//	public ResponseEntity<ErrorResponseDto> handleExceptionApplication(ResourceNotFound , WebRequest webRequest) {
//		ErrorResponseDto errorResponseDto = new ErrorResponseDto();
//
//		errorResponseDto.setApiPath(webRequest.getDescription(false));
//		errorResponseDto.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
//		errorResponseDto.setErrorMessage(exception.getMessage());
//		errorResponseDto.setErrorDateTime(LocalDateTime.now());
//
//		return new ResponseEntity<ErrorResponseDto>(errorResponseDto, HttpStatus.BAD_GATEWAY);
//	}
}
