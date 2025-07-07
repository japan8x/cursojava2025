package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class NotasAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 2
		//+ Declarar la variables asignatura de tipo String, nombreAlumno de tipo String y nota de tipo int
//		+ Inicializar las variables con valores inventados
//		+ El resultado a mostrar sería: El alumno Juan en la asignatura Matemáticas tiene un Notable
//
//		0 <5 suspenso
//		5 <7 aprobado
//		7 <9 notable
//		9-10 sobresaliente
		
		String calificacion = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIntroduce Nombre de la asignatura: \n");
		scan = new Scanner(System.in);
		String asignatura = scan.nextLine();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("\nIntroduce nota: \n");
		scan = new Scanner(System.in);
		String nomAlum = scan2.nextLine();
			
		Scanner scan1 = new Scanner(System.in);
		System.out.println("\nIntroduce Nombre de Alumno: \n");
		scan = new Scanner(System.in);
		int nota = scan.nextInt();
		
		if (nota<5) {
			calificacion = "suspenso";
		} else if ((nota>=5) && (nota<7)) {
			calificacion = "aprobado";
		} else if ((nota>=7) && (nota<9)) {	
			calificacion = "notable";		
		} else if ((nota>=9) && (nota<10)) {	
			calificacion = "sobresaliente";
		}
		
		System.out.println("El alumno " + nomAlum + " en la asignatura " + asignatura + " tiene un " + calificacion);

	}

}
