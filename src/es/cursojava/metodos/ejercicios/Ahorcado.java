package es.cursojava.metodos.ejercicios;

import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		do {
			
			System.out.println(oracion);
			System.out.println(oracionoculta);
			
			String cadena = "";
			
			letra = pideLetra();
			
			cadena += letra;
			
			if (oracion.contains(cadena)) {
				
				oracionoculta = sustituyeLetraEnFrase(letra,oracion);
				
			} else {
				
				System.out.println("¡Fallo en la letra elegida");
				
			}
			
			//System.out.println(oracion);
			//System.out.println(oracionoculta);			
			
		} while (letra!='0');
		
		System.out.println(oracion);
		System.out.println(oracionoculta);
		
	}
	
	public static String generarFrase(String[] palabras) {
		
		String frase = "";
		
		int ale = (int) (Math.random()*palabras.length);
		
		frase += palabras[ale];
		
		return frase;
		
	}
	
	public static String generarFraseOculta(String f) {
		
		String frase = "";
		String l = "";
		
		for (int i=0;i<f.length();i++) {
			
			l = f.substring(i);
			
			if (l == " ") {
				
				frase += "_";
				
			} else {
				
				frase += "-";
				
			}
			
		}
		
		return frase;
		
	}
	
	public static char pideLetra() {
		
        Scanner input = new Scanner(System.in);
        System.out.print("\nIntroduce una letra: \n");
        char car = input.next().charAt(0);
        
        return car;
        
	}
	
	public static String sustituyeLetraEnFrase(char letra, String frase) {
		
		String ora = "";
		
		//Usando charAt e indexOf
		for (int i=0; i<frase.length(); i++) {
			
			char caracter = frase.charAt(i);

			if (caracter==letra && i==frase.indexOf(letra)) {
				//System.out.println("Posición "+i);
				ora = frase.substring(0, i-1)+letra+frase.substring(i+1, frase.length()-1);
				break;
				
			}
			
		}
		
		return ora;
		
	}
	
}
