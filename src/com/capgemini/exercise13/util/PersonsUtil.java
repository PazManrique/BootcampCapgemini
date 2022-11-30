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
	
	public static  Set<Person> orderPersons(List<Person> list) {

		Set<Person> persons = new TreeSet<Person>();
		
		for (Person person :list){
			persons.add(person);
			
		}
		return persons;
	

	}
	

		
	
		
		
		

	}
	
	
	


