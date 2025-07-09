package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class Palindromos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIntroduce un texto: \n");
		scan = new Scanner(System.in);
		String cadena = scan.nextLine();
		
		String palindromo = cadena;
		
		String cadenainvertida = "";
		
		int longitud =  cadena.length();
		
		for(int i=0;i<longitud;i++) {
			
			cadenainvertida = cadenainvertida + cadena.charAt(longitud - 1 - i);
			
		}
		
		//Usando charAt e indexOf
		for (int i=0; i<cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			if (caracter==' ' && i==cadena.indexOf(" ")) {
				cadena = cadena.substring(0, i) + cadena.substring(i+1,cadena.length());
			}
		}
		
		//Usando charAt e indexOf
		for (int i=0; i<cadenainvertida.length(); i++) {
			char caracter = cadenainvertida.charAt(i);
			if (caracter==' ' && i==cadenainvertida.indexOf(" ")) {
				cadenainvertida = cadenainvertida.substring(0, i) + cadenainvertida.substring(i+1,cadenainvertida.length());
			}
		}
		
		if (cadenainvertida.toLowerCase().equals(cadena.toLowerCase())) {
			
			System.out.println(palindromo + " es un palindromo.");
			
		} else {
			
			System.out.println(palindromo + " no es un palindromo.");
			
		}
		
		//System.out.println(cadena);
		//System.out.println(cadenainvertida);

	}

}
