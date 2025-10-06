package es.cursojava.oo.ejercicios;

public class Colegio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno estudiantes[] = new Alumno[3];
		
		Alumno estudiante1 = new Alumno();
		Alumno estudiante2 = new Alumno();
		Alumno estudiante3 = new Alumno();
		
		String[] asignaturas1 = {"Matemáticas", "Lengua", "Sociales", "Naturaleza", "Inglés"}; //new String[5];
		String[] asignaturas2 = {"Gimnasia", "Lengua", "Dibujo", "Física", "Inglés"};
		String[] asignaturas3 = {"Matemáticas", "Lengua", "Física", "Filosofía", "Química"};
		
		estudiante1.setNombre("Juan Martín Cano");
		estudiante1.setDni("70834932L");
		estudiante1.setNotaMedia(6.3f);
		estudiante1.setAsignaturas(asignaturas1);
		
		estudiante2.setNombre("María Lópes Casas");
		estudiante2.setDni("56780127K");
		estudiante2.setNotaMedia(4.5f);
		estudiante2.setAsignaturas(asignaturas2);
		
		estudiante3.setNombre("Fernando García Berrocal");
		estudiante3.setDni("853014932P");
		estudiante3.setNotaMedia(9.1f);
		estudiante3.setAsignaturas(asignaturas3);
		
		estudiantes[0] = estudiante1;		
		estudiantes[1] = estudiante2;		
		estudiantes[2] = estudiante3;
		
		estudiarAlumnos(estudiantes);
		
	}
	
	public static void estudiarAlumnos(Alumno estudiantes[]) {
		
		for(int i=0;i<estudiantes.length;i++) {
			
			estudiantes[i].estudiar();
			
			for(int j=0;j<estudiantes[i].getAsignaturas().length;j++) {
				
				System.out.print(estudiantes[i].getAsignaturas()[j] + ", ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
}
