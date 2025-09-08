package es.cursojava.oo.ejercicios.tiendamaniqui;

public class Vestido {
	
	private String color;
	private double precio;
	private String talla;
	
	// CONSTRUCTORES
	public Vestido(String color, double precio, String talla) {
		
		this.color = color;
		this.precio = precio;
		this.talla = talla;
		
	}
	
	// GETTERS & SETTERS
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getTalla() {
		return talla;
	}
	
	public void setTalla(String talla) {
		this.talla = talla;
	}
	
	

}
