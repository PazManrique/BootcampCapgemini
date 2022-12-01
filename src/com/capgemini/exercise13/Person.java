package com.capgemini.exercise13;



import java.util.Objects;

public class Person implements Comparable <Person> {
	private int file;
	private Integer age;
	private String name;
	
	
	public Person() {
		super();
		
	}


	public Person(int file, int age, String name) {
		super();
		this.file = file;
		this.age = age;
		this.name = name;
	}


	/**
	 * @return the file
	 */
	public int getFile() {
		return file;
	}


	/**
	 * @param file the file to set
	 */
	public void setFile(int file) {
		this.file = file;
	}


	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, file, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && file == other.file && Objects.equals(name, other.name);
	}


	@Override
	public String toString() {
		return "Person [file=" + file + ", age=" + age + ", name=" + name + "]";
	}







	


	@Override
	public int compareTo(Person o) {
		
		return age.compareTo(o.getAge());
	}
	
	



}
