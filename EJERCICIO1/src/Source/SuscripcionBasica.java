package Source;

public class SuscripcionBasica extends Suscripcion{
    public SuscripcionBasica(String tipoSuscripcion, double cuota){
        super("Básica", 900);
        setActividadesTipoSuscripcion(new Actividad("Natación"));
    }
}