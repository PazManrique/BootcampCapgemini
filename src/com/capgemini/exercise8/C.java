package com.capgemini.exercise8;

import com.capgemini.exercise8.exceptions.ExceptionA;

public class C {
	
	public static void main(String[] args) {

		
	try {
		A.a();
	} catch (ExceptionA e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	A.b();

}

	
}
