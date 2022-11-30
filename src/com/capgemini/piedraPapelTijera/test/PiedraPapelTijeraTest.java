package com.capgemini.piedraPapelTijera.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.piedraPapelTijera.Papel;
import com.capgemini.piedraPapelTijera.Piedra;
import com.capgemini.piedraPapelTijera.PiedraPapelTijeraF;
import com.capgemini.piedraPapelTijera.Tijera;

class PiedraPapelTijeraTest {
	//lote de pruebas
	PiedraPapelTijeraF piedra,
					   piedra2,
					   papel,
					   papel2,
					   tijera,
					   tijera2;

	@BeforeEach
	void setUp() throws Exception {
		piedra = new Piedra();
		piedra2 = new Piedra();
		papel =  new Papel();
		papel2 =  new Papel();
		tijera =	new Tijera();
		tijera2 =	new Tijera();
	}

	@AfterEach
	void tearDown() throws Exception {
		piedra = null;
		piedra2 = null;
		papel = null;
		papel2 = null;
		tijera = null;
		tijera2 = null;
	}
	
	//instance

	@Test
	void testGetInstancePiedra_true() {
		assertTrue(PiedraPapelTijeraF.getInstance(PiedraPapelTijeraF.PIEDRA)instanceof Piedra);
	}
	
	@Test
	void testGetInstancePapel_true() {
		assertTrue(PiedraPapelTijeraF.getInstance(PiedraPapelTijeraF.PAPEL)instanceof Papel);
	}
	
	@Test
	void testGetInstanceTijera_true() {
		assertTrue(PiedraPapelTijeraF.getInstance(PiedraPapelTijeraF.TIJERA)instanceof Tijera);
	}
	
	@Test
	void testGetInstancePiedra_false() {
		assertFalse(PiedraPapelTijeraF.getInstance(PiedraPapelTijeraF.PIEDRA)instanceof Tijera);
	}
	
	@Test
	void testGetInstancePapel_false() {
		assertFalse(PiedraPapelTijeraF.getInstance(PiedraPapelTijeraF.PAPEL)instanceof Tijera);
	}
	
	@Test
	void testGetInstanceTijera_false() {
		assertFalse(PiedraPapelTijeraF.getInstance(PiedraPapelTijeraF.TIJERA)instanceof Papel);
	}
	
	
	//piedra
	@Test
	void testPiedraLeGanaATijera() {
		assertEquals(1, piedra.comparar(tijera));

}
	
	@Test
	void testPiedraPierdeConPapel() {
		assertEquals(-1, piedra.comparar(papel));

}
	
	@Test
	void testPiedraEmpataConPiedra() {
		assertEquals(0, piedra2.comparar(piedra));

}
	
	//tijera
	
	@Test
	void testTijeraGanaPapel() {
		assertEquals(1, tijera.comparar(papel));

}
	
	@Test
	void testTijeraPierdePiedra() {
		assertEquals(-1, tijera.comparar(piedra));

}
	
	@Test
	void testTijeraEmpataTijera() {
		
		assertEquals(0, tijera2.comparar(tijera));

}
	
	//papel
	
	@Test
	void testPapelGanaPiedra() {
		assertEquals(1, papel.comparar(piedra));

}
	
	@Test
	void testPapelPierdeTijera() {
		assertEquals(-1, papel.comparar(tijera));

}
	
	@Test
	void testPapelEmpataPapel() {
		assertEquals(0, papel2.comparar(papel));

}
	
	//papel texto
	
	@Test
	void testPapelTextoEmpata() {
		papel.comparar(papel2);
		assertEquals("papel empata con papel", papel.getDescripcionResultado());

}
	
	@Test
	void testPapelTextoPierde() {
		papel.comparar(tijera);
		assertEquals("papel pierde con tijera", papel.getDescripcionResultado());

}
	
	@Test
	void testPapelTextoGana() {
		papel.comparar(piedra);
		assertEquals("papel le gana a piedra", papel.getDescripcionResultado());

}
	
	//piedra
	
	@Test
	void testPiedraTextoPierde() {
		piedra.comparar(papel);
		assertEquals("piedra pierde con papel", piedra.getDescripcionResultado());

}
	
	@Test
	void testPiedraTextoEmpata() {
		piedra.comparar(piedra2);
		assertEquals("piedra empata con piedra", piedra.getDescripcionResultado());

}
	
	@Test
	void testPiedraTextoGana() {
		piedra.comparar(tijera);
		assertEquals("piedra le gana a tijera", piedra.getDescripcionResultado());

}
	
	//tijera
	
	@Test
	void testTijeraTextoGana() {
		tijera.comparar(papel);
		assertEquals("tijera le gana a papel", tijera.getDescripcionResultado());

}
	
	@Test
	void testTijeraTextoPierde() {
		tijera.comparar(piedra);
		assertEquals("tijera pierde con piedra", tijera.getDescripcionResultado());

}
	@Test
	void testTijeraTextoEmpata() {
		tijera.comparar(tijera2);
		assertEquals("tijera empata con tijera", tijera.getDescripcionResultado());

}
	
	
}
