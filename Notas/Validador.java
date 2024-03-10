import java.util.InputMismatchException;
import java.util.Scanner;

public class Validador {
    static Scanner scanner = new Scanner(System.in);
    
    public Validador() {
        scanner = new Scanner(System.in);
    }

    public double pideDouble(String mensaje) {
        double numero = 0.0;
        boolean siguePidiendo = true;

        // Entramos en el bucle
        while (siguePidiendo) {
            try {
                // Pedimos el valor de tipo double
                System.out.print(mensaje);
                numero = scanner.nextDouble();
                
                // Aseguramos que el número esté en el rango de notas
                if (numero < 0.0 || numero > 10.0) {
                    // Mostramos el mensaje informativo si está fuera de rango
                    System.out.println("El número proporcionado no está entre 0.0 y 10.0");
                } else {
                    // Cambiamos el valor de siguePidiendo para salir del bucle
                    siguePidiendo = false; 
                }
            } catch (InputMismatchException e) {
                // Informamos del error de formato en el número
                System.out.println("Debes escribir un número válido");
                scanner.nextLine(); 
            }

        }


        return numero;
    }
}