package es.cursojava.inicio.strings.ejercicios;

public class PosicionesLetraCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "Esto es una prueba de Strings";
		
		String subcadena = "";
		
		int posicion = 0;
		
		int longitud = cadena.length();
		
		String letra = "e";
		
		do {
			
			posicion = subcadena.indexOf(letra);
			
			subcadena = subcadena.substring(posicion);
			
		} while (posicion<longitud);
		
		System.out.println(cadena.substring(cadena.IndexOf(" ")+1));


	}

}
