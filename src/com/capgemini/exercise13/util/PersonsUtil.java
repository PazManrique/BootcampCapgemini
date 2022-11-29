package com.capgemini.exercise13.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.exercise13.Person;

public abstract class PersonsUtil {

	public static Map<Integer, Person> getPersons(List<Person> list) {

		Map<Integer, Person> persons = new HashMap<Integer, Person>();
		for (Person p : list) {
			persons.put(p.getFile(), p);

		}
		return persons;

	}
	
	
	

}
