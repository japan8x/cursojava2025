package es.cursojava.utils;

import java.util.Scanner;

public class Utilidades {

	public static void pintaMenu(String[] opciones) {
					
		for(int i=0;i<=opciones.length-1;i++) {
			
			System.out.println(opciones[i]);
					
		}
		
		System.out.println("\nIntroduce una opción: ");

	}
	
	public static void pintaMenu(String[] opciones, String texto) {
		
		for(int i=0;i<=opciones.length-1;i++) {
			
			System.out.println(opciones[i]);
					
		}
		
		System.out.println("\n" + texto);

	}
	
	public static int pideDatoNumerico(String texto) {
		
		System.out.println("\n" + texto);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nIntroduce un número: \n");
		scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		return numero;

	}
	
	public static String pideDatoCadena(String texto) {
		
		System.out.println("\n" + texto);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nIntroduce un texto: \n");
		scan = new Scanner(System.in);
		String palabra = scan.nextLine();
		
		return palabra;

	}

}
