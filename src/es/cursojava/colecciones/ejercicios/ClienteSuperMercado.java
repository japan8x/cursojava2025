package es.cursojava.colecciones.ejercicios;

import java.util.List;

import es.cursojava.interfaces.ejercicios.Alimentos;
import es.cursojava.oo.ejercicios.GestionHospital.Persona;

public class ClienteSuperMercado {
	
	private String nombreCliente;
	private List<Alimentos> carritoCompra;
	
	// GETTERS & SETTERS
	public String getNombreCliente() {
		return nombreCliente;
	}
	
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
	public List<Alimentos> getCarritoCompra() {
		return carritoCompra;
	}
	
	public void setCarritoCompra(List<Alimentos> carritoCompra) {
		this.carritoCompra = carritoCompra;
	}

}
