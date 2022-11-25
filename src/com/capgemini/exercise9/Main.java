package com.capgemini.exercise9;

import java.util.Date;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		
		Date fechaIngreso1 = new Date(2022,11,18);
		Date fechaIngreso2 = new Date(2022,11,18);
		
		Employee junior = new Employee ( fechaIngreso1, 16000, "Giaco", 30);
		Employee senior = new Employee( fechaIngreso2, 30000, "Giaco2", 35);
		
		if(junior.hashCode() == senior.hashCode())
        {
  
            if(junior.equals(senior))
                System.out.println("Son lo mismo ");
            else
                System.out.println("No son lo mismo");
      
        }
        else
        System.out.println("No son el mismo empleado "); 
    } 
	}


