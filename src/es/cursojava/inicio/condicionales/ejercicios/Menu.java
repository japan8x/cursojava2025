package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
//		EJERCICIO 4
//		===============================================
//		Pintar menu
//		1. Pintar Cuadrado
//		2. Validar email
//		3. Añadir Alumno
//		4. Salir
//
//		Elige una opción
//
//		Se pide la opción por teclado, dependiendo de la opción introducida le indicamos la que ha seleccionado, 
//		si selecciona la 4 le decimos "Adios!" y si no es ninguna de las que existe que se ha equivocado
		
		String mensaje = "";
		
		System.out.println("\nMENÚ");
		System.out.println("\n====");
		System.out.println("\n1. Pintar Cuadrado.");
		System.out.println("\n2. Validar email.");
		System.out.println("\n3. Añadir Alumno.");
		System.out.println("\n4. Salir.");
		System.out.println("\n");
		System.out.println("\nElige una opción: ");
		System.out.println("\n");
		
		Scanner scan = new Scanner(System.in);
		//System.out.println("\nIntroduce Nombre de Alumno: \n");
		scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		
		if (opcion == 1) {
			mensaje = "1. Pintar cuadrado.";
		} else if (opcion == 2) {
			mensaje = "2. Validar email.";
		} else if (opcion == 3) {	
			mensaje = "3. Añadir Alumno.";		
		} else if (opcion == 4) {	
			mensaje = "¡Adiós!";
		} else {
			mensaje = "equivocada.";
		}
		
		System.out.println("La opción elegida es " + mensaje);
		
	}

}
