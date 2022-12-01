package com.capgemini.exercise10.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.exercise10.Planet;

class PlanetTest {
	String miPlanet;
	double radius, mass;

	@BeforeEach
	void setUp() throws Exception {
		miPlanet = "MERCURY";
		radius = 2.4397e6;
		mass = 3.303e+23;
	}

	@AfterEach
	void tearDown() throws Exception {
		miPlanet = null;
		radius = 0;
		mass = 0;
	}

	@Test
	void testMercuryString() {
		assertEquals(miPlanet, Planet.MERCURY.toString() );
	}
	
	@Test
	void testRadius() {
		assertEquals(radius, Planet.MERCURY.getRadius() );
	}
	
	@Test
	void testMass() {
		assertEquals(mass, Planet.MERCURY.getMass() );
	}

}
