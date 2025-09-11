package es.cursojava.oo.ejercicios.tiendamaniqui;

public class TiendaManiqui {
	
	private String nombre;
	private Maniqui maniquies[];
	
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
	
	public TiendaManiqui(Maniqui figurines[]) {
		
		for(int i=0; i<figurines.length; i++) {

 			this.maniquies[i] = figurines[i];
 			
		}		
		
	}
	
	public TiendaManiqui(String nombre, Maniqui figurines[]) {
		
		this.nombre = nombre;
		
		for(int i=0; i<figurines.length; i++) {

 			this.maniquies[i] = figurines[i];
 			
		}		
		
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
		
		for(int i=0; i<tienda.maniquies.length; i++) {
		
//			Maniqui mani[i] = new Maniqui();
//			Maniqui maniquiDos = new Maniqui();
//			Maniqui maniquiTres = new Maniqui();
 			tienda.maniquies[i].vestir(true);
 			
		}
		
		return tienda;
		
	}
	
	public void vestirManiquies() {
		
			
	
	}
	
	public TiendaManiqui mostrarEscaparate() {
		
		TiendaManiqui tienda = new TiendaManiqui();
		
		System.out.println("ESCAPARATE");
		System.out.println(tienda.getNombre());
		
		for(int i=0; i<tienda.maniquies.length; i++) {
			
			//System.out.println(tienda.maniquies[i].toString());
 			
 			System.out.println();
 			
		}
				
        return tienda;
		
	}
	
	public TiendaManiqui cerrarTienda() {
		
		TiendaManiqui tienda = new TiendaManiqui();
		
		System.out.println("Son las 20:00 h. Se cierra la tienda.");
		
		for(int i=0; i<tienda.maniquies.length; i++) {
			
 			tienda.maniquies[i].desvestir();
 			
		}
		
		return tienda;
		
	}

}
