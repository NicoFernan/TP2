package Source;

class CajaAhorro extends Cuenta {
    private double tasaInteres;

    public CajaAhorro(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    public void realizarDeposito(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto del depósito debe ser mayor que cero.");
        }
    }

    public double getTasaInteres() {
        return tasaInteres;
    }
}