package com.capgemini.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MiPila {
	  
	public static void main(String[] args) {
		Push(23);
		peek();
		reverse();
		pop();
		 
	   }	
	  
	 
	 private static ArrayList<Integer> numbers = new ArrayList<Integer>();

     public static  void Push(Integer number) {
      numbers.add(15);
      numbers.add(22);
      numbers.add(30);
      numbers.add(40);
      numbers.add(number);
      
      for (Integer position : numbers) {
	         System.out.println("Number = " + position);
	      } 
      }
      
      public static  void peek() {
    	  	int lastIdx = numbers.size() - 1;
    		int lastElement = numbers.get(lastIdx);
	      System.out.println("El último numero es = " + lastElement);
	      }
      
      public static  void reverse() {
  	  	
	
	      }
      
      public static  void pop() {
    	  	
    		
      }
	      

	
	
	  
		 
}



