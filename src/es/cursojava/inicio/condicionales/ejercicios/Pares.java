package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIntroduce un número entero: \n");
		scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if (num%2==0) 
			System.out.println(num + " es un número par.");
		else
			System.out.println(num + " es un número impar.");
			

	}

}
