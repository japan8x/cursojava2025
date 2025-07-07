package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class PrecioLlamada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		EJERCICIO 5
//		===============================================
//		Herramienta para calcular el precio de una llamada
//		Cuando se realiza una llamada, el cobro es por el tiempo que esta dura, 
//		de tal forma que:
//
//		+ los primeros cinco minutos cuestan 1€, 
//		+ los siguientes 3 minutos, 80 céntimos, 
//		+ los siguientes dos minutos a 70 céntimos 
//		+ y a partir del décimo minuto, 50 céntimos cada minuto.
//
//		Se carga un impuesto del 3% cuando es domingo, 
//		y si es otro día, 
//			en turno de mañana 15% (6-12)
//			y en turno de tarde 10%. (12-23)
//			y en turno de noche -10%. (23-6)
//
//		Solicitar tiempo de llamada, dia de la semana y hora y calcular el coste de la llamada
//
//
//		Acciones:
//		Crear una condición que indique que mientras la cantidad de minutos sea mayor a 0 y menor a 5 el coste sea 1 euro. 
//		Crear una condición que indique que si la llamada dura más de 5 minutos y menos de 8, el costo de los minutos 6, 7 y 8 sea de 80 céntimos.
//		Crear una condición que indique que si la llamada dura más de 8 minutos y menos y hasta 10, el costo de los minutos 9 y 10 sea de 70 céntimos.
//		Crear una condición que indique que si la llamada dura más de 10 minutos cada minuto valga 50 céntimos.
//		Crear una condición que indique que si la llamada se hace el día domingo la llamada tenga un impuesto derl 3%
//		Crear una condición que indique que si la llamada se hace en un día diferente al domingo se aplique:
//		15% turno de 06:00am a 12:00m; 10% turno de 12:00m a 23:00pm; -10% turno de 23:00am a 05:59am; 
		
		float coste = 0.0f, precio = 0.0f, impuesto = 0.03f;
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("\nIntroduce el tiempo de llamada: \n");
		scan1 = new Scanner(System.in);
		int minutos = scan1.nextInt();
		
        Scanner input = new Scanner(System.in);
        System.out.print("\nIntroduce el día de la semana (L, M, X, J, V, S, D): \n");
        char dia = input.next().charAt(0);
        
		Scanner scan2 = new Scanner(System.in);
		System.out.println("\nIntroduce la hora de llamada: \n");
		scan2 = new Scanner(System.in);
		int hora = scan2.nextInt();
		
		if ((minutos>0) && (minutos<5)) {
			coste = 1.0f;
		} else if ((minutos>=5) && (minutos<8)) {
			coste = 0.80f;
		} else if ((minutos>=8) && (minutos<10)) {
			coste = 0.70f;
		} else if (minutos>=10) {
			coste = 0.50f;
		}
		
		precio = minutos * coste;		
		
		System.out.println("Minutos: " + minutos + ", Coste: " + coste + "€, Precio sin impuestos: " + precio + "€");
		
		if (dia == 'D') {
			impuesto = 0.03f;
		} else if ((hora >= 6) && (hora < 12)) {
			impuesto = 0.15f;
		} else if ((hora >= 12) && (hora < 23)) {
			impuesto = 0.10f;
		} else if ((hora >= 23) && (hora < 24) || (hora >= 0) && (hora < 6)) {
			impuesto = -0.10f;
		}
		
		precio = precio * (1.0f + impuesto);
		
		System.out.println("Impuesto: " + impuesto*100 + "%");
		
		System.out.println("El precio de la llamada incluidos impuestos ha sido " + precio + "€");

	}

}
