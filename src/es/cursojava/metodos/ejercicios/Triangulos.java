package es.cursojava.metodos.ejercicios;

import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String triangulo = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nIntroduce la base del triángulo rectángulo: \n");
		scan = new Scanner(System.in);
		int b = scan.nextInt();
		
		System.out.println("\nIntroduce la altura del triángulo rectángulo: \n");
		scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		triangulo = Triangulos.calcula(b,a);
		
		System.out.println(triangulo);

	}
	
	public static String calcula(double base, double altura) {
		
		String resultado = "";
		
		double area = 0;
		
		double perimetro = 0;
		
		double diagonal = 0;
		
		// Area = Base x Altura / 2
		
		area = base * altura / 2;
		
		resultado += "A := " + area;
		
		// Perímetro = 2 x ( Base + Altura )
		
		perimetro = 2 * ( base + altura );
		
		resultado += "; P := " + perimetro;
		
		// Diagonal = sqrt( Base x Base + Altura x Altura )
		
		diagonal = Math.sqrt( base * base + altura * altura );
		
		resultado += "; D := " + diagonal;
		
		// System.out.println(resultado);
		
		return resultado;
		
	}

}
