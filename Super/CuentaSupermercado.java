    import java.util.Arrays;

    public class CuentaSupermercado {
        // Atributos
        private Producto[] productos;
        private int[] cantidades;
        private int numProductos;

        // Constructor
        public CuentaSupermercado(int cantidad) {
            productos = new Producto[cantidad];
            cantidades = new int[cantidad];
            numProductos = 0;
        }

        // Métodos
        public void agregarProducto(Producto producto, int cantidad) {
            // Rcorremos la lista de productos
            for (int i = 0; i < numProductos; i++) {
                // Comprobamos si el productor está en la lista
                if (productos[i].equals(producto)) {
                    // Añadimos el producto a la lista en la cantidad especificada
                    cantidades[i] += cantidad;
                }
            }

            // Asignamos el producto a la lista y su cantidad
            productos[numProductos] = producto;
            cantidades[numProductos] = cantidad;
            // Incrementamos el número total de productos
            numProductos++;
        }

        public double calcularPrecioTotal() {
            double precioTotal = 0;
            // Recorremos la lista de productos
            for (int i = 0; i < numProductos; i++) {
                // Agregamos el precio al acumulado, multiplicado por la cantidad total
                precioTotal += productos[i].getPrecio() * cantidades[i];
            }
            return precioTotal;
        }

        public void imprimeTicket() {
            System.out.println("TICKET");
            System.out.println("Producto\tUnidad\tPrecio Unidad\tTotal");
            System.out.println("------------------------------------------");
            for (int i = 0; i < numProductos; i++) {
                // Recorremos la lista, imprimiendo el producto, candidad, precio unitario y total en cada línea
                Producto producto = productos[i];
                int cantidad = cantidades[i];
                double totalProducto = producto.getPrecio() * cantidad;
                System.out.printf("%s\t\t%d\t%.2f\t\t%.2f%n", producto.getNombre(), cantidad, producto.getPrecio(), totalProducto);
            }
            System.out.println("------------------------------------------");
            // Imprimimos el precio de todos los productos en pantalla
            System.out.printf("Total: %.2f%n", calcularPrecioTotal());
        }

    }
