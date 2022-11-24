package com.capgemini.figures.test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.figures.Circle;
import com.capgemini.figures.Figure;
import com.capgemini.figures.Square;

class FigureTest {

	Square empSquare;
	Square fullSquare;
	Circle empCircle;
	Circle fullCircle;

	List<Figure> figuresList;
	Set<Figure> figuresSet;

	@BeforeEach
	void setUp() throws Exception {
		empSquare = new Square();
		fullSquare = new Square("square", 10);

		empCircle = new Circle();
		fullCircle = new Circle("circle", 10);

		figuresList = new ArrayList<>();
		figuresList.add(empSquare);
		figuresList.add(fullSquare);
		figuresList.add(empCircle);
		figuresList.add(fullCircle);
		figuresList.add(new Square("square2", 15));
		figuresList.add(new Circle("circle2", 15));

		figuresSet = new HashSet<>();
		figuresSet.add(empCircle);
		figuresSet.add(empSquare);
		figuresSet.add(fullCircle);
		figuresSet.add(fullSquare);
		figuresSet.add(new Square("square2", 15));
		figuresSet.add(new Circle("circle2", 15));

	}

	@AfterEach
	void tearDown() throws Exception {
		empSquare = null;
		fullSquare = null;
		empCircle = null;
		fullCircle = null;

		figuresList = null;
		figuresSet = null;
	}

	@Test
	void testFullSquareGetName() {
		assertEquals("square", fullSquare.getName());
	}

	@Test
	void testFullSquareGetSide() {
		assertEquals(10, fullSquare.getSide(), 0.001);
	}
	
	@Test
	void testSquarePerimeter() {
		assertEquals(40, fullSquare.calculatePerimeter(), 0.001);
	}
	
	@Test
	void testSquareArea() {
		assertEquals(100, fullSquare.calculateArea(), 0.001);
	}
	
	@Test
	void testSquareEqualHashcodeList_True() {
		assertTrue(figuresList.contains(new Square("square", 10)));
	}
	
	@Test
	void testSquareEqualHashcodeList_False() {
		assertFalse(figuresList.contains(new Square("LittleSquare", 10)));
	}
	
	@Test
	void testSquareEqualList_amount() {
		figuresList.add(new Square());
		assertEquals(7, figuresList.size());
	}
	
	@Test
	void testSquareSetEqual_amount() {
		figuresSet.add(new Square("square", 10));
		assertEquals(6, figuresSet.size());
	}
	
	@Test
	void testSquareEquals_true() {
		Square mySquare = new Square("square", 10);
		assertTrue(fullSquare.equals(mySquare));
	}
	
	@Test
	void testSquareEquals_false() {
		Square mySquare = new Square("littleSquare", 15);
		assertFalse(fullSquare.equals(mySquare));
	}
	
	
	
	
	
	}