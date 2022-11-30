package com.capgemini.exercise10;

public class Main {

	public static void main(String[] args) {
		 Planet pEarth = Planet.EARTH;
		 System.out.println(pEarth);
		 double earthRadius = pEarth.getRadius();
		 System.out.println("El radio es " + earthRadius);
		 double earthMass = pEarth.getMass();
		 System.out.println("La masa es " + earthMass);

	}

}
