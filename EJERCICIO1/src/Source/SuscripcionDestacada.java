package Source;

public class SuscripcionDestacada extends Suscripcion{
    public SuscripcionDestacada(String tipoSuscripcion, double cuota){
        super(tipoSuscripcion, cuota);
        setActividadesTipoSuscripcion(new Actividad("Natación"));
        setActividadesTipoSuscripcion(new Actividad("Fútbol"));
        setActividadesTipoSuscripcion(new Actividad("Pádel"));
    }
}