package com.capgemini.exercise13.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.capgemini.exercise13.Person;
import com.capgemini.figures.Figure;

public abstract class PersonsUtil {

	public static Map<Integer, Person> getPersons(List<Person> list) {

		Map<Integer, Person> persons = new HashMap<Integer, Person>();
		for (Person p : list) {
			persons.put(p.getFile(), p);

		}
		return persons;

	}
	
	public static  Set<Integer> orderPersons(List<Person> list) {

		Set<Integer> persons = new TreeSet<Integer>();
		
		for (Person person :list){
			persons.add(person.getAge());
			
		}
		return persons;
	

	}
	

		
	
		
		
		

	}
	
	
	


