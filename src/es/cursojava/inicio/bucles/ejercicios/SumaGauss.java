package es.cursojava.inicio.bucles.ejercicios;

public class SumaGauss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int par = 0, impar = 0;
		
		for(int i=1;i<=50;i++) {
			par = 2*i;
			impar = 101 - par;
			System.out.println(par + ", " + impar);
		}

	}

}
