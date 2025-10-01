package es.cursojava.oo.ejercicios.GestionHospital;

public class Enfermero extends EmpleadosHospital {
    private String planta;

    public Enfermero(String nombre, int edad, String turno, String planta) {
        super(nombre, edad, turno);
        this.planta = planta;
    }

    public void atenderPaciente(Paciente p) {
        System.out.println("Enfermero " + nombre + " atiende a " + p.getNombre() + " en planta " + planta);
    }
}