package es.cursojava.inicio.condicionales;

public class CondicionalesIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int numero2 = (int) Math.random()*10;
		int numero = (int) (Math.random()*10);
		System.out.println(numero);
		
		if (numero>5) {
			System.out.println("El número es mayor de 5 " );
		} else {
			System.out.println("El número es menor de 5 " );
		}

	}

}
