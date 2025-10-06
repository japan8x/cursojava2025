package es.cursojava.metodos.ejercicios;

import java.util.Scanner;

public class Rectangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String triangulo = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nIntroduce la base del rectángulo: \n");
		scan = new Scanner(System.in);
		int b = scan.nextInt();
		
		System.out.println("\nIntroduce la altura del rectángulo: \n");
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
		
		// Area = Base x Altura 
		
		area = base * altura;
		
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
