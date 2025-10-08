package es.cursojava.colecciones.ejercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import es.cursojava.interfaces.ejercicios.Alimentos;

public class Compras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    List<Alimentos> listaAlimentos = new ArrayList();
	    
	    List<List<Alimentos>> almacen = new ArrayList();
	    
	    Set<ClienteSuperMercado> clientes = new HashSet();
		
		Supermercado Merka = new Supermercado("Merka", almacen, clientes);
		
		for (ClienteSuperMercado c : clientes) {
			
			// System.out-println(c);
			
		}

	}

}
