package com.capgemini.figures;

/**
 * 
 * @author mamanriq Esta es la clase padre que va a establecer las pautas para
 *         todas las figuras.
 */
public abstract class Figure implements Comparable<Figure> {
	private String name;
	private static int numberOfFigures;

	// Constructores

	public Figure() {
		super();
		numberOfFigures++;

	}

	public Figure(String name) {
		this();
		this.name = name;

	}

	// Accesos

	public static int getNumberOfFigures() {
		return numberOfFigures;
	}
	
	public static void clear() {
		numberOfFigures = 0;
	}

	public static void setNumberOfFigures(int numberOfFigures) {
		Figure.numberOfFigures = numberOfFigures;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Métodos de negocio
	public abstract float calculatePerimeter();

	public abstract float calculateArea();

	@Override
	public int hashCode() {

		return name == null ? 0 : name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		boolean bln = false;
		if (obj instanceof Figure) {
			Figure fig = (Figure) obj;
			bln = fig.getName() != null && fig.getName().equals(name);

		}
		return bln;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("\nombre =");
		sb.append(name);
		sb.append("\n_ _ _ _ _ _ \n");
		return sb.toString();

	}

	@Override
	public int compareTo(Figure o) {
		
		return (-1)*name.compareTo(o.getName());
	}
	
	
	
	

}
