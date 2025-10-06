package es.cursojava.interfaces.ejercicios.sistemapagos;

public class PagoPayPal implements Pago {

	@Override
	public void procesarPago(double monto) {
		// TODO Auto-generated method stub
		
		System.out.println("Pago con PayPal realizado con éxito: " + monto);


	}

}
