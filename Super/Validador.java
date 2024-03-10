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

        // Aseguramos que haya que seguir pidiendo
        while (siguePidiendo) {
            try {
                // Pedimos un valor de tipo double
                System.out.print(mensaje);
                numero = scanner.nextDouble();
                
                // Comprobamos que el número sea positivo, por necesidades del programa
                if (numero <= 0.0) {
                    System.out.println("Introduce un número positivo.");
                } else {
                    // Cambiamos el valor de siguePidiendo para salir del bucle
                    siguePidiendo = false; 
                }
            } catch (InputMismatchException e) {
                // Informamos de que el valor introducido no es válido
                System.out.println("Debes escribir un número válido");
                scanner.nextLine(); 
            }

        }
        return numero;
    }

        public int pideEntero(String mensaje) {
            int numero = 0;
            boolean siguePidiendo = true;
    
            // Aseguramos que haya que seguir pidiendo
            while (siguePidiendo) {
                try {
                    // Pedimos un valor de tipo int
                    System.out.print(mensaje);
                    numero = scanner.nextInt();
                    
                    // Comprobamos que el número sea positivo, por necesidades del programa
                    if (numero <= 0) {
                        System.out.println("Introduce un número positivo.");
                    } else {
                        // Cambiamos el valor de siguePidiendo para salir del bucle
                        siguePidiendo = false; 
                    }
                } catch (InputMismatchException e) {
                    // Informamos de que el valor introducido no es válido
                    System.out.println("Debes escribir un número válido");
                    scanner.nextLine(); 
                }
    
            }


        return numero;
    }
}