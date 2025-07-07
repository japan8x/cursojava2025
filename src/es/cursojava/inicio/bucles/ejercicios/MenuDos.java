package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class MenuDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//9. Pintar el menu hasta que se puse la opción de salir. 
		//
		//	1. Pintar Cuadrado
		//	2. Validar email
		//	3. Añadir Alumno
		//	4. Salir
		//
		//	Elige una opción
		//
		//Si se pulsa la opción 1, solicitar el tamaño de los lados de un cuadrado y pintar el cuadrado de la siguiente manera:
		//Por ejemplo si el tamaño es 4:
		//
		//		****
		//		*  *
		//		*  *
		//		****
		
		int opcion = 0;
		
	    do {
	    	
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
			opcion = scan.nextInt();
			
			if (opcion == 1) {
				
				mensaje = "1. Pintar cuadrado.";
				Scanner scanner = new Scanner(System.in);
		        System.out.print("Ingrese el tamaño del lado del cuadrado: ");
		        int lado = scanner.nextInt();

		        for (int i = 0; i < lado; i++) {
		            for (int j = 0; j < lado; j++) {
		                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
		                    System.out.print(" * ");
		                } else {
		                    System.out.print("   ");
		                }
		            }
		            System.out.println();
		        }
		        //scanner.close();
		        // TRIANGULO
		        int altura = lado; // Define la altura del triángulo

		        for (int i = 1; i <= altura; i++) {
		            // Imprime espacios en blanco
		            for (int j = 1; j <= altura - i; j++) {
		                System.out.print(" ");
		            }
		            // Imprime asteriscos
		            for (int k = 1; k <= 2 * i - 1; k++) {
		                System.out.print("*");
		            }
		            System.out.println(); // Salto de línea al final de cada fila
		        }
		        
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
			
        } while (opcion != 4);
		
	}

}
