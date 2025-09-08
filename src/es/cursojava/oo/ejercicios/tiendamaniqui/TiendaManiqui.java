package es.cursojava.oo.ejercicios.tiendamaniqui;

public class TiendaManiqui {
	
	private String nombre;
	
	// GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
	// CONSTRUCTORES
	public TiendaManiqui() {
		
		this.nombre = null;
		
	}
	
	public TiendaManiqui(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	// MÉTODOS NO ESTÁTICOS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TiendaManiqui tienda = new TiendaManiqui("Mango");
		
		tienda.abrirTienda();
		tienda.mostrarEscaparate();
		tienda.cerrarTienda();
		
	}
	
	public TiendaManiqui abrirTienda() {
		
		TiendaManiqui tienda = new TiendaManiqui();
		
		Maniqui maniquiUno = new Maniqui();
		Maniqui maniquiDos = new Maniqui();
		Maniqui maniquiTres = new Maniqui();
		
		return tienda;
		
	}
	
	public void vestirManiquies() {
		
			
	
	}
	
	public TiendaManiqui mostrarEscaparate() {
		
		TiendaManiqui tienda = new TiendaManiqui();
		
		System.out.println();
		
        return tienda;
		
	}
	
	public TiendaManiqui cerrarTienda() {
		
		TiendaManiqui tienda = new TiendaManiqui();
		
		System.out.println("Son las 20:00 h. Se cierra la tienda.");
		
		maniquiUno.devestir();
		maniquiDos.devestir();
		maniquiTres.devestir();
		
		return tienda;
		
	}

}
