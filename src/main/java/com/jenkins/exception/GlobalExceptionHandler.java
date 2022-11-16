package com.jenkins.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jenkins.response.BankRegistrationResponseModal;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler({ MethodArgumentNotValidException.class })
	public BankRegistrationResponseModal validationException(MethodArgumentNotValidException ex) {
		System.err.println("Inside validationException");
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getFieldErrors()
				.forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
		BankRegistrationResponseModal responseModal = new BankRegistrationResponseModal();
		responseModal.setApiResponseCode("401");
		responseModal.setApiResponseMessage(errors.toString());
		responseModal.getApiResponseData().setResponseCode("");
		responseModal.getApiResponseData().setResponseCode("");
		return responseModal;
	}
}
