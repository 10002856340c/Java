package POO;

public class Empleado extends Persona {
    // Atributos
    private int IdEmpleado;
    private double Sueldo;

    // constructores
    public Empleado() {

    }

    public Empleado(int IdEmpleado, double Sueldo) {
        this.IdEmpleado = IdEmpleado;
        this.Sueldo = Sueldo;
    }

    // ---------------------------------------------------------------------------------------------------------------------------//
    // getters and setter
    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double sueldo) {
        Sueldo = sueldo;
    }
    // ------------------------------------------------------------------------------------------------------------------------------//

    @Override
    public String toString() {
        return super.getNombre() + "IdEmpleado = " + IdEmpleado + " Sueldo = " + Sueldo;
    }

}
