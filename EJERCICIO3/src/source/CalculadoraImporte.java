package source;

import java.util.List;

public class CalculadoraImporte {
    public static void calcularImportePorProfesor(List<Profesor> profesores, List<Diagramacion> diagramaciones) {
        System.out.println("\n=== Importe a pagar a los profesores ===");

        for (Profesor profesor : profesores) {
            int totalAsistencias = 0;

            for (Diagramacion diagramacion : diagramaciones) {
                if (diagramacion.getProfesor().equals(profesor)) {
                    List<Alumno> alumnosInscritos = diagramacion.getAlumnosInscritos();

                    for (Alumno alumno : alumnosInscritos) {
                        if (alumno.getAsistencia() > 0) {
                            totalAsistencias++;
                        }
                    }
                }
            }

            double importe = totalAsistencias * profesor.getSalarioPorClase();
            System.out.println("Profesor: " + profesor.getNombre());
            System.out.println("Asistencias totales: " + totalAsistencias);
            System.out.println("Importe a pagar: $" + importe);
            System.out.println();
        }
    }
}