package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class NotaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float suma = 0, notamedia = 0;
		
		Scanner scan = new Scanner(System.in);			
		System.out.println("\nIntroduce el número de alumnos: ");
		scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		
		for(int i=1;i<=numero;i++) {
			
			System.out.println("\nIntroduce la nota del alumno " + i + ": \n");
			scan2 = new Scanner(System.in);
			int nota = scan2.nextInt();
			
			suma = suma + nota;
					
		}
		
		notamedia = suma / numero;
		
		System.out.println("La nota media es " + notamedia);

	}

}
