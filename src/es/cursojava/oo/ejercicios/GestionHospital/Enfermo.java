package es.cursojava.oo.ejercicios.GestionHospital;

public class Enfermo extends Persona {
    private String enfermedad;

    public Enfermo(String nombre, int edad, String enfermedad) {
        super(nombre, edad);
        this.enfermedad = enfermedad;
    }

    public String getEnfermedad() { return enfermedad; }

    @Override
    public void comer() {
        System.out.println("Enfermo " + nombre + " ... comiendo en la habitación");
    }

    @Override
    public String toString() {
        return "Enfermo{" + nombre + ", enfermedad='" + enfermedad + "'}";
    }
}
