package com.capgemini.exercise11.util.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.exercise11.util.Pair;

class PairTest {
	String miString;
	Integer miInteger;

	@BeforeEach
	void setUp() throws Exception {
		miString = new String ("Gabrielito");
		miInteger = new Integer (10);
	}

	@AfterEach
	void tearDown() throws Exception {
		miString = null;
		miInteger = null;
		
		
	}

	@Test
	void testConstructorConString() {
		Pair<String> strPair = new Pair<String>(miString, "Casas");
		String first = strPair.getFirst();
		String second = strPair.getSecond();
		
		assertEquals("Gabrielito", first);
		assertEquals("Casas", second);
		
	}
	
	@Test
	void testConstructorConInteger() {
		Pair<Integer> inPair = new Pair<Integer>(miInteger, new Integer(15));
		Integer first = inPair.getFirst();
		Integer second = inPair.getSecond();
		
		assertEquals(new Integer (10), first);
		assertEquals(new Integer (15), second);

		
	}


}
