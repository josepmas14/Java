import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos los datos del alumno
        System.out.println("Nombre del alumno: ");
        String nombre = scanner.nextLine();

        System.out.println("Apellidos del alumno: ");
        String apellidos = scanner.nextLine();

        System.out.println("Número de asignaturas del alumno: ");
        int numAsignaturas = scanner.nextInt();
        scanner.nextLine();

        // Inicializamos la lista de asignaturas e instanciamos el validador
        List<Asignatura> asignaturas = new ArrayList<>();

        Validador validador = new Validador();

        // Recorremos las asignaturas con el valor introducido
        for (int i = 0; i < numAsignaturas; i++){
            // Pedimos el nombre y la nota de cada asignatura
            System.out.println("Nombre de la " + (i + 1) + "ª asignatura: ");
            String nombreAsigatura = scanner.nextLine();

            double notaAsignatura = validador.pideDouble("Nota de la " + (i + 1) + "ª asignatura: ");
            
            // Añadimos la asignatura y su nota a la lista
            asignaturas.add(new Asignatura(nombreAsigatura, notaAsignatura));
        }

        // Instanciamos el alumno con los valores dados
        Alumno alumno = new Alumno(nombre, apellidos, asignaturas);

        // Llamamos al método para que muestre el boletín
        alumno.mostrarBoletin();

        scanner.close();
    }

}
