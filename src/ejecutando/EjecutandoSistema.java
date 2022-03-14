/**
 * @author Daniel Miguel Vega Camargo
 */

package ejecutando;

import universidad.Carrera;
import universidad.Estudiante;

public class EjecutandoSistema {

    public static void main(String[] args) {
        Carrera ingSistemas = new Carrera(14958,"Ingeniería de sistemas");
        Carrera psicologia = new Carrera(45978,"Psicología");
        Estudiante daniel;
        Estudiante cecilia;

        ingSistemas.addAsignatura("Sistemas operativos")
                .addAsignatura("Base de datos")
                .addAsignatura("Algoritmos y programacion");

        psicologia.addAsignatura("Neurociencia")
                .addAsignatura("Comportamiento humano")
                .addAsignatura("Clinica 1");

        daniel = new Estudiante("Daniel Vega",21,ingSistemas);
        cecilia = new Estudiante("Cecilia Carrasquilla", 22, psicologia);

        imprimir(daniel);
        imprimir(cecilia);
    }

    public static void imprimir(Estudiante estudiante){
        System.out.println(String.format("Hola, me llamo %s, tengo %d años y actualmente estoy cursando la carrera de %s",
                estudiante.getNombre(),estudiante.getEdad(),estudiante.getCarrera().getNombre()));
    }
}


