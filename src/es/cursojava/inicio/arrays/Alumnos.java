package es.cursojava.inicio.arrays;

import java.util.Scanner;

public class Alumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador = 0;
		
		double media = 0.0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\n¿Cuántos alumnos tienes en clase?\n");
		scan = new Scanner(System.in);
		 
		int numero = scan.nextInt();
		
		int [] notas = new int[numero];
		
		for(int i=0;i<numero;i++) {
			
			Scanner scan2 = new Scanner(System.in);
			System.out.println("\n¿Introduce la nota del alumno " + (i+1) + "?\n");
			scan2 = new Scanner(System.in);
			
			notas[i] = scan2.nextInt();
			
		}
		
		for(int i=0;i<numero;i++) {
			
			media += notas[i];
			
			if (notas[i]>=5) {
				contador++;
			}
			
		}
		
		media /= numero;
		
		System.out.println("Los alumnos de la clase 5A son " + numero +"\n");
		System.out.println("En la clase 5A han aprobado " + contador + " alumnos.\n");
		System.out.println("La nota media de la clase 5A es " + media + "\n");
		
	}

}
