import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Instanciamos el validador y el scanner
        Validador validador = new Validador();
        Scanner scanner = new Scanner(System.in);

        // Pedimos el número máximo de productos a introducir
        int maxProductos = validador.pideEntero("Ingrese el número máximo de productos: ");

        // Instanciamos la cuenta
        CuentaSupermercado cuenta = new CuentaSupermercado(maxProductos);

        // Inicializamos los productos en el tícket
        int productosEnTicket = 0;
        
        boolean siguePidiendo = true;
        // Aseguramos de que haya que seguir pidiendo sin exceder el máximo de productos
        while (siguePidiendo && productosEnTicket < maxProductos) {
            // Pasamos el nombre y precio del producto e instanciamos el Producto e introducimos su cantidad
            System.out.println("Ingrese el nombre del producto: ");
            String nombreProducto = scanner.nextLine();
            double precioProducto = validador.pideDouble("Ingrese el precio del producto: ");
            Producto producto = new Producto(nombreProducto, precioProducto);
            int cantidad = validador.pideEntero("Ingrese la cantidad del producto: ");
            
            // Agregamos el producto a la cuenta en su cantidad
            cuenta.agregarProducto(producto, cantidad);
            // Incrementamos el total de productos
            productosEnTicket++;

            boolean compruebaProducto = true;
            //
            while (compruebaProducto && productosEnTicket < maxProductos) {
                System.out.println("¿Hay otro producto? S/N ");
                String masProductos = scanner.nextLine();
                // Comprobamos respuestas válidas
                if (masProductos.equals("S") || masProductos.equals("s")){
                    // Cambiamos el valor de compruebaProducto para ir al inicio de la próxima línea
                    siguePidiendo = true;
                    compruebaProducto = false;
                } else if (masProductos.equals("N") || masProductos.equals("n")){
                    // Cambiamos los valores de compruebaProducto y siguePidiendo para dejar de pedir productos
                    siguePidiendo = false;
                    compruebaProducto = false;
                } else {
                    // Informamos al usuario para que ingrese un valor válido
                    System.out.println("Introduzca S para sí o N para no. ");
                    compruebaProducto = true;
                }
            }
        }
        // Imprimimos el tícket.
        cuenta.imprimeTicket();
    }
}