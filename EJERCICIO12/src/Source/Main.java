package Source;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Messi", 100000.0, 90.0, 1000.0);

        System.out.println("Bienvenido, " + cliente.getNombreCliente() + ".");
        System.out.println("Saldo Inicial: " + cliente.getSaldo());
        System.out.println("Límite de Giro en Descubierto: " + cliente.getLimiteGiroNormal());
        System.out.println("Límite de Gasto en Crédito: " + cliente.getMontoDisponibleCredito());
        System.out.println("-------------------------------------");

        // Realizar una inversión
        double montoInversion = 500.0;
        int diasInversion = 32;
        cliente.realizarInversion(montoInversion, diasInversion);
        System.out.println("Se ha realizado una inversión de " + montoInversion + " con un plazo de " + diasInversion + " días.");
        System.out.println("Monto invertido: " + cliente.getMontoInvertido());
        System.out.println("Interés en la inversión: " + cliente.getInteresInversion());
        System.out.println("-------------------------------------");

        // Realizar compras a crédito
        double compra1 = 600.0;
        double compra2 = 300.0;
        cliente.realizarCompraCredito(compra1);
        cliente.realizarCompraCredito(compra2);
        System.out.println("Se han realizado compras a crédito:");
        System.out.println("Compra 1: " + compra1);
        System.out.println("Compra 2: " + compra2);
        System.out.println("Monto disponible para compras a crédito: " + cliente.getMontoDisponibleCredito());
        System.out.println("Saldo Deudor en Crédito: " + cliente.getSaldoDeudorCredito());
        System.out.println("-------------------------------------");

        // Realizar un pago a la deuda de crédito
        double pagoCredito = 500.0;
        cliente.realizarPagoCredito(pagoCredito);
        System.out.println("Se ha realizado un pago a la deuda de crédito de " + pagoCredito);
        System.out.println("Saldo Deudor en Crédito después del pago: " + cliente.getSaldoDeudorCredito());
        System.out.println("-------------------------------------");

        // Cancelar la inversión
        cliente.cancelarInversion();
        System.out.println("La inversión ha sido cancelada.");
        System.out.println("Monto invertido (después de cancelar): " + cliente.getMontoInvertido());
        System.out.println("-------------------------------------");

        // Precancelar la inversión automáticamente al realizar una compra a crédito
        double compra3 = 500.0;
        cliente.realizarCompraCredito(compra3);
        System.out.println("Se ha realizado una compra a crédito de " + compra3 + ", la inversión se ha precancelado automáticamente.");
        System.out.println("Monto invertido (después de precancelar automáticamente): " + cliente.getMontoInvertido());
        System.out.println("Monto disponible (después de precancelar automáticamente): " + cliente.getMontoDisponible());

        // Crear una Caja de Ahorro y realizar operaciones
        CajaAhorro cajaAhorro = new CajaAhorro(2000.0, 0.02);
        System.out.println("-------------------------------------");
        System.out.println("Ejemplo de Caja de Ahorro:");
        System.out.println("Saldo Inicial en la Caja de Ahorro: " + cajaAhorro.getSaldo());

        // Realizar un depósito en la Caja de Ahorro
        double depositoCajaAhorro = 1000.0;
        cajaAhorro.realizarDeposito(depositoCajaAhorro);
        System.out.println("Se ha realizado un depósito de " + depositoCajaAhorro + " en la Caja de Ahorro.");
        System.out.println("Nuevo saldo en la Caja de Ahorro: " + cajaAhorro.getSaldo());
    }
}