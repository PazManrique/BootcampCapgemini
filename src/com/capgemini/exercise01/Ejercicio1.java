package com.capgemini.exercise01;

import java.util.Scanner;

/**
 * 
 * @author mamanriq
 *
 */
public class Ejercicio1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingrese un número");
	int i = sc.nextInt();
	
	int nro = (int)(Math.random()*100);
	System.out.println("Loteria Gabriliana...;" + nro);
	if (nro==i ) {
		System.out.println("Ganaste");}
		else 
			System.out.println("Seguí participando");
	sc.close();
	
}
}
