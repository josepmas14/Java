import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    // Atributos
    private String nombre;
    private double nota;
    private static List<Asignatura> asignaturas = new ArrayList<>();

    // Constructor
    public Asignatura(String nombreAsignatura, double notaAsignatura){
        nombre = nombreAsignatura;
        nota = notaAsignatura;
    }

    // Métodos
    public void setNombre(String nombreAsignatura){
        // Asignamos el nombre de la asignatura pasado al llamar el método
        nombre = nombreAsignatura;
    }

    public String getNombre(){
        // Devolvemos el nombre de la asignatura
        return nombre;
    }

    public void setNota(double calificacion){
        // Asignamos la nota de la asignatura pasada al llamar el método
        nota = calificacion;
    }

    public double getNota(){
        return nota;
    }

    public void setAsignatura(Asignatura asignatura){
        asignaturas.add(asignatura);
    }

    public List<Asignatura> getAsignatura(){
        return asignaturas;
    }

}
