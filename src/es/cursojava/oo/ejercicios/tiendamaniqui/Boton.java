package es.cursojava.oo.ejercicios.tiendamaniqui;

public class Boton {
	
	private String color;
	private String tamanio;
	private String forma;
	
	// CONSTRUCTORES
	public Boton(String color, String tamanio, String forma) {
		
		this.color = color;
		this.tamanio = tamanio;
		this.forma = forma;
		
	}
	
	// GETTERS & SETTERS
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getTamanio() {
		return tamanio;
	}
	
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	
	public String getForma() {
		return forma;
	}
	
	public void setForma(String forma) {
		this.forma = forma;
	}

}
