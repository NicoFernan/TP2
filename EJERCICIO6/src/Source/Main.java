package Source;

public class Main {
    public static void main(String[] argumentos){

        ModuloInformes administrador = new ModuloInformes();

        Cliente cliente1 = new Cliente("XYZ 123", "Pedro Pérez");
        Cliente cliente2 = new Cliente("ABC 456", "Ana Rodríguez");
        Cliente cliente3 = new Cliente("DEF 789", "Luis López");
        Cliente cliente4 = new Cliente("GHI 987", "María Martínez");
        Cliente cliente5 = new Cliente("JKL 654", "Carlos Castro");
        Cliente cliente6 = new Cliente("MNO 321", "Laura López");
        Cliente cliente7 = new Cliente("PQR 852", "Juan González");
        Cliente cliente8 = new Cliente("STU 369", "Isabel Sánchez");
        Cliente cliente9 = new Cliente("VWX 246", "Sergio Silva");
        Cliente cliente10 = new Cliente("YZA 135", "Marta Mendoza");

        Playero playero = new Playero("Susana Fernández", "12.345.678", "1234-5678");
        Playero playero2 = new Playero("Marcos González", "22.221.332", "9876-5432");
        administrador.contratarPlayero(playero2);
        administrador.contratarPlayero(playero);

        Combustible nafta = new Combustible("Nafta");
        Combustible gasoil = new Combustible("Gasoil");
        Combustible kerosene = new Combustible("Kerosene");

        administrador.agregarCombustible(nafta);
        administrador.agregarCombustible(gasoil);
        administrador.agregarCombustible(kerosene);

        Surtidor surtidor1 = new Surtidor("1");
        Surtidor surtidor2 = new Surtidor("2");
        Surtidor surtidor3 = new Surtidor("3");


        Venta venta1 = new Venta(cliente1, nafta, 3, surtidor1);
        Venta venta2 = new Venta(cliente2, gasoil, 2, surtidor2);
        Venta venta3 = new Venta(cliente3, gasoil, 1, surtidor3);
        Venta venta4 = new Venta(cliente4, nafta, 4, surtidor1);
        Venta venta5 = new Venta(cliente5, nafta, 9, surtidor2);
        Venta venta6 = new Venta(cliente6, gasoil, 10, surtidor3);
        Venta venta7 = new Venta(cliente7, nafta, 7, surtidor1);
        Venta venta8 = new Venta(cliente8, gasoil, 8, surtidor2);
        Venta venta9 = new Venta(cliente9, gasoil, 5, surtidor3);
        Venta venta10 = new Venta(cliente10, kerosene, 6, surtidor3);

        playero.registrarVenta(venta1);
        playero.registrarVenta(venta2);
        playero.registrarVenta(venta3);
        playero.registrarVenta(venta4);
        playero.registrarVenta(venta5);

        playero2.registrarVenta(venta6);
        playero2.registrarVenta(venta7);
        playero2.registrarVenta(venta8);
        playero2.registrarVenta(venta9);
        playero2.registrarVenta(venta10);

        System.out.println("\nVENTAS POR COMBUSTIBLE: \n");
        administrador.ventasPorCombustible();

        System.out.println("\nVENTAS POR SURTIDOR: \n");
        administrador.generarInformeSurtidoresPorMonto();

        System.out.println("\nSURTIDORES ORDENADOS POR LITROS: \n");
        administrador.generarInformeSurtidoresPorLitros();

        System.out.println("\nPLAYEROS ORDENADOS POR VENTAS: \n");
        administrador.generarInformePlayerosPorVentas();

        System.out.println("\nTOP 10 CLIENTES: \n");
        administrador.generarTop10Clientes();


    }
}