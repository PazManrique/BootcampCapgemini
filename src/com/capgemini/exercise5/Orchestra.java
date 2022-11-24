package com.capgemini.exercise5;

import java.util.ArrayList;

public class Orchestra {

	private static ArrayList<Instrument> instruments = new ArrayList<Instrument>();

	private static Instrument guitar1 = new Guitar();
	private static Instrument piano1 = new Piano();
	private static Instrument drum1 = new Drum();

	public static void main(String[] args) {
		instruments.add(guitar1);
		instruments.add(piano1);
		instruments.add(drum1);
		printSounds();

	}

	public static void printSounds() {

		for (int i = 0; i < instruments.size(); i++) {
			String sound = instruments.get(i).sound();

			System.out.println(sound);

		}
	}
}

