package es.cursojava.mapas.ejercicios;

public class Alumno {
	
	// ATRIBUTOS
	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	private Aula aula;
	
	// CONSTRUCTORES
	public Alumno(String nombre, String apellidos, String dni, int edad, Aula aula) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
	}
	
	// GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Aula getAula() {
		return aula;
	}
	
	public void setAula(int edad) {
		this.aula = aula;
	}
	
}
