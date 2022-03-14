package universidad;

public class Estudiante {

    private String nombre;
    private Integer edad;
    private Carrera carrera;

    public Estudiante(String nombre, Integer edad, Carrera carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    //Esto no lo pidieron, pero, aun así lo hice.
    @Override
    public String toString() {
        return String.format("[Estidiante] = {Nombre: %s, Edad: %d, Carrera: %s}",this.nombre,this.edad
                ,this.carrera);
    }
}
