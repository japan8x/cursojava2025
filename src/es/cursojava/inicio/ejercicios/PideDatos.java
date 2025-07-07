package es.cursojava.inicio.ejercicios;

import java.util.Scanner;

public class PideDatos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIntroduce Nombre de la calle: \n");
		scan = new Scanner(System.in);
		String nombrecalle = scan.nextLine();
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("\nIntroduce Número de la calle: \n");
		scan1 = new Scanner(System.in);
		int numcalle = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("\nIntroduce Población: \n");
		scan = new Scanner(System.in);
		String poblacion = scan2.nextLine();
		
		System.out.println("\n" + nombrecalle + ", " + numcalle + " " + poblacion);
		
		boolean esGrande = numcalle>100;
		System.out.println("\n¿La calle es grande? " + esGrande);
		
		float ale = (float) Math.random();
		boolean esMayor = ale>0.5;
		
		System.out.println("\n¿" + ale +" es mayor que la mitad? " + esMayor);

	}

}
