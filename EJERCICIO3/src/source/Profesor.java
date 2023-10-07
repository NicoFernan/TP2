package source;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String nombre;
    private double salarioPorClase = 10.0; // Tarifa por clase
    private List<Diagramacion> clasesDictadas = new ArrayList<>();


    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioPorClase() {
        return salarioPorClase;
    }

    public List<Diagramacion> getClasesDictadas() {
        return clasesDictadas;
    }

    public void dictarClase(Diagramacion diagramacion) {
        clasesDictadas.add(diagramacion);
    }
}
