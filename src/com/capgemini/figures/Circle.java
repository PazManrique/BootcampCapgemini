/**
 * 
 */
package com.capgemini.figures;

/**
 * @author mamanriq
 *
 */
public class Circle extends Figure {

	private float radius;

	public Circle() {
		super();

	}

	public Circle(String name, float radius) {
		super(name);
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public float calculatePerimeter() {

		return 2 * (float) Math.PI * radius;
	}

	@Override
	public float calculateArea() {

		return (float) Math.PI * (float) Math.pow(radius, 2);
	}

	@Override
	public int hashCode() {
		
		return super.hashCode() + (int) radius;
	}

	@Override
	public boolean equals(Object obj) {

		return super.equals(obj) && obj instanceof Circle && ((Circle) obj).getRadius() == radius;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", radio=");
		sb.append(radius);
		return sb.toString();
	}

}
