package es.cursojava.metodos.ejercicios;

import java.util.Scanner;

import es.cursojava.utils.Utilidades;

public class Ahorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean resuelto = false;
		
		int contadorfallos = 0;
		
		char letra = '0';
		
		String[] sujetos = {
			    "El gato", "La niña", "Mi amigo", "Un hombre", "La policía", "El perro",
			    "La profesora", "Un payaso", "El médico", "La madre", "El robot", "Mi vecino"
		};

		String[] verbos = {
		    "come", "pinta", "busca", "rompe", "salta", "canta",
		    "lava", "lee", "mueve", "atrapa", "conduce", "enciende"
		};

		String[] complementos = {
		    "una manzana", "la casa", "el coche", "una canción", "el jardín", "la calle",
		    "el balón", "un sombrero", "la ventana", "la lámpara", "el periódico", "el fuego"
		};
		
		String oracion = generarFrase(sujetos) + " " + generarFrase(verbos) + " " + generarFrase(complementos);
		String oracionoculta = generarFraseOculta(oracion);
		
		oracion = oracion.toUpperCase();
		oracionoculta = oracionoculta.toUpperCase();
		
		oracion = oracion.replace(' ', '_');
		
		do {
			
			Utilidades.clearScreen();
			
			System.out.println(oracion);
			System.out.println(oracionoculta);
			
			String cadena = "";
			
			letra = pideLetra();
			
			cadena += letra;
			
			if (oracion.contains(cadena)) {
				
				oracionoculta = sustituyeLetraEnFrase(letra,oracion,oracionoculta);
				
			} else {
				
				System.out.println("¡Fallo en la letra elegida!");
				
				++contadorfallos;
				
				System.out.println();				
				System.out.println("Número de fallos = " + contadorfallos);
				System.out.println();
				
				pintaAhorcado(contadorfallos);
				
			}
			
			if (oracionoculta.equals(oracion)) {
				
				resuelto = true;
				
			}
			
			//System.out.println(oracion);
			//System.out.println(oracionoculta);
			
		} while ((contadorfallos<6) && (!resuelto));		
		
		if (contadorfallos>=6) {
			
			System.out.println("¡Ahorcado!");
			
		} else {
			
			System.out.println("¡Te salvaste de ser ahorcado!");
			
		}
		
	}
	
	public static String generarFrase(String[] palabras) {
		
		String frase = "";
		
		int ale = (int) (Math.random()*palabras.length);
		
		frase += palabras[ale];
		
		return frase;
		
	}
	
	public static String generarFraseOculta(String frase) {
		
		String f = "";
		char l;
		
		for (int i=0;i<frase.length();i++) {
			
			l = frase.charAt(i);
			
			if (l == ' ') {
				
				f += "_";
				
				
			} else {
				
				f += "-";
				
			}
			
		}
		
		return f;
		
	}
	
	public static char pideLetra() {
		
        Scanner input = new Scanner(System.in);
        System.out.print("\nIntroduce una letra: \n");
        char car = input.next().charAt(0);
        
        return car;
        
	}
	
	public static String sustituyeLetraEnFrase(char letra, String frase, String fraseoculta) {
		
		String oracion = "";
		
		for (int i=0; i<frase.length(); i++) {
			
			char caracter = frase.charAt(i);

			if (caracter==letra) // && i==frase.indexOf(letra)) 
				{
				//System.out.println("Posición "+i);
				fraseoculta = fraseoculta.substring(0, i)+letra+fraseoculta.substring(i+1, fraseoculta.length());
				//break;
				
			}
			
		}
		
		oracion = fraseoculta;
		
		return oracion;
		
	}
	
	public static void pintaAhorcado(int numerofallos) {
		
		String linea[] = new String[6];
		
		linea[0] = "  ╔════╦═══  ";
		linea[1] = "  ║    O     ";
		linea[2] = "  ║   ───    ";
		linea[3] = "  ║    │     ";
		linea[4] = "  ║   │ │    ";
		linea[5] = "  ║          ";
		 
		for(int i=6-numerofallos;i<6;i++) {
			
			System.out.println(linea[i]);
			
		}
		
		System.out.println();
			
	}
	
}
