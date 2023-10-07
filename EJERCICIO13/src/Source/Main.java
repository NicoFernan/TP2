package Source;

public class Main {
    public static void main(String[] args) {

        Pasajero pasajero1 = new Pasajero("Ana", "11-2345-6789", "San Martín 123", "456");
        Tripulante tripulante1 = new Tripulante("Lucía", "11-8765-4321", "Rivadavia 456", "Azafata");

        Vuelo vuelo1 = new Vuelo(32, "10-01-2019", "Buenos Aires", "París");
        vuelo1.agregarPersona(pasajero1);
        vuelo1.agregarPersona(tripulante1);

        System.out.println("Personas en el vuelo:\n");

        for (Persona persona : vuelo1.getMiembrosVuelo()) {
            System.out.printf("Nombre: %s\n", persona.getNombre());

            if (persona instanceof Pasajero) {
                System.out.printf("Número de Pasajero: %s\n", ((Pasajero) persona).getNumeroDePasajero());
            } else if (persona instanceof Tripulante) {
                System.out.printf("Cargo: %s\n", ((Tripulante) persona).getCargo());
            }

            System.out.println();
        }
    }
}