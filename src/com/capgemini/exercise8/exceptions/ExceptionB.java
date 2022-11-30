package com.capgemini.exercise8.exceptions;

import java.io.IOException;
import java.io.UncheckedIOException;

public class ExceptionB extends RuntimeException {

	public ExceptionB(String message) {
		super(message);
	}
