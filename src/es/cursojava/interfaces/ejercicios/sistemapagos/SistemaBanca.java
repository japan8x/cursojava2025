package es.cursojava.interfaces.ejercicios.sistemapagos;

public class SistemaBanca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double monto1 = 450.00;
		double monto2 = 36.45;
		double monto3 = 11.20;
		
		PagoTarjetaCredito ptc = new PagoTarjetaCredito();
		PagoPayPal ppp = new PagoPayPal();
		PagoCriptomoneda pcm = new PagoCriptomoneda();
		
		Pago pp1 = new Pago();
		ProcesarPagos pp2 = new Pago();
		ProcesarPagos pp3 = new Pago();
		
		pp1.realizarPago(ptc,monto1);
		pp2.realizarPago(ppp,monto2);
		pp3.realizarPago(pcm,monto3);
		
	}

}
