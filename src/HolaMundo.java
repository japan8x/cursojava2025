import java.util.logging.Logger;
import org.slf4j.LoggerFactory;

public class HolaMundo {
	
	private static final Logger log = LoggerFactory.getLogger(HolaMundo.class);

	
	public static void main (String [] args ) {
				
		System.out.println("Hola Getafe Juan Alberto 10");
		System.out.println("Hola Getafe Juan Alberto GitHub");

		
		// Comentario de línea
		
		/*
		 * Comentario
		 * de
		 * bloque
		 * 
		 */
		
		// Declarar una variable
		// Indico el tipo y el nombre de la varaible (notación camelCase)
		int numero; //Declaración
		numero = 9;   //Inicialización
		
		int edad = 25; //Declarar e inicializar
	
		System.out.println("Repositorio Local");
		
		System.out.println("GitHUb");

		
		System.out.println("10" + numero + edad);
		System.out.println("resultado: " + (numero + edad) );
		
	}

}
