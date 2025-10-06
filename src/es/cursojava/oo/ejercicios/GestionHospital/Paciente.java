package es.cursojava.oo.ejercicios.GestionHospital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Paciente extends Persona {
	
    private List<String> sintomas = new ArrayList<>();

    public Paciente(String nombre, int edad, String... sintomas) {
        super(nombre, edad);
        if (sintomas != null) this.sintomas.addAll(Arrays.asList(sintomas));
    }

    public List<String> getSintomas() { return sintomas; }

    @Override
    public void comer() {
        System.out.println("Paciente " + nombre + " ... comiendo en la cafetería");
    }

    @Override
    public String toString() {
        return "Paciente{" + nombre + ", síntomas=" + sintomas + "}";
    }
    
}
