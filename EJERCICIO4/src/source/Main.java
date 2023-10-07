package source;

public class Main {
    public static void main(String[] args) {
        // Crear un cliente con una cuenta normal y una cuenta de crédito
        Cliente cliente = new Cliente("Ejemplo Cliente", 1000.0, 900.0, 1000.0);

        // Realizar una inversión
        cliente.realizarInversion(500.0, 30);

        // Realizar compras a crédito
        cliente.realizarCompraCredito(20.0);
        cliente.realizarCompraCredito(300.0);

        // Realizar un pago a la deuda de crédito
        cliente.realizarPagoCredito(50.0);

        // Mostrar información al usuario
        System.out.println("Saldo: " + cliente.getSaldo());
        System.out.println("Límite de Giro en Descubierto: " + cliente.getLimiteGiroNormal());
        System.out.println("Monto disponible para compras a crédito: " + cliente.getMontoDisponibleCredito());
        System.out.println("Saldo deudor en crédito: " + cliente.getSaldoDeudorCredito());
        System.out.println("Monto invertido: " + cliente.getMontoInvertido());
        System.out.println("Interés en la inversión: " + cliente.getInteresInversion());
    }
}