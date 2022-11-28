package com.capgemini.exercise12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class SetOperations <T> {
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * ArrayList<String> list1 = new ArrayList<String>();
	 * 
	 * 
	 * list1.add("Geeks"); list1.add("For"); list1.add("ForGeeks");
	 * 
	 * 
	 * System.out.println("ArrayList 1: " + list1);
	 * 
	 * 
	 * ArrayList<String> list2 = new ArrayList<String>();
	 * 
	 * list2.add("GeeksForGeeks"); list2.add("A computer portal");
	 * list2.add("ForGeeks");
	 * 
	 * 
	 * System.out.println("ArrayList 2: " + list2);
	 * 
	 * 
	 * ArrayList<String>joinedArray = new ArrayList<String>();
	 * 
	 * joinedArray.addAll(list1); joinedArray.addAll(list2);
	 * 
	 * ArrayList<String>intersectArray = new ArrayList<String>();
	 * intersectArray.addAll(list1); intersectArray.retainAll(list2);
	 * 
	 * ArrayList<String>diferenceArray = new ArrayList<String>();
	 * diferenceArray.addAll(list1); diferenceArray.removeAll(list2);
	 * 
	 * System.out.println("Joined ArrayLists: " + joinedArray);
	 * System.out.println("Intersect ArrayLists: " + intersectArray);
	 * System.out.println("Diference ArrayLists: " + diferenceArray); }
	 */
	
	public static <T> Set<T> union (Set<T> a, Set<T> b){
		Set<T> res =new HashSet<T>(a);
		res.addAll(b);
		return res;
	}
	
		
	}

			
			

		



