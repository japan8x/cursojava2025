package es.cursojava.metodos.ejercicios;

import es.cursojava.utils.Utilidades;

public class MenuTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String carta[] = { "MENÚ DE OPCIONES", "================", "               ", "1. Pintar cuadrado.", "2. Validar email.", "3. Añadir alumno.", "4. Salir." };
		
		String mensaje = "¡Hola Mundo!";
		
		int num;
		
		String cad, cadena = "Gran Bola de Fuego.";
		
		Utilidades.pintaMenu(carta);
		
		Utilidades.pintaMenu(carta,mensaje);
		
		num = Utilidades.pideDatoNumerico(mensaje);
		
		System.out.println("Número: " + num);
		
		cad = Utilidades.pideDatoCadena(cadena);
		
		System.out.println(cadena);

	}

}
