package com.capgemini.exercise8;

import java.io.UncheckedIOException;

import com.capgemini.exercise8.exceptions.ExceptionA;
import com.capgemini.exercise8.exceptions.ExceptionB;


public class A {
	
	
	public A() {
		super();
	}

	public static void a() throws ExceptionA {
		
		throw new ExceptionA("Esto de los errores lo tengo que repasar");
		
	}
	
	public static void b() throws ExceptionB  {
		throw new ExceptionB("Ni idea");
	}

}
