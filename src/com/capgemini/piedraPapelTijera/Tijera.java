package com.capgemini.piedraPapelTijera;

public class Tijera extends PiedraPapelTijeraF  {
	
	

	public Tijera() {
		super();
		
	}

	public Tijera(String nombre, int numero) {
		super(nombre, numero);
		
	}

	@Override
	boolean isMe(int numero) {
		return false;
		
		
	}

	@Override
	int comparar() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
