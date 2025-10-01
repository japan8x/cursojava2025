package es.cursojava.oo.ejercicios.GestionHospital;

import java.util.ArrayDeque;
import java.util.Queue;

/** ====== HOSPITAL (ORQUESTA) ====== */
public class HospitalApp {
    private String nombre;
    private Habitacion[] habitaciones = new Habitacion[2]; // tamaño fijo 2
    private Queue<Paciente> salaDeEspera = new ArrayDeque<>(3); // capacidad lógica 3

    private Enfermero enfermero;
    private Doctor doctor;

    public HospitalApp(String nombre) { this.nombre = nombre; }

    public static void main(String[] args) {
        HospitalApp hospital = new HospitalApp("Hospital General");
        hospital.abrirHospital();
        hospital.ficharEmpleados();
        hospital.horaDeComer();
        hospital.pasarConsultas();
        hospital.horaDeComer(); // segunda ronda tras ingresos para ver a enfermos comiendo en habitación
    }

    /** abrirHospital:
     *  - 2 habitaciones
     *  - 3 pacientes a sala de espera
     *  - 1 enfermero y 1 doctor
     */
    public void abrirHospital() {
        System.out.println("=== Abriendo " + nombre + " ===");

        // Habitaciones
        for (int i = 0; i < habitaciones.length; i++) {
            habitaciones[i] = new Habitacion(100 + i);
        }
        System.out.println("Habitaciones creadas: " + habitaciones.length);

        // Pacientes (3) → sala de espera
        añadirAPrimeraSalaLibre(new Paciente("Ana", 34, "tos", "fiebre"));
        añadirAPrimeraSalaLibre(new Paciente("Bruno", 50, "dolor cabeza"));
        añadirAPrimeraSalaLibre(new Paciente("Carla", 28, "náuseas"));

        // Personal
        enfermero = new Enfermero("Luis", 41, "Mañana", "2ª");
        doctor   = new Doctor("Dra. Vega", 45, "Mañana", "Medicina Interna");

        System.out.println("Sala de espera inicial: " + salaDeEspera.size() + " pacientes\n");
    }

    private void añadirAPrimeraSalaLibre(Paciente p) {
        if (salaDeEspera.size() >= 3) {
            System.out.println("⚠ Sala de espera llena. No puede entrar " + p.getNombre());
        } else {
            salaDeEspera.add(p);
            System.out.println(p + " ha entrado en la sala de espera.");
        }
    }

    /** Pone a fichar a todos los empleados del hospital */
    public void ficharEmpleados() {
        System.out.println("=== Fichar empleados ===");
        if (enfermero != null) enfermero.fichar();
        if (doctor != null) doctor.fichar();
        System.out.println();
    }

    /** Pone a TODAS las personas del hospital a comer:
     *  - Empleados
     *  - Pacientes en sala de espera
     *  - Enfermos ingresados en habitaciones
     */
    public void horaDeComer() {
        System.out.println("=== Hora de comer ===");

        // Empleados
        if (enfermero != null) enfermero.comer();
        if (doctor != null) doctor.comer();

        // Pacientes en sala de espera
        for (Paciente p : salaDeEspera) p.comer();

        // Enfermos ingresados en habitaciones
        for (Habitacion h : habitaciones) {
            if (!h.estaLibre()) {
                h.getOcupante().comer();
            }
        }
        System.out.println();
    }

    /** Flujo de consultas e ingresos */
    public void pasarConsultas() {
        System.out.println("=== Pasar consultas ===");
        while (!salaDeEspera.isEmpty()) {
            // Sacar paciente de la sala de espera
            Paciente p = salaDeEspera.poll();
            System.out.println("-> Llamando a " + p.getNombre() + " desde la sala de espera.");

            // Enfermero atiende
            enfermero.atenderPaciente(p);

            // Asignar a doctor y diagnosticar
            Enfermo e = doctor.diagnosticarPaciente(p);

            // Si está enfermo, intentar ingresar
            if (e != null) {
                boolean ingresado = asignarHabitacionLibre(e);
                if (!ingresado) {
                    System.out.println("❌ No hay habitaciones disponibles para " + e.getNombre() + ". Queda en observación.");
                }
            }
            System.out.println();
        }
        System.out.println("No quedan pacientes en la sala de espera.\n");
    }

    private boolean asignarHabitacionLibre(Enfermo e) {
        for (Habitacion h : habitaciones) {
            if (h.estaLibre()) {
                return h.ingresar(e);
            }
        }
        return false;
    }
}
