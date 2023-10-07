package Source;

import java.util.List;

public class Tripulante extends Persona {
    private String cargo;
    private List<ReciboDeSueldo> recibos;

    public Tripulante(String nombre, String numeroTelefono, String direccion, String cargo){
        super(nombre, numeroTelefono, direccion);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}