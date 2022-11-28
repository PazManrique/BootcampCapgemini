package com.capgemini.piedraPapelTijera;

import java.util.List;

public abstract class PiedraPapelTijeraF {

	static int piedra = 1;
	static int papel = 2;
	static int tijera = 3;
	protected String descripcionResultado;
	static List<PiedraPapelTijeraF> elementos;
	String nombre;
	int numero;

	public String getDescripcionResultado() {
		return descripcionResultado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * 
	 */
	public PiedraPapelTijeraF(String nombre, int numero) {

	}

	abstract void isMe(int numero);

	
		
	

}
