package es.cursojava.proyectos.ejercicios;

public class Cine {
	
	// ATRIBUTOS
	String nombreCine;
	SalaDeCine Salas[];
	
	// CONSTRUCTORES
	public Cine(String nombreCine) {
		
		this.nombreCine = nombreCine;
		
	}
	
	// GETTERS & SETTERS
	public String getNombreCine() {
		
		return nombreCine;
		
	}
	
	public void setNombreCine(String nombreCine) {
		
		this.nombreCine = nombreCine;
		
	}
	
	public SalaDeCine[] getSalas() {
		
		return Salas;
		
	}
	
	public void setSalas(SalaDeCine[] salas) {
		
		Salas = salas;
		
	}
	
}
