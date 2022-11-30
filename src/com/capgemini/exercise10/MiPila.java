package com.capgemini.exercise10;
import java.util.ArrayList;


public class MiPila<T> {

	public static void main(String[] args) {
		Push(23);
		peek();
		pop();
		reverse();

	}

	private static ArrayList<Integer> numbers = new ArrayList<Integer>();

	public static void Push(Integer number) {

		numbers.add(number);

		for (Integer position : numbers) {
			System.out.println("Number = " + position);
		}
	}

	public static int peek() {
		int lastIdx = numbers.size() - 1;
		Integer lastElement = numbers.get(lastIdx);

		return lastElement;

	}

	public static ArrayList<Integer> reverse() {

		ArrayList<Integer> revArrayList = new ArrayList<Integer>();
		for (int i = numbers.size() - 1; i >= 0; i--) {

			revArrayList.add(numbers.get(i));
		}

		numbers = revArrayList;
		return numbers;
	}

	public static int pop() {
		int lastIdx = numbers.size() - 1;
		int lastElement = numbers.get(lastIdx);
		numbers.remove(lastIdx);

		return lastElement;

	}

	
	
	  
		 
}
