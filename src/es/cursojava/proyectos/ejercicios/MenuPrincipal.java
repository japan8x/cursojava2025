package es.cursojava.proyectos.ejercicios;

import es.cursojava.proyectos.trebejos.Trebejos;

public class MenuPrincipal {
		
	public static void main(String[] args) {
		
		// Variable local
		int opcion = 0;
		
		Cine cine = new Cine("Abaco");
		
		Pelicula pelicula1 = new Pelicula("Titanic");
		Pelicula pelicula2 = new Pelicula("Tiburón");
		Pelicula pelicula3 = new Pelicula("Ben-Hur");
		Pelicula pelicula4 = new Pelicula("El golpe");
		Pelicula pelicula5 = new Pelicula("Matrix");
		
		Pelicula peliculas[10] = { 
				pelicula1,
				pelicula2,
				pelicula3,
				pelicula4,
				pelicula5	
		}
		
		do {
			
			String menu = "1. Listar peliculas y disponibilidad\n"
					    + "2. Comprar entradas\n"
					    + "3. Mostar ocupacion\n"
					    + "4. Salir";
			
			Trebejos.pintaMenu(menu.split("\n"));
			opcion = Trebejos.pideDatoNumerico(""); 
			
			switch (opcion) {
			
				case 1 -> listarPeliculas();
				case 2 -> comprarEntradas();
				case 3 -> mostrarOcupacion();
				case 4 -> salir("Adios!!!");
				default -> System.out.println("Opción incorrecta");
			
			}
				
		} while ( opcion != 4 );
		
	}

	public static void listarPeliculas() {

	}
	
	public static void comprarEntradas() {
		

	}
	
	public static void mostrarOcupacion() {
		

	}
	
	public static void salir(String s) {
		

	}

}
