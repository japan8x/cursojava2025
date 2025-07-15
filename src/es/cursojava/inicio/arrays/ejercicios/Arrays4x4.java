package es.cursojava.inicio.arrays.ejercicios;

public class Arrays4x4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matriz = new int [4][4];
		
		int [] diagonal = new int [4];

		// Rellenar una matriz 4x4
		for (int i=0;i<matriz.length;i++) {
			for (int j=0; j<matriz[i].length;j++) {
				//matriz[i][j]=3*(i^j)-i*j; 	
				matriz[i][j]= (i+j)%10; 	
			}
		}

		// Mostrar la matriz 4x4
		System.out.println(" Matriz = ");
		System.out.print(" [ ");
		for (int i=0;i<matriz.length;i++) {
			System.out.print("\t [ \t");
			for (int j=0; j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]); 
				if (j!=matriz[j].length-1) {
					System.out.print(", " + "\t"); 
				}
			}
			System.out.print(" ] ");
			if (i!=matriz[i].length-1) {
				System.out.print("\n");
			} 
		}
		System.out.print("\t" + " ] ");
		
		System.out.print("\n\n\n");

		// Invertir los datos de la diagonal
		for (int i=0;i<matriz.length;i++) {
			diagonal[i]=matriz[i][i];
		}
		
		// Mostrar los datos de la diagonal
		System.out.println(" Diagonal = ");		
		System.out.print("\t [ \t");
		for (int i=0;i<diagonal.length;i++) {
			System.out.print(diagonal[i]);
			if (i!=matriz[i].length-1) {
				System.out.print(", "+ "\t"); 
			}
		}
		System.out.print(" ] ");
		
		System.out.print("\n\n\n");		
		
		// Invertir los datos de la diagonal de la matriz
		for (int i=0;i<matriz.length;i++) {
			matriz[i][i]=diagonal[matriz.length-1-i];
		}
		
		// Mostrar la matriz con los datos de la diagonal invertida
		System.out.println(" Matriz Invertida Diagonal = ");
		System.out.print(" [ ");
		for (int i=0;i<diagonal.length;i++) {
			System.out.print("\t [ \t");
			for (int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]); 			
				if (j!=matriz[j].length-1) {
					System.out.print(", "+ "\t"); 
				}
			}
			System.out.print(" ] ");
			if (i!=matriz[i].length-1) {
				System.out.print("\n");
			} 
		
		}
		System.out.print("\t" + " ] ");
		
		// Mostrar los datos de la diagonal invertida
		System.out.println(" Invertida Diagonal = ");		
		System.out.print("\t [ \t");
		for (int i=0;i<diagonal.length;i++) {
			System.out.print(diagonal[i]);
			if (i!=matriz[i].length-1) {
				System.out.print(", "+ "\t"); 
			}
		}
		System.out.print(" ] ");
		
		System.out.print("\n\n\n");			

	}

}
