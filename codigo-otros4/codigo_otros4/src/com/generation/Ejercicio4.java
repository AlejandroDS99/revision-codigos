package com.generation;

import java.util.Scanner; // se hizo la importacion del scanner

public class Ejercicio4 { // se colocó el nombre de la clase
	public static void main(String[] args) { // se añadió el método main
		
	    Scanner lector = new Scanner(System.in);
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String jugador1 = lector.nextLine();
	    
	    Scanner lector2 = new Scanner(System.in); // se añadió la entrada de datos system.in a ambos Scanner
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    String jugador2 = lector2.nextLine();
	    
	    if (jugador1.equals(jugador2)) {
	      System.out.println("Empate");
	    } else {
	    	
		int gana = 2;
	      switch(jugador1) {
	        case "piedra":
	          if (jugador2.equals ("tijeras")) {
	            gana = 1;
	          }
	          break;

	        case "papel":
	          if (jugador2.equals ("piedra")) {
	            gana = 1;
	          }
	          break; // Se agrego el break a los dos primeros casos
	          
	        case "tijera":
	          if (jugador2.equals ("papel")) {
	            gana = 1;
	          } // se completo con ".equals" para poder hacer la comparación con string
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + gana);
	    }
	  

	}

}

/**
 * En general se mejoro el nombre de las variables 
 * para darle un mejor seguimiento a lo  largo del código.
