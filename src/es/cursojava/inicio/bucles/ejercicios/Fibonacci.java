package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);			
		System.out.println("\nIntroduce el número de términos de la serie de Fibonacci que quieras visualizar: ");
		scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		int a = 0, b = 0, c = 0;	
		
		for (int i=0;i<=numero-1;i++) {
			
			c = a + b; 
			
			System.out.println(c + " = " + a + " + " + b);
										
			switch (i) {
			
				case 0  -> { b = 1; a = 0; }
				case 1  -> { b = 1; a = 1; }
				default -> { b = a; a = c; }
			
			}			
			
		}

	}

}