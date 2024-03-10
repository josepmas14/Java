import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class Alumno {
    // Atributos
    private String nombre;
    private String apellidos;
    private List<Asignatura> asignaturas;
    private Validador validador;

    // Constructor
    public Alumno(String nombreAlumno, String apellidosAlumno, List<Asignatura> asignaturasAlumno){
        nombre = nombreAlumno;
        apellidos = apellidosAlumno;
        asignaturas = asignaturasAlumno;
        validador = new Validador();
    }

    // Métodos
    public void setAsignatura(List <Asignatura> asignaturasAlumno){
        asignaturas = asignaturasAlumno;
    }

    public void modificaNota(String nombreAsignatura, double notaNueva){
        // Recorremos la lista de la asignatura
        for (Asignatura asignatura: asignaturas){
            // Comprobamos que la asignatura pasada como atributo sea la que estamos comparando
            if (asignatura.getNombre().equals(nombreAsignatura)){
                // Ingresamos la nueva nota
                notaNueva = validador.pideDouble("Nota nueva para la asignatura " + nombreAsignatura + ": ");
                asignatura.setNota(notaNueva);
            }
        }
    }

    public double notaMedia(){
        // Inicializamos el contador de notas
        double totalNotas = 0.0;
        // Recorremos la lista de asignaturas
        for (Asignatura asignatura: asignaturas){
            // Sumamos la nota al total
            totalNotas = totalNotas + asignatura.getNota();
        }
        // Aseguramos que la lista no esté vacía
        if (asignaturas.size() > 0){
            // Dividimos las notas por el total y devolvemos
            return totalNotas / asignaturas.size();
        }

        // Si la lista de nota está vacía, devolvemos el total sin modificar el valor inicial de 0.0
        return totalNotas; 
        
    }

    public void mostrarBoletin(){
        // Mostramos por pantalla el nombre y apellidos
        String boletin = String.format("Alumno: %s %s", nombre, apellidos);
        System.out.println(boletin);
        // Recorremos la lista de las asisgnaturas
        for (Asignatura asignatura: asignaturas){
            // Por cada asignatura mostramos su nombre y nota por pantalla
            System.out.println("Asignatura: " + asignatura.getNombre() + "\t Nota: " + asignatura.getNota());
        }
        // Mostramos por pantalla la nota media
        boletin = String.format("Nota media: %f", notaMedia());
        System.out.println(boletin);
    }
    
}



