package Source;

public class Main {
    public static void main(String[] args) {
        SistemaAgencia sistemaAgencia = new SistemaAgencia();

        // Registrar vehículos
        Vehiculo vehiculo1 = new AutoPasajero("XYZ789", 4, 5);
        Vehiculo vehiculo2 = new AutoVip("ABC123", 7);
        Vehiculo vehiculo3 = new Combi("DEF456", 12);
        Vehiculo vehiculo4 = new CamionetaFlete("GHI789", 1, 1500);
        Vehiculo vehiculo5 = new CamionCarga("JKL012", 30);

        sistemaAgencia.registrarVehiculo(vehiculo1);
        sistemaAgencia.registrarVehiculo(vehiculo2);
        sistemaAgencia.registrarVehiculo(vehiculo3);
        sistemaAgencia.registrarVehiculo(vehiculo4);
        sistemaAgencia.registrarVehiculo(vehiculo5);

        // Registrar clientes
        Cliente cliente1 = new Cliente("Eduardo");
        Cliente cliente2 = new Cliente("Laura");
        Cliente cliente3 = new Cliente("Fernando");
        Cliente cliente4 = new Cliente("Isabel");
        Cliente cliente5 = new Cliente("Carlos");

        Presupuesto presupuesto1 = sistemaAgencia.generarPresupuesto(vehiculo1, 5);
        sistemaAgencia.registrarAlquiler(cliente1, presupuesto1);
        System.out.println(cliente1.getNombre() + " alquiló un Auto de Pasajero por " +
                presupuesto1.getDiasAlquiler() + " días.");

        System.out.println("Monto total de alquileres para " + cliente1.getNombre() + ": $" +
                sistemaAgencia.obtenerMontoTotalAlquileresCliente(cliente1) + "\n");

        //--------------------------------------------------------------------------------------

        Presupuesto presupuesto2 = sistemaAgencia.generarPresupuesto(vehiculo3, 3);
        sistemaAgencia.registrarAlquiler(cliente4, presupuesto2);
        System.out.println(cliente4.getNombre() + " alquiló una Combi " +
                presupuesto2.getDiasAlquiler() + " días.");

        System.out.println("Monto total de alquileres para " + cliente4.getNombre() + ": $" +
                sistemaAgencia.obtenerMontoTotalAlquileresCliente(cliente4) + "\n");

        //--------------------------------------------------------------------------------------

        Presupuesto presupuesto3 = sistemaAgencia.generarPresupuesto(vehiculo5, 30);
        sistemaAgencia.registrarAlquiler(cliente2, presupuesto3);
        System.out.println(cliente2.getNombre() + " alquiló un Camión de Carga por " + presupuesto3.getDiasAlquiler() + " días.");

        System.out.println("Monto total de alquileres para " + cliente2.getNombre() + ": $" +
                sistemaAgencia.obtenerMontoTotalAlquileresCliente(cliente2) + "\n");
        //--------------------------------------------------------------------------------------

        Presupuesto presupuesto4 = sistemaAgencia.generarPresupuesto(vehiculo2, 10);
        sistemaAgencia.registrarAlquiler(cliente3, presupuesto4);
        System.out.println(cliente3.getNombre() + " alquiló un Auto VIP por " + presupuesto4.getDiasAlquiler() + " días.");

        System.out.println("Monto total de alquileres para " + cliente3.getNombre() + ": $" +
                sistemaAgencia.obtenerMontoTotalAlquileresCliente(cliente3) + "\n");

        //--------------------------------------------------------------------------------------

        Presupuesto presupuesto5 = sistemaAgencia.generarPresupuesto(vehiculo4, 2);
        sistemaAgencia.registrarAlquiler(cliente5, presupuesto5);
        System.out.println(cliente5.getNombre() + " alquiló una Camioneta tipo Flete por " + presupuesto5.getDiasAlquiler() + " días.");

        System.out.println("Monto total de alquileres para " + cliente5.getNombre() + ": $" +
                sistemaAgencia.obtenerMontoTotalAlquileresCliente(cliente5) + "\n");

        //--------------------------------------------------------------------------------------

        sistemaAgencia.registrarCliente(cliente1);
        sistemaAgencia.registrarCliente(cliente2);
        sistemaAgencia.registrarCliente(cliente3);
        sistemaAgencia.registrarCliente(cliente4);
        sistemaAgencia.registrarCliente(cliente5);

        System.out.println("Monto total de alquileres en el sistema: $" +
                sistemaAgencia.obtenerMontoTotalAlquileresSistema());
    }
}