package com.capgemini.piedraPapelTijera;

import java.util.ArrayList;
import java.util.List;

public abstract class PiedraPapelTijeraF {

	public static final int PIEDRA = 1;
	public static final int PAPEL = 2;
	public static final int TIJERA = 3;

	protected String descripcionResultado;
	private static List<PiedraPapelTijeraF> elementos;
	protected String nombre;
	protected int numero;

	// Constructores

	/**
	 * 
	 */
	public PiedraPapelTijeraF(String nombre, int numero) {
		this.nombre = nombre;
		this.numero = numero;
	}

	// Accesos

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

	// Métodos de negocio

	public abstract boolean isMe(int numero);

	public abstract int comparar(PiedraPapelTijeraF pPiedraPapelTijera);

	public static PiedraPapelTijeraF getInstance(int pNumero) {
		// el padre conoce a todos sus hijos
		elementos = new ArrayList<PiedraPapelTijeraF>();
		elementos.add(new Piedra());
		elementos.add(new Papel());
		elementos.add(new Tijera());

		for (PiedraPapelTijeraF piedraPapelTijeraF : elementos) {
			if (piedraPapelTijeraF.isMe(pNumero))
				return piedraPapelTijeraF;
		}
		return null;
	}
	
	
		
	

}
