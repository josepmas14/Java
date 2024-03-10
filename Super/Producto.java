public class Producto {
    // Atributos
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombreProducto, double precioProducto) {
        nombre = nombreProducto;
        precio = precioProducto;
    }

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreProducto) {
        nombre = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precioProducto) {
        precio = precioProducto;
    }

    public void mostrarInformacion() {
        // Muestra por pantalla información y precio del producto.
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio unitario: " + precio + "€");
    }

   
}
