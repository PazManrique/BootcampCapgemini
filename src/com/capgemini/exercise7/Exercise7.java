package com.capgemini.exercise7;

import java.util.Arrays;

public class Exercise7 {
	public static void main(String[] args) {
		int[] array = { 10, 5, 6, 3, 8, 9, 2, 4, 7 };
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}

			}
		}
		System.out.println(Arrays.toString(array));
	}
}
