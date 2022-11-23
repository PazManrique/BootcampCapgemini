package com.capgemini.exercise2;

import java.util.Scanner;

public class AlumnGrade {
	public static void main(String[] args) {
		System.out.println("Introduzca un número");
		Scanner sc = new Scanner (System.in);
		int score = sc.nextInt();
		
		sc.close();
		
		  if (score >=0 && score <=50) {
			  System.out.println("Has " + "suspendido");	
		}
		  
		  if (score >=51 && score <=75) {
			  System.out.println("Debes " + "recuperar");	
		}
		  if (score >=76 && score <=90) {
			  System.out.println("Has " + "aprobado");	
		}
		  if (score >=91 && score <=100) {
			  System.out.println("Has " + "aprobado con mérito");	
		}
		  if (score >100 || score <0) {
			  System.out.println("Puntuación inválida");	
		}
		      
		      
		   
	}

}
