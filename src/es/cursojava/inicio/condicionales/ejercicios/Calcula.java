package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Calcula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float resultado = 0;
			
		Scanner scan1 = new Scanner(System.in);
		System.out.println("\nIntroduce primer operando: \n");
		scan1 = new Scanner(System.in);
		float operando1 = scan1.nextInt();

		Scanner scan2 = new Scanner(System.in);
		System.out.println("\nIntroduce segundo operando: \n");
		scan2 = new Scanner(System.in);
		float operando2 = scan2.nextInt();
		
        //Initializing input
        Scanner input = new Scanner(System.in);
        System.out.print("\nIntroduce el operador (+,-,*,/): \n");

        //Using next().charAt(0) to Accept Char Input
        char operador = input.next().charAt(0);
        
        if (operador == '+') {
        	resultado = operando1 + operando2;
        } else if (operador == '-') {
            resultado = operando1 - operando2;
        } else if (operador == '*') {
            resultado = operando1 * operando2;
        } else if (operador == '/') {
            resultado = operando1 / operando2;
        } else {
        	
        }
        
        //Printing the Contents of 'a'
        System.out.println(" Resultado: " + resultado);
        	
	}

}
