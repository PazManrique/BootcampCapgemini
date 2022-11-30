package com.capgemini.piedraPapelTijera;

public class Tijera extends PiedraPapelTijeraF  {
	
	

	public Tijera() {
		this("tijera", TIJERA);
		
	}

	public Tijera(String nombre, int numero) {
		super(nombre, numero);
		
	}

	@Override
	public boolean isMe(int numero) {
		return numero == TIJERA;
		
		
	}

	@Override
	public int comparar(PiedraPapelTijeraF pPiedraPapelTijera) {
		int result = 0;
		int numeroRecibido = pPiedraPapelTijera.getNumero();

		switch (numeroRecibido) {
		case PIEDRA:
			result = -1;
			descripcionResultado = nombre + "pierde con" + pPiedraPapelTijera.getNombre();
			break;
		case PAPEL:
			result = 1;
			descripcionResultado = nombre + "le gana a" + pPiedraPapelTijera.getNombre();
			break;
		default:
			result = 0;
			descripcionResultado = nombre + "empata con" + pPiedraPapelTijera.getNombre();

			break;

		}
		return result;
	}


	

}
