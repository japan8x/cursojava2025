package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numult3 = 0, numult5 = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=1;i<=10;i++) {
			
			System.out.println("\nIntroduce el número " + i + ": \n");
			scan = new Scanner(System.in);
			int numero = scan.nextInt();
			
			if (numero%3 == 0) {
				numult3 += 1;
			}
			
			if (numero%5 == 0) {
				numult5 += 1;
			}			
			
		}
		
		System.out.println("De los 10 números introducidos ");
		System.out.println(numult3 + " son múltiplos de 3,");
		System.out.println(numult5 + " son múltiplos de 5.");

	}

}
