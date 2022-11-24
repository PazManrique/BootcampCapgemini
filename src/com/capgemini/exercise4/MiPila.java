package com.capgemini.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MiPila {

	public static void main(String[] args) {
		Push(23);
		peek();
		pop();
		reverse();
		printElements(numbers);
		

	}

	private static ArrayList<Integer> numbers = new ArrayList<Integer>();

	public static void Push(Integer number) {
		numbers.add(15);
		numbers.add(22);
		numbers.add(30);
		numbers.add(40);
		numbers.add(number);

		for (Integer position : numbers) {
			System.out.println("Number = " + position);
		}
	}

	public static  int peek() {
    	  	int lastIdx = numbers.size() - 1;
    		int lastElement = numbers.get(lastIdx);
    		return lastElement;
	   
	      }

	public static  ArrayList<Integer> reverse() {
		
	  
	        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
	        for (int i = numbers.size() - 1; i >= 0; i--) {
	 
	            revArrayList.add(numbers.get(i));
	        }
	 
	        numbers = revArrayList;
	        return numbers;
	}
	
	public static void printElements(ArrayList<Integer> numbers)
    {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }}

	public static int pop() {
		int lastIdx = numbers.size() - 1;
		int lastElement = numbers.get(lastIdx);
		numbers.remove(lastIdx);

		return lastElement;

	}

	
	
	  
		 
}



