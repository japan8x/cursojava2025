package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ruleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int opcion = 0;
        
        int credito = 500, apuesta = 0;
        
        int numero = 0, ruleta = 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                               
        int premio = 0;
		
		do {
	    	
			String mensaje = "";
			
			System.out.println("\nMENÚ");
			System.out.println("\n====");
			System.out.println("\n1. Número.");
			System.out.println("\n2. Par / Impar.");
			System.out.println("\n3. Bloques.");
			System.out.println("\n4. Salir.");
			System.out.println("\n");
			System.out.println("\nElige una opción: ");
			System.out.println("\n");
			
			Scanner scan = new Scanner(System.in);
			scan = new Scanner(System.in);
			opcion = scan.nextInt();
			
			if (opcion == 1) {
				
				mensaje = "1. Número.";
				
				
				do {
					
					Scanner scan0 = new Scanner(System.in);
					System.out.println("\n¿Cuánto quieres apostar a la ruleta de 0 a " + credito + "?\n");
					scan0 = new Scanner(System.in);
					apuesta = scan0.nextInt();
					
					System.out.println("\nLa apuesta es mayor que el crédito disponible.\n");
								
				} while (apuesta>credito);
						
				do {
					
					do {
					
						Scanner scan6 = new Scanner(System.in);
						System.out.println("\n¿A qué número entre 1 y 36 quieres apostar en la ruleta?\n");
						scan6 = new Scanner(System.in);
						
						numero = scan6.nextInt();
						
					} while ((numero <= 1) || (numero >= 36 ));
										
				} while (apuesta>credito);					
				     
			} else if (opcion == 2) {
				mensaje = "2. Par / Impar.";
			} else if (opcion == 3) {	
				mensaje = "3. Bloques.";		
			} else if (opcion == 4) {	
				mensaje = "¡Adiós!";
			} else {
				mensaje = "equivocada.";
			}
			
			System.out.println("La opción elegida es " + mensaje);
			
			ruleta = (int) (37*Math.random());
			
			if (numero == ruleta) {
				premio = apuesta*11;
				System.out.println("\n¡¡¡Premio!!!: " + premio);
				credito += premio;
			} else {
				credito -= apuesta;
			}			
			
			if (credito>0) {
				Scanner scan1 = new Scanner(System.in);
				System.out.println("\n¿Quieres volver a apostar a la ruleta?\n");
				scan1 = new Scanner(System.in);
				opcion = scan1.nextInt();
				System.out.println("\nSu crédito es " + credito + "€.\n");
			} else {
				System.out.println("\nSe ha queado sin dinero.\n");
			}
	        
		} while ((opcion != 4) || (credito == 0));

	}

}
