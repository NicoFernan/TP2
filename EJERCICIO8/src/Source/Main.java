package Source;

public class Main {
    public static void main(String[] args) {
     
        Libro libro1 = new Libro("Aventuras en la selva", "María Rodríguez", "11-2333-4567", new CantidadEjemplares(10), "9789875457911");
        Revista revista1 = new Revista("Viajero Semanal", "Ana Sánchez", "11-5477-2222", new CantidadEjemplares(5), "0043-1826");
        Diario diario1 = new Diario("El Heraldo", "Luis Martínez", "11-2898-9001", "09-06-2023");
        Tesis tesis1 = new Tesis("Exploraciones en la arqueología", "Juan Pérez","11-2112-3666", 2, 2023);

        SistemaBiblioteca sistemaBiblioteca = new SistemaBiblioteca();

        sistemaBiblioteca.agregarLibro(libro1);
        sistemaBiblioteca.agregarRevista(revista1);
        sistemaBiblioteca.agregarDiario(diario1);
        sistemaBiblioteca.agregarTesis(tesis1);

        sistemaBiblioteca.prestarLibro(libro1, 3);
        sistemaBiblioteca.prestarRevista(revista1, 2);
        sistemaBiblioteca.prestarDiario(diario1);
        sistemaBiblioteca.prestarTesis(tesis1);
    }
}