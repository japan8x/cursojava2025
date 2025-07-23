package es.cursojava.metodos.ejercicios;

import java.util.Scanner;

public class TablasMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nIntroduce un número: \n");
		scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		TablasMultiplicar.tablaMultiplicar(numero);
		
		//Scanner scan = new Scanner(System.in);
		
		System.out.println("\nIntroduce el primer número entero: \n");
		scan = new Scanner(System.in);
		int numero1 = scan.nextInt();
		
		System.out.println("\nIntroduce el segundo número entero: \n");
		scan = new Scanner(System.in);
		int numero2 = scan.nextInt();
		
		TablasMultiplicar.tablaMultiplicar(numero1, numero2);

	}
	
	public static void tablaMultiplicar(int entero) {
		
		System.out.println(" \n  TABLA DEL " + entero);				
		System.out.println(" ===================== ");
		
		for(int i=1;i<=10;i++) {
				
				System.out.println("  " + i + " x " + entero + " = " + i*entero);
				
		}
		
		System.out.println(" ===================== ");
		
	}

	public static void tablaMultiplicar(int entero1, int entero2) {	
		
		int auxiliar = 0;
		
		Scanner scan = new Scanner(System.in);
		
		if (entero1 >= entero2) {
			
			auxiliar = entero1;
			
			entero1 = entero2;
			
			entero2 = auxiliar;
			
		}
		
		for(int i=entero1;i<=entero2;i++) {
			
			System.out.println(" \n  TABLA DEL " + i);				
			System.out.println(" ===================== ");
			
			for(int j=1;j<=10;j++) {
				
				System.out.println("  " + i + " x " + j + " = " + i*j);
								
			}
			
			System.out.println(" ===================== ");
			
		}
		
	}
	
}
