package com.capgemini.piedraPapelTijera;

import java.util.List;

public abstract class PiedraPapelTijeraF {

	static int piedra = 1;
	static int papel = 2;
	static int tijera = 3;
	protected String descripcionResultado;
	private static List<PiedraPapelTijeraF> elementos;
	protected String nombre;
	protected int numero;

	//Constructores 
	
	public PiedraPapelTijeraF() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public PiedraPapelTijeraF(String nombre, int numero) {

	}
	
	//Accesos

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
	
	public String getDescripcionResultado() {
		return descripcionResultado;
	}
	

	//Métodos 
	
	abstract boolean isMe(int numero);
	
	abstract int comparar();
	
	PiedraPapelTijeraF getInstance(int numero) {
		return null;
	}

	
	
		
	

}
