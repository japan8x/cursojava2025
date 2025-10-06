package es.cursojava.oo.ejercicios;

public class Alumno {
	
	// Variables de instancia
	private String nombre;
	private String dni;
	private float notaMedia;
	private String[] asignaturas;
	
	// Métodos de instancia NO ESTÁTICOS
	public void estudiar() {
		
		System.out.print("El estudiante " + nombre);
		
		if (notaMedia >= 9) {
			
			System.out.println(" es un genio.");
		
		} else if (notaMedia >= 5) {
			
			System.out.println(" ha estudiado mucho.");
			
		} else if (notaMedia < 5) {
		
			System.out.println(" ha estudiado poco.");
		
		}
		
	}
	
	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public float getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(float notaMedia) {
		this.notaMedia = notaMedia;
	}

	public String[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String[] asignaturas) {
		//for(int i=0;i<asignaturas.length;i++) {
			this.asignaturas = asignaturas;
		//}
	}
	
}
