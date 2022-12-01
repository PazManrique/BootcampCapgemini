package com.capgemini.exercise11;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {

	public static void main(String[] args) {
		
		/*
		 * cal.set(1985, Calendar.SEPTEMBER , 29);
		 * 
		 * // cal.add(Calendar.DATE, 3); SimpleDateFormat sdf = new
		 * SimpleDateFormat("dd/MM/yyyy EEEEE");
		 * System.out.println("La fecha de nacimiento de Paz es " +
		 * sdf.format(cal.getTime()));
		 * 
		 * 
		 * System.out.println("datos a obtener");
		 * System.out.println("El año de nacimiento es " + cal.get(Calendar.YEAR));
		 * System.out.println("El mes de nacimiento es " + (cal.get(Calendar.MONTH)+
		 * 1)); System.out.println("El día de nacimiento es " + cal.get(Calendar.DATE));
		 * System.out.println("El día de la semana  era " +
		 * cal.get(Calendar.DAY_OF_WEEK));
		 */
		
		System.out.println("Ingrese un año");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println("Ingrese el mes");
		int month = sc.nextInt();
		/*
		 * System.out.println("Día a resaltar"); int heightLightDay = sc.nextInt();
		 */
		
		
		

		
		   if ( month < 1 || month > 12)
               System.out.print("Mes no válido, intenta nuevamente");
           else
        	   calendarPrint((month), year);
		
	}
	
	  static void calendarPrint (int m, int y) { 
          int startDay = getStartDay(m, y);
          int numDaysInMonths = getNumDaysInMonth(m, y);

          printMonthHeader(m, y);
          printMonthBody(startDay, numDaysInMonths);
      	Calendar cal = Calendar.getInstance();
    	int actualDay = cal.get(Calendar.DAY_OF_MONTH);
    	System.out.println("\nLa fecha actual es" + actualDay);
		
      }

      static void printMonthBody (int startDay, int numDaysInMonths) { //Display the days in the calendar

          int i;

          for (i = 0; i <= startDay; i++)
              System.out.print(" ");

          for (i = 1; i <= numDaysInMonths; i++) {
              if ( i < 10 )
                  System.out.print("   " + i );
              else
                  System.out.print("  " + i );

              if ((startDay + i) % 7 == 0)
                  System.out.println();
             
              
          }
          System.out.println();
      }

      static void printMonthHeader (int m, int y) { //Display the header information
          System.out.println("\t" + getMonthName(m) + " " + y);
          System.out.println("------------------------------");
          System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
      }

      static  String getMonthName (int m) {
          String monthName = null;
          switch (m) {
              case 1: monthName = "January";
              break;
              case 2: monthName = "February";
              break;
              case 3: monthName = "March";
              break;
              case 4: monthName = "April";
              break;
              case 5: monthName = "May";
              break;
              case 6: monthName = "June";
              break;
              case 7: monthName = "July";
              break;
              case 8: monthName = "August";
              break;
              case 9: monthName = "September";
              break;
              case 10: monthName = "October";
              break;
              case 11: monthName = "November";
              break;
              case 12: monthName = "December";
          }
          return monthName;
      }
//      private static int getNumDaysInMonth(int pMes, int pAnio) {
//   	   Calendar cal = Calendar.getInstance();
//      	   cal.set(pAnio, pMes, 1);
//      	   int ultimoDia =1;
//      	   
//      	   while(cal.get(Calendar.MONTH) == pMes) {
//      		   ultimoDia =cal.get(Calendar.DATE);
//      		   cal.add(Calendar.DATE, 1);
//      	   }
//      		   
//   	   return ultimoDia;
//      
//      }



		
		  static int getNumDaysInMonth (int m, int y) { int numDaysInMonths= 0; switch
		  (m) { case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		  numDaysInMonths= 31; break; case 4: case 6: case 9: case 11: numDaysInMonths
		  = 30; break; case 2: if (isLeapYear(y)) numDaysInMonths = 29; else
		  numDaysInMonths = 28; break; } return numDaysInMonths; }
		  
		  static boolean isLeapYear (int y) { return (y % 400 == 0) || (y % 4 == 0 && y
		  % 100 != 0);} // return true; // return false; }
		 

      static int getStartDay (int m, int y) {
          // Adjust month number & year to fit Zeller's numbering system
          if (m < 3)
              m = m + 12;
              y = y - 1;

          int d = 1; //Set day parameter to 1
          int k = y % 100;      // Calculate year within century
          int j = y / 100;      // Calculate century term
          int h = 0;            // Day number of first day in month 'm'

          h = ( d + ( 13 * ( m + 1 ) / 5 ) + k + ( k / 4 ) + ( j / 4 ) + ( 5 * j ) ) % 7;

          // Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
          int dayNum = ( ( h + 5 ) % 7 ) + 1;
          return dayNum;
      }
      
    
    
      }
      

