/**
 * 
 */
package com.capgemini.figures;

/**
 * @author mamanriq
 *
 */
public class Square extends Figure {
	private float side;

	public Square() {
		super();
	}

	public Square(String name, float side) {
		super(name);
		this.side = side;
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	public float calculatePerimeter() {

		return side * 4;
	}

	@Override
	public float calculateArea() {

		return side * side;
	}

	@Override
	public int hashCode() {
		
		return super.hashCode() + (int)side;
	}

	@Override
	public boolean equals(Object obj) {

		return super.equals(obj) && obj instanceof Square && ((Square) obj).getSide() == side;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", lado = ");
		sb.append(side);
		return sb.toString();
	}

}
