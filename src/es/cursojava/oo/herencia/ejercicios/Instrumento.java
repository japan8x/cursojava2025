package es.cursojava.oo.herencia.ejercicios;

public class Instrumento {

	private String nombre;
	private String tipo;
	private boolean afinado;
	
	public static void afinar() {
		
		double f = 0;
		
		boolean a = false;
		
		do {
			
			f = Math.random();
			
			if ( f > 0.4 ) {
				
				a = true;
				
			}
			
		} while (a);
		
	}
	
	public static void tocar() {
		
		System.out.println();
		
	}
		
}
