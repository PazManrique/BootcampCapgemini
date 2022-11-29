package com.capgemini.comparison;

import java.util.Set;
import java.util.TreeSet;

import com.capgemini.exercise13.Person;
import com.capgemini.figures.Circle;
import com.capgemini.figures.Figure;
import com.capgemini.figures.Square;
import com.capgemini.figures.exceptions.ExceptionFigure;

public class ComparisonExample {
	
	public static void main(String[] args) throws ExceptionFigure {
		Set<String> namesList = new TreeSet<>();
		namesList.add(new String("Gabriel"));
		namesList.add(new String("Marta"));
		namesList.add(new String("Patricia"));
		namesList.add(new String("Viviana"));
		namesList.add(new String("Lucy"));
		namesList.add(new String("Marina"));
		namesList.add(new String("Cristina"));
		namesList.add(new String("Nerea"));
		namesList.add(new String("Paz"));
		int i = 1;
		for(String name: namesList) 
			System.out.println(i++ + "nombre=" + name);
		
		Set<Figure> figures = new TreeSet<Figure>();
		figures.add(new Square ("Cuadrado", 10));
		figures.add(new Square ("Mi Cuadrado", 20));
		figures.add(new Square ("Mi Cuadrado", 30));
		figures.add(new Square ("El Cuadrado de todos", 100));
		figures.add(new Square ("El Cuadrado de ellos ", 200));
		figures.add(new Circle ("Circulo", 10));
		figures.add(new Circle ("Mi Circulo", 10));
		figures.add(new Circle ("Tu Circulo", 10));
		figures.add(new Circle ("Ahhh que Circulo", 10));
		figures.add(new Circle ("Epa que Circulo", 10));
		i=1;
		for (Figure figure:figures)
			System.out.println(i++ + "figure=" + figure);
		
	
		
		
	}
	

	
}
