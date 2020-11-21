package packe;

import java.util.Hashtable;

public class CasaApuestas {
	
      Hashtable <String, String> Apostadores = new Hashtable<String, String>(); //nombre, equipo
	
	  Hashtable <String, Integer> Apuestas = new Hashtable<String, Integer>(); // equipo, apuesta.
	  	 
	  
	  public void searchApuesta(String nombre) {
		if(Apostadores.get(nombre)!= null) {
			System.out.println("El apostador el nombre es: " + nombre +   " le apuesta a: "  + Apostadores.get(nombre));
		} 
		
		else {
			System.out.println("El usuario no esta registrado en el sistema: ");
		}
		  
	  }
		  
}
