package es.cursojava.oo.ejercicios.GestionHospital;

public class Habitacion {
    private int numero;
    private Enfermo ocupante; // null si está libre

    public Habitacion(int numero) {
        this.numero = numero;
    }

    public boolean estaLibre() { return ocupante == null; }

    public boolean ingresar(Enfermo e) {
        if (!estaLibre()) return false;
        this.ocupante = e;
        System.out.println("Ingresado " + e.getNombre() + " en la habitación " + numero);
        return true;
    }

    public void darAlta() {
        if (ocupante != null) {
            System.out.println("Alta para " + ocupante.getNombre() + " de la habitación " + numero);
            ocupante = null;
        }
    }

    public Enfermo getOcupante() { return ocupante; }

    public int getNumero() { return numero; }
}