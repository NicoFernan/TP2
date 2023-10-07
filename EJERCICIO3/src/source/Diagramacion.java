package source;

import java.util.ArrayList;
import java.util.List;

public class Diagramacion {
    private String dia;
    private String horario;
    private String nivel;
    private String disciplina;
    private Profesor profesor;
    private List<Alumno> alumnosInscritos = new ArrayList<>();

    public Diagramacion(String dia, String horario, String nivel, String disciplina, Profesor profesor) {
        this.dia = dia;
        this.horario = horario;
        this.nivel = nivel;
        this.disciplina = disciplina;
        this.profesor = profesor;
    }

    public String getDia() {
        return dia;
    }

    public String getHorario() {
        return horario;
    }

    public String getNivel() {
        return nivel;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public List<Alumno> getAlumnosInscritos() {
        return alumnosInscritos;
    }

    public void inscribirAlumno(Alumno alumno) {
        alumnosInscritos.add(alumno);
    }
}
