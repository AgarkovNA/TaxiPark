package com.epam.nikita_agarkov.utils.exceptions;

public class TripValidationException extends Exception {

	public TripValidationException() {
		super();
	}

	public TripValidationException(String message, Throwable cause) {
		super(message, cause);
	}

	public TripValidationException(String message) {
		super(message);
	}

}
