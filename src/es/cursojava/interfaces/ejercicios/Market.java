package es.cursojava.interfaces.ejercicios;

public class Market {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Platanos platano1 = new Platanos();
		
		ChuletasDeAguja chuletas2 = new ChuletasDeAguja();
		
		Ordenador ordenador3 = new Ordenador();
		
		Lavadora lavadora4 = new Lavadora();
		
		Automovil turismo5 = new Automovil();
		
		Autobus autocar6 = new Autobus();
		
		Tandem bicileta7 = new Tandem();
		
		Triciclo triciclo8 = new Triciclo();
		
		encender(lavadora4);

	}
	
	private static void encender(Encendible e) {
		
		e.encender();
		
	}
	
	private static void apagar(Apagable a) {
		
		a.apagar();
		
	}


}