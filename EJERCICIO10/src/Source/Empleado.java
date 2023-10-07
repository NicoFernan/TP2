package Source;

import java.util.Date;
class Empleado {
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String cuit;
    protected Date fechaNacimiento;

    public Empleado(String nombre, String apellido, String telefono, String cuit, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cuit = cuit;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    public double calcularSueldo() {
        return 0.0;
    }

    public boolean esMesDeCumpleanos() {
        return false;
    }
}