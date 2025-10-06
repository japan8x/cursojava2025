package es.cursojava.interfaces.ejercicios.sistemapagos;

public class ProcesadorPagos {
	
	public static void realizarPago(Pago metodoPago, double monto) {
		 
		metodoPago.procesarPago(monto);
		
	}

}
