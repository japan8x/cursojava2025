package es.cursojava.mapas.ejercicios;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import es.cursojava.utils.Utilidades;

public class Colegio {
	
	public static void main(String[] args) {
		
		Aula aula1 = new Aula("A1");
		Aula aula2 = new Aula("A2");
		Aula aula3 = new Aula("A3");
		
		Alumno alumno1 = new Alumno("N1", "A1", "111A", 15, aula1);
		Alumno alumno2 = new Alumno("N2", "A2", "222B", 16, aula1);
		Alumno alumno3 = new Alumno("N3", "A3", "333C", 14, aula2);
		Alumno alumno4 = new Alumno("N4", "A4", "444D", 17, aula3);
		Alumno alumno5 = new Alumno("N5", "A5", "555E", 19, aula3);
		Alumno alumno6 = new Alumno("N6", "A6", "666F", 18, aula3);
		Alumno alumno7 = new Alumno("N7", "A7", "777G", 15, aula3);
		
		List<Alumno> listaAula1 = new ArrayList();		
		List<Alumno> listaAula2 = new ArrayList();		
		List<Alumno> listaAula3 = new ArrayList();
		
		listaAula1.add(alumno1);
		listaAula1.add(alumno2);
		listaAula2.add(alumno3);
		listaAula3.add(alumno4);
		listaAula3.add(alumno5);
		listaAula3.add(alumno6);
		listaAula3.add(alumno7);
		
		//Map<String, Alumno> alumnos = new HashMap();
		
//		alumnos.put(alumno1.getDni(),alumno1);
//		alumnos.put(alumno2.getDni(),alumno2);
//		alumnos.put(alumno3.getDni(),alumno3);
//		alumnos.put(alumno4.getDni(),alumno4);
//		alumnos.put(alumno5.getDni(),alumno5);
//		alumnos.put(alumno6.getDni(),alumno6);
//		alumnos.put(alumno1.getDni(),alumno7);
		
		Map<Aula, List<Alumno>> aulas = new HashMap();
		
		aulas.put(aula1, listaAula1);
		aulas.put(aula2, listaAula2);
		aulas.put(aula3, listaAula3);
		
//		aulas.put(alumno2.getDni(), aula1);
//		aulas.put(alumno3.getDni(), aula1);
//		aulas.put(alumno4.getDni(), aula4);
//		aulas.put(alumno5.getDni(), aula4);
//		aulas.put(alumno6.getDni(), aula4);
//		aulas.put(alumno7.getDni(), aula4);
		
		//Recupero los datos de una persona
		String a = Utilidades.pideDatoCadena("Introduce un aula: ");
		//Alumno alumno = alumnos.get(dni);
		List<Alumno> listado = aulas.get(a);
		for (Alumno x : listado) {
			System.out.println(x.getNombre());
		}
		
		System.out.println("========== Todas las claves ==============");
		//Obtengo todas las claves
		Set<String> dnis = alumnos.keySet();
		for (String dniPersona : dnis) {
			System.out.println(dniPersona);
		}
			
		System.out.println("========== Todos los valores a partir de las claves ==============");
		//Obtengo todos los valores a partir de las claves
		for (String dniPersona : dnis) {
			Alumno alumnoValor = alumnos.get(dni);
			System.out.println(alumnoValor.getNombre());
		}
		
		System.out.println("========== Todos los valores de manera directa ==============");
		//Obtengo todos los valores sin usar la clave
		Collection<Alumno> colAlumno = alumnos.values();
		for (Alumno alumnos : colAlumno) {
			System.out.println(alumnos.getNombre());
		}
		
	}
	
	public static void mostrarAula(Aula aula) {
		
		Set<Entry<String, Alumno>> entries = alumnos.entrySet();
		for (Entry<String, Alumno> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValues());
		}
		
	}

}