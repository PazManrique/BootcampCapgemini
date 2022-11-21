package modulo1;

import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = (int)(Math.random()*100);
		int user;
		int i;
		int attemps = 10;
		
		
		System.out.println(number);
		System.out.println("Intenta acertar al número en 10 o menos intentos. Recuerda que debe ser un número entre 0 y 100");
		
		for ( i = 1; i <= attemps; i++) {
			 
            System.out.println(
                "Adivina el número:");
 
          
            user = sc.nextInt();
            int left = 10 - i;
           
 
         
            if (number == user) {
                System.out.println("Felicidades, has ganado!");
                System.out.println("Los has logrado en " + i + " intentos");
                break;
            }
            else if (number > user) {
                System.out.println(
                    "El número es mayor que  " + user);
                System.out.println("Te quedan " + left + " intentos");
            }
            else if (number < user) {
                System.out.println(
                		 "El número es menor que  " + user);
                System.out.println("Te quedan " + left + " intentos");
            }
        }
 
        if (i == attemps) {
            System.out.println(
                "Has perdido, Has agotado todos los intentos.");
 
            System.out.println(
                "El número era" + number);
        }
    }
		
	}

