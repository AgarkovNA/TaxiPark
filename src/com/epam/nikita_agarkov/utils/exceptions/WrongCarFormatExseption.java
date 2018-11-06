package com.epam.nikita_agarkov.utils.exceptions;

public class WrongCarFormatExseption extends Exception {

	public WrongCarFormatExseption (String message, Throwable e) {
		super(message,e);
	}
	public WrongCarFormatExseption (String message) {
		super(message);
	}

}
