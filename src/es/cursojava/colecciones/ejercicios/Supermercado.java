package es.cursojava.colecciones.ejercicios;

import java.util.List;
import java.util.Set;

import es.cursojava.interfaces.ejercicios.Alimentos;
import es.cursojava.oo.ejercicios.GestionHospital.Persona;

public class Supermercado {

	private String nombreSuperMercado; 
	private List<List<Alimentos>> stockSuperMercado;
	private Set<ClienteSuperMercado> clientes;
	
	// Constructor
	public Supermercado(String nombre, List<List<Alimentos>> stockSuperMercado, Set<ClienteSuperMercado> clientes) {
		
		this.nombreSuperMercado = nombre;
		this.stockSuperMercado =stockSuperMercado;
		this.clientes = clientes;
		
	}
	
	// GETTERS & SETTERS
	public String getNombreSuperMercado() {
		return nombreSuperMercado;
	}
	public void setNombreSuperMercado(String nombreSuperMercado) {
		this.nombreSuperMercado = nombreSuperMercado;
	}
	public List<List<Alimentos>> getStockSuperMercado() {
		return stockSuperMercado;
	}
	public void setStockSuperMercado(List<List<Alimentos>> stockSuperMercado) {
		this.stockSuperMercado = stockSuperMercado;
	}
	public Set<ClienteSuperMercado> getClientes() {
		return clientes;
	}
	public void setClientes(Set<ClienteSuperMercado> clientes) {
		this.clientes = clientes;
	}
	
	

}
