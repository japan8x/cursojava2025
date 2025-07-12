package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class TablasMultiplicarX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nIntroduce un número: \n");
		scan = new Scanner(System.in);
		int numero = scan.nextInt();
			
		for(int i=1;i<=numero;i++) {
			
			System.out.println(" \n  TABLA DEL " + i);				
			System.out.println(" ===================== ");
			
			for(int j=1;j<=10;j++) {
				
				System.out.println("  " + i + " x " + j + " = " + i*j);
								
			}
			
			System.out.println(" ===================== ");
			
		}
			
	}

}
