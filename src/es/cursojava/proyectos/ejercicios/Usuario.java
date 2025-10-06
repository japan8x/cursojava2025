package es.cursojava.proyectos.ejercicios;

public class Usuario {
	
	String nombre;
	int edad;
	double saldo;
	
	
	
	//CONSTRUCTOR
	
	public Usuario(String nombre) {
		this.nombre = nombre;
	}



	//GET&SET
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	//METODOS 
	
	public void muestraUsuario() {
		System.out.println( nombre);
	}

}
