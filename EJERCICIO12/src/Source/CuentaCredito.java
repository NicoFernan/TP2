package Source;

class CuentaCredito extends Cuenta {
    private double limiteGasto;
    private double tasaRecargo;
    private double deudaAcumulada;

    public CuentaCredito(double limiteGasto) {
        super(0); // El saldo inicial en una cuenta de crédito siempre es 0
        this.limiteGasto = limiteGasto;
        this.tasaRecargo = 0.05;
        this.deudaAcumulada = 0;
    }

    public void realizarCompra(double monto) {
        if (monto <= getLimiteGasto()) {
            deudaAcumulada += monto;
        } else {
            System.out.println("Compra excede el límite de gasto.");
        }
    }

    public void realizarPago(double monto) {
        if (monto >= 0) {
            deudaAcumulada -= monto;
        } else {
            System.out.println("El pago debe ser un valor positivo.");
        }
    }

    public double getLimiteGasto() {
        return limiteGasto - deudaAcumulada;
    }

    public double getTasaRecargo() {
        return tasaRecargo;
    }

    public double getDeudaAcumulada() {
        return deudaAcumulada;
    }
}