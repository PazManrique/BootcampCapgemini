package com.capgemini.exercise8;

import com.capgemini.exercise8.exceptions.ExceptionA;

public class C {
	
	public static void main(String[] args) {
		A a1 = new A();
		
	try {
		a1.a();
	} catch (ExceptionA e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		

}

	
}
