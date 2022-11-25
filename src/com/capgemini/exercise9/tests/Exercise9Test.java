package com.capgemini.exercise9.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.exercise9.Employee;


class Exercise9Test {
	Employee junior;
	Employee senior; 

	@BeforeEach
	void setUp() throws Exception {
		Date fechaIngreso1 = new Date(2022,11,18);
		Date fechaIngreso2 = new Date(2022,11,19);
		
		junior = new Employee ( fechaIngreso1, 16000, "Giaco", 30);
		senior = new Employee( fechaIngreso2, 30000, "Giaco2", 35);
	}

	@AfterEach
	void tearDown() throws Exception {
		junior = null;
		senior = null;
	}

	
	@Test
	void testEmployeeEquals_True()  {
		Date fechaIngreso1 = new Date(2022,11,18);
		Employee juniorT = new Employee ( fechaIngreso1, 16000, "Giaco", 30);
		
	
		assertTrue(junior.equals(juniorT));
	}
	

	@Test
	void testEmployeeEquals_False() {
		Date fecha = new Date (2022,10,18);
		Employee pazT = new Employee (fecha, 16000, "Giaco", 30);
		assertFalse(junior.equals(pazT));
	}
	

	
}


