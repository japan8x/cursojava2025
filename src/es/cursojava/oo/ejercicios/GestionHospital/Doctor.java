package es.cursojava.oo.ejercicios.GestionHospital;

import java.util.Random;

public class Doctor extends EmpleadosHospital {
    private String especialidad;
    private Random random = new Random();

    public Doctor(String nombre, int edad, String turno, String especialidad) {
        super(nombre, edad, turno);
        this.especialidad = especialidad;
    }

    /**
     * Diagnosticar Paciente:
     * - Genera número 1-10. Si > 8 -> enfermo.
     * - Devuelve objeto Enfermo cuando está enfermo, si no devuelve null.
     */
    public Enfermo diagnosticarPaciente(Paciente p) {
        int valor = random.nextInt(10) + 1; // 1..10
        System.out.println("Doctor " + nombre + " ("
                + especialidad + ") diagnostica a " + p.getNombre()
                + " → resultado=" + valor + " ( >8 => enfermo )");

        if (valor > 8) {
            String enfermedad = "Enfermedad-" + valor; // etiqueta simple
            Enfermo e = new Enfermo(p.getNombre(), p.edad, enfermedad);
            System.out.println("Diagnóstico: " + p.getNombre() + " está enfermo (" + enfermedad + ")");
            return e;
        } else {
            System.out.println("Diagnóstico: " + p.getNombre() + " no requiere ingreso.");
            return null;
        }
    }
}

