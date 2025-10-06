package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class Colegio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] aulas = new String [2] [3];
		
		for (int i=0;i<aulas.length;i++) { 
			
			for (int j=0;j<aulas[i].length;j++) {	
	
	        	aulas[i][j] = null;
        
			}
			
		}
		
		int opcion = 0;
		
	    do {
	    	
	    	System.out.println("\033[H\033[2J");  
	    	System.out.flush(); 
	    	
			String mensaje = "";
			
			System.out.println("\nGESTIÓN DE ALUMNOS EN COLEGIO");
			System.out.println("\n=============================");
			System.out.println("\n1. Insertar alumnos.");
			System.out.println("\n2. Mostrar alumnos.");
			System.out.println("\n3. Buscar alumno.");
			System.out.println("\n4. Borrar alumno.");			
			System.out.println("\n5. Salir.");
			System.out.println("\n");
			System.out.println("\nElige una opción: ");
			System.out.println("\n");
			
			Scanner scan = new Scanner(System.in);
			scan = new Scanner(System.in);
			opcion = scan.nextInt();
			
			switch (opcion) {
				case 1 -> { mensaje = " 1. Insertar alumnos."; }
				case 2 -> { mensaje = " 2. Mostrar alumnos."; }
				case 3 -> { mensaje = " 3. Buscar alumno."; }
				case 4 -> { mensaje = " 4. Borrar alumno."; }			
				case 5 -> { mensaje = " 5. Salir."; }
			}
			
			System.out.println("\nLa opción elegida es " + mensaje + "\n");		
			
			if (opcion == 1) {
				
				for (int i=0;i<aulas.length;i++) { 
					
					for (int j=0;j<aulas[i].length;j++) {	
							        
				        if (aulas[i][j]==null) {
							Scanner scanner = new Scanner(System.in);
					        System.out.println("\nIntroduce el Nombre del Alumno " + (j+1) + " del aula " + (i+1) + ": \n");
							scanner = new Scanner(System.in);
					        String nomAlumno = scanner.nextLine();
				        	aulas[i][j] = nomAlumno;
				        }
		        
					}
					
				}
		        
			} else if (opcion == 2) {
				
				for (int i=0;i<aulas.length;i++) { 
					
					System.out.println(" Aula " + (i+1));
					System.out.println("========");
					
					for (int j=0;j<aulas[i].length;j++) {	
			
				        if (aulas[i][j] != null) { 
				        	System.out.println("\nNombre del Alumno " + (j+1) + ": " + aulas[i][j] + " \n");
				        }
		        
					}
					
				}
				
			} else if (opcion == 3) {	
				//mensaje = "3. Buscar alumno.";	
				
				Scanner scanner = new Scanner(System.in);
		        System.out.println("\nBusca el Nombre del Alumno: \n");
				scanner = new Scanner(System.in);
		        String cadena = scanner.nextLine();
		        
				for (int i=0;i<aulas.length;i++) { 
					
					System.out.println(" Aula " + (i+1));
					System.out.println("=========");
					
					for (int j=0;j<aulas[i].length;j++) {	
			
				        if ((aulas[i][j] != null) && (!cadena.isEmpty())) {
							if (aulas[i][j].contains(cadena)) {						
				        	    System.out.println("\nNombre del Alumno " + (j+1) + ": " + aulas[i][j] + " \n");
							}
				        }
		        
					}
					
				}
		        
			} else if (opcion == 4) {	
				//mensaje = "4. Borrar alumno.";
				
				Scanner scanner = new Scanner(System.in);
		        System.out.println("\nBorra el Nombre del Alumno: \n");
				scanner = new Scanner(System.in);
		        String cadena = scanner.nextLine();
		        
				for (int i=0;i<aulas.length;i++) { 
					
					System.out.println(" Aula " + (i+1));
					System.out.println("=========");
					
					for (int j=0;j<aulas[i].length;j++) {	
			
						
				        if ((aulas[i][j] != null) && (aulas[i][j].contains(cadena))) {
			        	    System.out.println("\n¿Borrar Nombre del Alumno " + (j+1) + " del aula " + aulas[i][j] + "?\n");
							if (aulas[i][j].equals(cadena)) {	
				        	    System.out.println("\nNombre del Alumno " + (j+1) + ": " + aulas[i][j] + " borrado.\n");
				        	    aulas[i][j] = null;
							}
				        }
		        
					}
					
				}				
				
			} else if (opcion == 5) {	
				//mensaje = "5. Salir.";
				
				
			} else {
				//mensaje = "equivocada.";
			}	
			
        } while (opcion != 5);
		
	}

}
