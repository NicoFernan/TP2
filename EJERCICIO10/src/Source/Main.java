package Source;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        Empleado empleadoAsalariado = new EmpleadoAsalariado("Roberto", "Gómez", "11-1111-1111", "20-11111111-1", new Date(), 4000);
        Empleado empleadoPorComision = new EmpleadoPorComision("Ana", "López", "11-2222-2222", "20-22222222-2", new Date(), 60000, 3.0);
        Empleado empleadoPorComisionConSalarioBase = new EmpleadoPorComisionConSalarioBase("Diego", "Sánchez", "11-3333-3333", "20-33333333-3", new Date(), 75000, 2.5, 2000);
        Empleado empleadoPorHora = new EmpleadoPorHora("María", "Rodríguez", "11-4444-4444", "20-44444444-4", new Date(), 12, 50);
        Empleado empleadoPasante = new EmpleadoPasante("Luisa", "González", "11-5555-5555", "20-55555555-5", new Date());

        System.out.println("Empleado: " + empleadoAsalariado.getNombreCompleto() + ". Sueldo de empleado asalariado: $" + empleadoAsalariado.calcularSueldo());
        System.out.println("Empleado: " + empleadoPorComision.getNombreCompleto() + ". Sueldo de empleado por comisión: $" + empleadoPorComision.calcularSueldo());
        System.out.println("Empleado: " + empleadoPorComisionConSalarioBase.getNombreCompleto() + ". Sueldo de empleado por comisión con salario base: $" + empleadoPorComisionConSalarioBase.calcularSueldo());
        System.out.println("Empleado: " + empleadoPorHora.getNombreCompleto() + ". Sueldo de empleado por hora: $" + empleadoPorHora.calcularSueldo());
        System.out.println("Empleado: " + empleadoPasante.getNombreCompleto() + ". Sueldo de empleado pasante: $" + empleadoPasante.calcularSueldo());
    }
}