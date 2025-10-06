package es.cursojava.oo.ejercicios.GestionHospital;

class EmpleadosHospital extends Persona {
    protected String turno;

    public EmpleadosHospital(String nombre, int edad, String turno) {
        super(nombre, edad);
        this.turno = turno;
    }

    public void fichar() {
        System.out.println("El empleado " + nombre + " ... está fichando");
    }

    @Override
    public void comer() {
        System.out.println("Empleado " + nombre + " ... comiendo en el comedor");
    }
}