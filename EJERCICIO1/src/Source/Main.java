package Source;

public class Main {
    public static void main(String[] argumentos){

        SuscripcionBasica basica = new SuscripcionBasica("Básica", 900);
        SuscripcionIntermedia intermedia = new SuscripcionIntermedia("Intermedia", 1200);
        SuscripcionDestacada destacada = new SuscripcionDestacada("Destacada", 1800);

        Socio socio1 = new Socio("Nico", "61.123.412", "Moreno", "mail@gmail.com", "Básica");
        Socio socio2 = new Socio("Messi", "10.101.010", "nose", "mesi@gmail.com", "Intermedio");


        Club club = new Club();

        club.agregarSocio(socio1);
        club.agregarSocio(socio2);


        System.out.println();
        club.listaNuevosSocios();
        club.listaActividadesPorSuscripcion();
        club.listaSociosPorSuscripcion("Básica");
    }
}