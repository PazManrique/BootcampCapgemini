package com.capgemini.piedraPapelTijera;

public class Papel extends PiedraPapelTijeraF {
	
	

	public Papel() {
		this("papel", PAPEL);

	}

	public Papel(String nombre, int numero) {
		super(nombre, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isMe(int numero) {
		return numero == PAPEL;
		
	}

	@Override
	public int comparar(PiedraPapelTijeraF pPiedraPapelTijera) {
		
		int result = 0;
		int numeroRecibido = pPiedraPapelTijera.getNumero();

		switch (numeroRecibido) {
		case TIJERA:
			result = -1;
			descripcionResultado = nombre + " pierde con " + pPiedraPapelTijera.getNombre();
			break;
		case PIEDRA:
			result = 1;
			descripcionResultado = nombre + " le gana a " + pPiedraPapelTijera.getNombre();
			break;
		default:
			result = 0;
			descripcionResultado = nombre + " empata con " + pPiedraPapelTijera.getNombre();

			break;

		}
		return result;
	}



	
	
	

}
