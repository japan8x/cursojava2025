package es.cursojava.metodos.ejercicios;

public class NombresAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numpal = 0;
		
		int pal = (int) Math.random()*15+1;
		int lon = (int) Math.random()*25+1;
		
		int ale = 0;
		
		String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrtstuvwxyz";
		
		String nombre[] = new String[pal];
		
		for(int i=1;i<pal;i++) {
			
			nombre[i] = "";
			
			for(int j=1;j<=lon;j++) {
				
				ale = (int) Math.random()*52+1;
				
				nombre[i] += alfabeto.substring(ale);
				
			}
					
		}
		
		numpal = NombresAt.numeroAt(nombre);
		
		System.out.println(numpal);

	}
	
	public static int numeroAt(String nombres[]) {
		
		//int reply = 0;
		
		char cara;
		
		int contador = 0;
		
		for(int i=1;i<=nombres.length;i++) {
			
			//nombres[i] = "";
			
			for(int j=0;j<=nombres[i].length()-1;j++) {
				
					cara = (char) nombres[i].indexOf(j);
				
				if ((cara == 'A') && (nombres[i].contains("t"))) {
					
					contador++;
					
				}
				
			}
					
		}
		
		return contador;
	}

}
