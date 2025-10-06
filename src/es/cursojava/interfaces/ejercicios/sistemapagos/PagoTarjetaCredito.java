package es.cursojava.interfaces.ejercicios.sistemapagos;

public class PagoTarjetaCredito implements Pago {

	@Override
	public void procesarPago(double monto) {
		// TODO Auto-generated method stub
		
		System.out.println("Pago con tarjeta realizado con éxito: " + monto);

	}

}
