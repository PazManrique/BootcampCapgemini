package com.capgemini.exercise5;

import java.util.ArrayList;

public class Orchestra {
	
	private static ArrayList <Object> instruments = new ArrayList<Object>();
	
	private static Instrument guitar1 = new Guitar();
	private static Instrument piano1 = new Piano();
	private static Instrument drum1 = new Drum();
	
	
	public static void main(String[] args) {
		instruments.add(guitar1);
		instruments.add(piano1);
		instruments.add(drum1);
		
		for(int i=0; i<instruments.size(); i++) {
			System.out.println("No logro imprimir!!!");
		}

}
}

