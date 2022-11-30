package com.capgemini.piedraPapelTijera;

import java.util.List;

public abstract class PiedraPapelTijeraF {

	public static final int PIEDRA = 1;
	public static final  int PAPEL = 2;
	public static final  int TIJERA = 3;
	
	
	protected String 							descripcionResultado;
	private static List<PiedraPapelTijeraF> 	elementos;
	protected String 							nombre;
	protected int 								numero;

	//Constructores 
	


	/**
	 * 
	 */
	public PiedraPapelTijeraF(String nombre, int numero) {

	}
	
	//Accesos

	public String getNombre() 				{return nombre;}
	public void setNombre(String nombre) 	{this.nombre = nombre;}

	public int getNumero() 					{return numero;}
	public void setNumero(int numero) 		{this.numero = numero;}
	
	public String getDescripcionResultado() {return descripcionResultado;}
	

	//Métodos de negocio
	
	public abstract boolean isMe(int numero);
	
	public abstract int comparar(PiedraPapelTijeraF pPiedraPapelTijera);
	
	public static PiedraPapelTijeraF getInstance(int pNumero) {
	
	return null;
	}

	
	
		
	

}
