package Source;


class AutoVip extends Vehiculo {
    public AutoVip(String patente, int diasAlquiler) {
        super(patente, diasAlquiler);
    }

    @Override
    public double calcularCostoAlquiler() {
        return super.calcularCostoAlquiler() + 500 * diasAlquiler; // $500 por día
    }
}