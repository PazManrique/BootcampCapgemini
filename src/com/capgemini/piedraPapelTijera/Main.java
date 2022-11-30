package com.capgemini.piedraPapelTijera;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	System.out.println("Vamos a jugar a piedra, papel o tijera");
	System.out.println("Ingrese un número 1-Piedra 2-Papel 3-Tijera");
	Scanner sc = new Scanner(System.in);
	int nro = sc.nextInt();
	
	int nroOrdenador = (int)(Math.random()*3)+1;
	
	PiedraPapelTijeraF pptUsuario = PiedraPapelTijeraF.getInstance(nro);
	PiedraPapelTijeraF pptOrdenador = PiedraPapelTijeraF.getInstance(nroOrdenador);
	
	pptUsuario.comparar(pptOrdenador);
	
	System.out.println("\n\nEl resultado del juego es...");
	System.out.println("El usuario eligió; " + pptUsuario.getNombre());
	System.out.println("El ordenador eligió; " + pptOrdenador.getNombre());
	System.out.println("resultado " + pptUsuario.getDescripcionResultado());
	}

}
