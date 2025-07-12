package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class ValidarEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean correcto = true;
		
		int contador = 0;
		int contador2 = 0;
		
		int posicion = 0, posicion2 = 0;
		
		do {	
			
			String subcadena = "";
			
			Scanner scan = new Scanner(System.in);
			System.out.println("\nIntroduce un texto: \n");
			scan = new Scanner(System.in);
			String cadena = scan.nextLine();
	
		        if (cadena.isEmpty()) {
		        	
		        	System.out.println("El campo está vacío.");
		        	correcto = false;
		        	break;
		        	
		        } else if (cadena.isBlank()) {
		        	
		        	System.out.println("El campo tiene espacios en blanco.");
		        	correcto = false;
		        	break;
		        	
		        } else if (!cadena.contains("@")) {
		    		
		        	System.out.println("El campo no contiene el caracter @.");
		        	correcto = false;
		        	break;
		    		
		        } else if (cadena.contains("@")) {
		        	
		    		for (int i=0; i<cadena.length(); i++) {
		    			char caracter = cadena.charAt(i);
		    			posicion = cadena.indexOf("@");
		    			if (caracter=='@') {
		    				contador += 1;	    			
		    			}
		    		}
		    		
    				if (contador > 1) {
    		        	System.out.println("El campo contiene más de una @.");
    					correcto = false;
    				    break;
    				} else if (contador == 1) {
    					subcadena = cadena.substring(posicion+1);
    					//posicion = cadena.indexOf(".");
    		        	//System.out.println("---@" + subcadena);
    					
    					if (subcadena.contains(".")) {
    			        	
    			        	contador2 = 0;   			        	
    			        	posicion = 0;      	
    			        	System.out.println("---@" + subcadena);
    			        	
    			    		for (int i=0; i<subcadena.length(); i++) {
    			    			char caracter = subcadena.charAt(i);
    			    			posicion2 = subcadena.indexOf(".");
    			    			if ((caracter=='.') && i!=subcadena.indexOf(".")) {
    			    				contador2 += 1;
    			    				//posicion2 = i;  	
    			    				if ((contador2 == 1) && (posicion2 >= 2)) {
    			    					correcto = true;
    			    				} else {
    	    	    		        	System.out.println("Después del carácter arroba (@) hay menos de 2 caracteres.");
    	    	    					correcto = false;
    			    				} 		    				
    			    			}
    			    			
    			    		}
    			    		
//    	    				if ((contador2 >= 1) && ((posicion2 >= 2) && (posicion2 <= 6))) {
//    	    					correcto = true;
//    	    				} else {
//    	    		        	System.out.println("Después del último carácter punto (.) hay menos de 2 caracteres o más de 6 caracteres.");
//    	    					correcto = false;
//    	    				} 
    	    				
    			        } else {
    			        	System.out.println("El campo no contiene almenos un carácter punto (.) después de la @.");
    						correcto = false;	        	
    			        }
    				}	
	  	          	
		        } 
	        
		} while (correcto == false);
		
		System.out.println("Fin.");
		
		//cadena = "";
		
	}

}
