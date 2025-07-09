package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class CuentaVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String vocales = "aeiouáéíóúáéíóúäëïöüâêîôû";
		
		char vocal;
		
		int contador = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIntroduce un texto: \n");
		scan = new Scanner(System.in);
		String cadena = scan.nextLine();
		
		int longitud =  cadena.length();
		
        int longitudvocales = vocales.length();
        
		for(int i=0;i<longitudvocales;i++) {
			
			vocal = vocales.charAt(i);
			
			//Usando charAt e indexOf
			for (int j=0; j<cadena.length(); j++) {
				char caracter = cadena.toLowerCase().charAt(j);
				if (caracter==vocal && j!=cadena.indexOf(caracter)) {
					//cadena = cadena.substring(0, i) + cadena.substring(i+1,cadena.length());
					contador += 1;
				}
					
				System.out.println(caracter + " , " + contador + " vocales.");
			
				
			}
			
		}
		

		//if (cadena.toLowerCase().equals(cadena.toLowerCase())) {
			
			System.out.println(cadena + " tiene " + contador + " vocales.");
			
		//}
		
		//System.out.println(cadena);
		//System.out.println(cadenainvertida);		

	}

}
