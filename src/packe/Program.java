package packe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
			CasaApuestas HT = new CasaApuestas();
		
		BufferedReader bf;
	    bf = new BufferedReader(new FileReader("Hash.txt"));
		
		int ApostQ = Integer.parseInt(bf.readLine());

		String [] datosApostador;
		
		for (int i=0; i<ApostQ; i++) {
			
			datosApostador = bf.readLine().split(",");
			 
			if(! HT.Apostadores.containsKey(datosApostador[0])) {
				HT.Apostadores.put(datosApostador[0], datosApostador[1]);
			}
			
			int cant = 0;
			if (HT.Apuestas.containsKey(datosApostador[1])) {
				cant = HT.Apuestas.get(datosApostador[1]);
				cant += Integer.parseInt(datosApostador[2]);
				HT.Apuestas.put(datosApostador[1], cant);
			}
			else if (!HT.Apuestas.containsKey(datosApostador[1])) { 
				HT.Apuestas.put(datosApostador[1], Integer.parseInt(datosApostador[2]));
				
			}
					
	   }
		
	
		System.out.println("-----Apostador---- Equipo------");
		HT.Apostadores.forEach((key, value) ->{
			System.out.println(key + " Apuesta por: " + value);
		});
		
		System.out.println("-------------Apuestas por cada equipo----------");
		HT.Apuestas.forEach((key, value) ->{
			System.out.println(key + " = " + value);
		});
		
	   HT.searchApuesta("A");
  }
}
