package universidad;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

    private Integer codigo;
    private String nombre;
    private List<String> asignaturas;

    public Carrera(Integer codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        asignaturas = new ArrayList<String>();

    }

    public List<String> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<String> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Carrera addAsignatura(String asignatura){
        asignaturas.add(asignatura);
        return this;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsignaturasStr(){
        if(!this.asignaturas.isEmpty()) {
            return asignaturas.toString();
        }

        return "\"No hay asignaturas registradas.\"";
    }

    @Override
    public String toString() {
        return String.format("{Codigo de la carrera: %d, Nombre de la Carrera: %s, Asignaturas: %s}",this.codigo,this.nombre,this.getAsignaturasStr());
    }
}
