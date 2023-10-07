package source;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String contacto;
    private String credencial;
    private int asistencia = 0;
    private List<Diagramacion> clasesInscritas = new ArrayList<>();

    public Alumno(String nombre, String contacto, String credencial) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.credencial = credencial;
        this.asistencia = 0;
    }

    public void marcarAsistencia(){
        asistencia ++;
        System.out.println("Se le a anotado la asistencia al alumno: " + nombre );
    }
    public String getNombre() {
        return nombre;
    }

    public void imprimirAsistencias() {
        System.out.println("Asistencias de " + nombre + ": " + asistencia);
    }


    public String getContacto() {
        return contacto;
    }

    public String getCredencial() {
        return credencial;
    }

    public List<Diagramacion> getClasesInscritas() {
        return clasesInscritas;
    }

    public void inscribirseEnClase(Diagramacion diagramacion) {
        clasesInscritas.add(diagramacion);
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }
}
