package es.cursojava.metodos.ejercicios;

public class NombresAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numpal = 0;
		
		int pal = (int) (Math.random()*15+1);
		int lon = (int) (Math.random()*25+4);
		
		int ale = 0;
		
		String alfabeto = " ABCDEFGHIJKLMNÑOPQRSTUVWXYZ abcdefghijklmnñopqrstuvwxyz";
		
		String nombre[] = new String[pal];
		
		//System.out.println(numpal + "  " + pal + "   " + "  " + lon + "  " + ale);
		
		for(int i=0;i<pal;i++) {
			
			nombre[i] = "";
			
			for(int j=0;j<lon;j++) {
				
				ale = (int) (Math.random()*56);
				
				//System.out.println(ale);
				
				nombre[i] += alfabeto.charAt(ale);
				
			}
					
		}
		
		//nombre[2] = "Afgt";
		//nombre[3] = "Ast";
		
		numpal = NombresAt.numeroAt(nombre);
		
		//System.out.println(numpal);
		
		NombresAt.mostrarNombres(nombre);

	}
	
	public static void mostrarNombres(String nombres[]) {
			
		for(int i=0;i<=nombres.length-1;i++) {
			
			System.out.println(nombres[i]);
					
		}
		
	}
	
	public static int numeroAt(String nombres[]) {
			
		char cara;
		
		int contador = 0;
		
		for(int i=0;i<nombres.length;i++) {
			
			cara = nombres[i].charAt(0);
			
			//System.out.println(nombres[i] + " === " + (cara == 'A') + " - " + nombres[i].contains("t"));
			
			for(int j=0;j<nombres[i].length();j++) {
				
				if ((cara == 'A') && (nombres[i].contains("t"))) {
					
					contador++;
					
					break;
					
					//System.out.println("Número: " + contador);
					
				}
				
			}
					
		}
		
		System.out.println("Número: " + contador);
		
		return contador;
		
	}

}
