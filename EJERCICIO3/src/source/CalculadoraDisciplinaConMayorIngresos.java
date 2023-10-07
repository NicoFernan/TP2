package source;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraDisciplinaConMayorIngresos {
    public static String calcularDisciplinaConMayorIngresos(List<Diagramacion> diagramaciones) {
        List<DisciplinaIngresos> ingresosPorDisciplina = new ArrayList<>();

        // Calcular ingresos por disciplina sumando los importes de todas las clases de la misma disciplina
        for (Diagramacion diagramacion : diagramaciones) {
            String disciplina = diagramacion.getDisciplina();
            double importe = diagramacion.getProfesor().getSalarioPorClase() * diagramacion.getAlumnosInscritos().size();

            // Verificar si ya tenemos ingresos para esta disciplina en la lista
            boolean encontrada = false;
            for (DisciplinaIngresos disciplinaIngresos : ingresosPorDisciplina) {
                if (disciplinaIngresos.disciplina.equals(disciplina)) {
                    disciplinaIngresos.ingresos += importe;
                    encontrada = true;
                    break;
                }
            }

            // Si no se encontraron ingresos para esta disciplina, agregarla a la lista
            if (!encontrada) {
                ingresosPorDisciplina.add(new DisciplinaIngresos(disciplina, importe));
            }
        }

        // Encontrar la disciplina con los mayores ingresos
        String disciplinaConMayorIngresos = null;
        double mayorIngreso = 0.0;

        for (DisciplinaIngresos disciplinaIngresos : ingresosPorDisciplina) {
            if (disciplinaIngresos.ingresos > mayorIngreso) {
                mayorIngreso = disciplinaIngresos.ingresos;
                disciplinaConMayorIngresos = disciplinaIngresos.disciplina;
            }
        }

        return disciplinaConMayorIngresos;
    }

    // Clase auxiliar para almacenar ingresos por disciplina
    private static class DisciplinaIngresos {
        String disciplina;
        double ingresos;

        DisciplinaIngresos(String disciplina, double ingresos) {
            this.disciplina = disciplina;
            this.ingresos = ingresos;
        }
    }
}