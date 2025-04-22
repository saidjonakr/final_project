package com.example.final_project.exception;

public class CustomInternalServerException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomInternalServerException(String message) {
		super(message);
	}

}
