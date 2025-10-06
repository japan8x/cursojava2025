package es.cursojava.oo.ejercicios.tiendamaniqui;

public class Maniqui {
	
	private int id;
	private Pantalon pantalon;
	private Camisa camisa;
	private Vestido vestido;
	
	public Maniqui() {
		
		this.id = 0;
		this.pantalon = null;
		this.camisa = null;
		this.vestido = null;
		
	}
	
	public Maniqui(int id, Pantalon pantalon, Camisa camisa) {
		
		this.id = id;
		this.pantalon = pantalon;
		this.camisa = camisa;
		
	}
	
	public Maniqui(int id, Vestido vestido) {
		
		this.id = id;
		this.vestido = vestido;
		
	}
	
	public Maniqui vestir(boolean s) {
		
		Maniqui maniqui = new Maniqui();
		
		if (this.id == 0) {
			
			if (s==true) {
				
				Boton boton = new Boton("negro", "medio", "circular");			
				Pantalon pantalon = new Pantalon("negro", 14.99, "XXL", boton);
				
				Boton botones[] = new Boton[8];
				
				for(int i=1; i<botones.length; i++) {
					
				  botones[i].setColor("negro");	
				  botones[i].setTamanio("medio");
				  botones[i].setForma("circular");
				  
				}
				
				Camisa camisa = new Camisa("negro", 25.5, "XXL", botones);
							
			} else {
				
				Vestido vestido = new Vestido("rojo", 45.79, "M");
				
			}
			
		}
		
		return maniqui;
		
	}
	
	public Maniqui desvestir() {
		
		Maniqui maniqui = new Maniqui();
		
		if (this.id != 0) {
			
//			this.id = maniqui.id;
//			this.pantalon = maniqui.pantalon;
//			this.camisa = maniqui.camisa;
//			this.vestido = maniqui.vestido;
					
			this.id = maniqui.id;
			this.pantalon = maniqui.pantalon;
			this.camisa = maniqui.camisa;
			this.vestido = maniqui.vestido;
			
		}
		
		return maniqui;
		
	}

}
