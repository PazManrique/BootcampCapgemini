package com.capgemini.exercise12.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.exercise12.SetOperations;

class SetOperationsTests {
	
	Set<String> setStrA;
	Set<String> setStrB;
	Set <Integer> setIntA;
	Set<Integer> setIntB;
	
	

	@BeforeEach
	void setUp() throws Exception {
		
		setStrA = new HashSet <String>();
		setStrA.add("Patricia");
		setStrA.add("Lucy");
		setStrA.add("Paz");
		setStrA.add("Viviana");
		setStrA.add("Marina");
		
		setStrB = new HashSet <String>();
		setStrB.add("Patricia");
		setStrB.add("Lucy");
		setStrB.add("Paz");
		setStrB.add("Cristina");
		setStrB.add("Gabriel");
		setStrB.add("Nerea");
		setStrB.add("Marta");
		
		setIntA = new HashSet <Integer>();
		setIntA.add(1);
		setIntA.add(2);
		setIntA.add(3);
		setIntA.add(4);
		setIntA.add(5);

	
		
		setIntB = new HashSet <Integer>();
		setIntB.add(1);
		setIntB.add(2);
		setIntB.add(3);
		setIntB.add(4);
		setIntB.add(7);
		setIntB.add(8);
		
		

	}
	
	@AfterEach
	void tearDown() throws Exception {
		setStrA = null;
		setStrB = null;
		setIntA = null;
		setIntB = null;
		
	}
	
	@Test
	void testUnionInteger() {
		Set<Integer> totalUnion = new HashSet<Integer>();
		totalUnion.add(1);
		totalUnion.add(2);
		totalUnion.add(3);
		totalUnion.add(4);
		totalUnion.add(5);
		totalUnion.add(7);
		totalUnion.add(8);
		
assertEquals(totalUnion, SetOperations.union(setIntA, setIntB));
		
}


	
	@Test
	void testUnionString() {
		Set<String> totalUnion = new HashSet<String>();
		totalUnion.add("Patricia");
		totalUnion.add("Lucy");
		totalUnion.add("Paz");
		totalUnion.add("Viviana");
		totalUnion.add("Marina");
		totalUnion.add("Patricia");
		totalUnion.add("Cristina");
		totalUnion.add("Gabriel");
		totalUnion.add("Nerea");
		totalUnion.add("Marta");
		
assertEquals(totalUnion, SetOperations.union(setStrA, setStrB));
		
}
	
	

	@Test
	void testIntersectionInteger() {
		Set<Integer> totalUnion = new HashSet<Integer>();
		totalUnion.add(1);
		totalUnion.add(2);
		totalUnion.add(3);
		totalUnion.add(4);
	
		
assertEquals(totalUnion, SetOperations.intersection(setIntA, setIntB));
		
}
	
	@Test
	void testIntersectionString() {
		Set<String> totalUnion = new HashSet<String>();
		totalUnion.add("Patricia");
		totalUnion.add("Lucy");
		totalUnion.add("Paz");
		
assertEquals(totalUnion, SetOperations.intersection(setStrA, setStrB));
		
}
	
	
	@Test
	void testDifferenceInteger() {
		Set<Integer> totalUnion = new HashSet<Integer>();
		totalUnion.add(5);
		
		
assertEquals(totalUnion, SetOperations.difference(setIntA, setIntB));
		
}
	
	@Test
	void testDifferenceString() {
		Set<String> totalUnion = new HashSet<String>();
		totalUnion.add("Viviana");
		totalUnion.add("Marina");
		
		
assertEquals(totalUnion, SetOperations.difference(setStrA, setStrB));
		
}
}
