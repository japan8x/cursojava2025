package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class CadenaInvertida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIntroduce un texto: \n");
		scan = new Scanner(System.in);
		String cadena = scan.nextLine();
		
		String cadenainvertida = "";
		
		int longitud =  cadena.length();
		
		//int longitud =  (int) (cadena.length()-1)/2;
		
		for(int i=0;i<longitud;i++) {
			
			cadenainvertida = cadenainvertida + cadena.charAt(longitud - 1 - i);
			
		}
		
		System.out.println(cadenainvertida);

	}

}
