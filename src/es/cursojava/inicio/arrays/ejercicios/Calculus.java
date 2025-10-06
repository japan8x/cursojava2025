package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class Calculus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char opera[] = args[0].toCharArray();
		
		char operador = 0;
		
		float operando = Float.parseFloat(args[1]);
			
		float resultado = operando;
		
		if (args.length < 3) {
			System.out.println("Número de argumentos insuficientes.");
		} else {		
		
			if (opera.length == 1) {
				
				operador = opera[0];
				
			} else {
				
				System.out.println("Operador demasiado largo.");
			}			
				
			for(int i=2;i<args.length;i++) {
				
				operando = Float.parseFloat(args[i]);
				
		        if (operador == '+') {
		        	resultado = resultado + operando;
		        } else if (operador == '-') {
		        	resultado = resultado - operando;
		        } else if (operador == '*') {
		        	resultado = resultado * operando;
		        } else if (operador == '/') {
		        	resultado = resultado / operando;
		        } else {
		        	System.out.println("No es un operador permitido (+,-,*,/).");
		        }
				
			}
		
		}
        
        //Printing the Contents of 'a'
        System.out.println(" Resultado: " + resultado);
        	
	}

}
