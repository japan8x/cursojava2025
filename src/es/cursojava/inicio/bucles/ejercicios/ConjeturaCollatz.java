package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class ConjeturaCollatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);			
		System.out.println("\nIntroduce un número: ");
		scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		while (numero!=1) {
			
			if (numero%2==0) {
				numero = numero / 2;
			} else {
				numero = 3*numero + 1;
			}
			
			System.out.println(numero);
			
		}
		
		System.out.println(numero);

	}

}
