package com.capgemini.exercise10;
import java.util.ArrayList;
import java.util.List;


public class MiPila<T> {
	



	   private ArrayList<T> numbers=new ArrayList<T>();
	    
	   public void push(T e){
	        numbers.add(e);
	    }

	   public T peek() {
	        T lastElement = numbers.get(numbers.size()-1);
	        return lastElement;
	        
	     
	    }

	   public T pop() {        
	        T lastElement = numbers.remove(numbers.size() - 1);
	        return lastElement;
	    }
	        
	 
	    
	 
	    
	    public ArrayList<T> reverse() {
	        ArrayList<T> revArrayList = new ArrayList<T>();
	        for (int i = numbers.size() - 1; i >= 0; i--) {
	       	 
	            revArrayList.add(numbers.get(i));
	        }
	 
	        numbers = revArrayList;
	        return numbers;
	}
	
	
	  
		 

