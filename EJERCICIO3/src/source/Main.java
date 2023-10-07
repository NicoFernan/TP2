package source;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Alumno> listaAlumnos = new ArrayList<>();
        Academia academia = new Academia("Mi Academia");

        Profesor profesor1 = new Profesor("Hector Gomez");
        Profesor profesor2 = new Profesor("Raul Romero");

        Diagramacion diagramacion1 = new Diagramacion("Lunes", "18:00 - 20:00", "Inicial", "Salsa", profesor1);
            Diagramacion diagramacion2 = new Diagramacion("Martes", "20:00 - 22:00", "Avanzado", "Tango", profesor2);

        Alumno alumno1 = new Alumno("Nico", "nico@email.com", "Credencial1");
        Alumno alumno2 = new Alumno("Leo Messi", "mesi@gmail.com", "Credencial2");
        Alumno alumno3 = new Alumno("Guillermo Guille", "giye@gmail.com", "Credencialtres");

        academia.agregarDiagramacion(diagramacion1);
        academia.agregarDiagramacion(diagramacion2);

        diagramacion1.inscribirAlumno(alumno1);
        diagramacion1.inscribirAlumno(alumno2);
        diagramacion2.inscribirAlumno(alumno3);

        List<Profesor> profesores = new ArrayList<>();
        profesores.add(profesor1);
        profesores.add(profesor2);

        System.out.println("=== Información de la Academia ===");
        System.out.println("Nombre de la academia: " + academia.getNombre());

        System.out.println("\n=== Diagramaciones de la Academia ===");
        for (Diagramacion diagramacion : academia.getDiagramaciones()) {
            System.out.println("Día: " + diagramacion.getDia() + ", Horario: " + diagramacion.getHorario());
            System.out.println("Profesor: " + diagramacion.getProfesor().getNombre());

            System.out.println("Alumnos inscritos:");
            for (Alumno alumno : diagramacion.getAlumnosInscritos()) {
                System.out.println("- " + alumno.getNombre() + " (Credencial: " + alumno.getCredencial() + ")");
            }
            System.out.println();
        }

        System.out.println(" ");


        alumno2.marcarAsistencia();
        alumno2.marcarAsistencia();
        alumno2.marcarAsistencia();
        alumno1.marcarAsistencia();
        System.out.println(" ");
        alumno1.imprimirAsistencias();
        alumno2.imprimirAsistencias();
        alumno3.imprimirAsistencias();

        CalculadoraImporte.calcularImportePorProfesor(profesores, academia.getDiagramaciones());
        System.out.println(" ");

        String disciplinaMayorIngresos = CalculadoraDisciplinaConMayorIngresos.calcularDisciplinaConMayorIngresos(academia.getDiagramaciones());
        System.out.println("La disciplina con mayores ingresos es: " + disciplinaMayorIngresos);


    }
}