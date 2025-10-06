package es.cursojava.interfaces.ejercicios.sistemapagos;

public class PagoCriptomoneda implements Pago {

	@Override
	public void procesarPago(double monto) {
		// TODO Auto-generated method stub
		
		System.out.println("Pago con criptomonedas realizado con éxito: " + monto);

	}

}
