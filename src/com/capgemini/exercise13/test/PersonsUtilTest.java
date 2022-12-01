package com.capgemini.exercise13.test;


import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;




import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.exercise13.Person;
import com.capgemini.exercise13.util.PersonsUtil;


class PersonsUtilTest {
	
	Person person1;
	Person person2;
	Person person3;

	
	List<Person> listTest;
	
	

	@BeforeEach
	void setUp() throws Exception {
		listTest = new ArrayList < Person> ();
        listTest.add(new Person(101, 23, "Jos"));
        listTest.add(new Person(103, 27, "Clara"));
        listTest.add(new Person(102, 25, "Ana"));
    
        person1 = new Person(102, 25, "Ana");
        person2 = new Person(101, 23, "Jos");
        person3 = new Person(103, 27, "Clara");
        
      
	
	}

	@AfterEach
	void tearDown() throws Exception {
		person1=null;
		person2=null;
		person3=null;
		listTest =null;
	}

	

	
	@Test
	void testgetPersonas_true() {
		 Map<Integer, Person> expected = new HashMap<Integer, Person>();
		 expected.put(person1.getFile(), person1);
		 expected.put(person2.getFile(), person2);
		 expected.put(person3.getFile(), person3);
		 assertEquals(expected, PersonsUtil.getPersons(listTest));
	  
	}
	
	@Test
	void testgetPersonas_false() {
		 
		person1.setName("Gabrielito");
		Map<Integer, Person> expected = new HashMap<Integer, Person>();
		 expected.put(person1.getFile(), person1);
		 expected.put(person2.getFile(), person2);
		 expected.put(person3.getFile(), person3);
		 assertNotEquals(expected, PersonsUtil.getPersons(listTest));
	  
	}
	
	
	
	
	@Test
	void testOrderPersonas_true() {
		 
		Set<Person> expected = PersonsUtil.orderPersons(listTest);
		Iterator<Person> it = expected.iterator();
		assertEquals(person2, it.next());
		assertEquals(person1, it.next());
		assertEquals(person3, it.next());

		
	  
	}
	
	
	


}
